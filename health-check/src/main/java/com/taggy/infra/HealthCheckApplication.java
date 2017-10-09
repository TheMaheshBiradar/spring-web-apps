package com.taggy.infra;

import com.taggy.infra.model.ConfigurationStatusUrlConfiguration;
import com.taggy.infra.service.HttpsConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HttpsURLConnection;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@RestController
public class HealthCheckApplication {



    @Autowired
    HttpsConnectionFactory httpsConnectionFactory;

    //TODO - move this to services with transaction ready only MUST
    @PersistenceContext
    private EntityManager entityManager;



    public ConfigurationStatusUrlConfiguration getComponentDetails() {
        ConfigurationStatusUrlConfiguration config = entityManager.find(ConfigurationStatusUrlConfiguration.class
                , new ConfigurationStatusUrlConfiguration("GOOG", "PROD", "https://google.com"));

        return config;
    }

	public static void main(String[] args) {
		SpringApplication.run(HealthCheckApplication.class, args);


	}

	@RequestMapping(path ="/health-check")
	public String healthCheck() throws IOException {

        /* RestTemplate restTemplate =new RestTemplate
        (); */

        ConfigurationStatusUrlConfiguration getComponentDetail = this.getComponentDetails();
        StringBuilder status =new StringBuilder("Component : ");

        status.append(getComponentDetail.getComponentId());
        status.append(" ");
        status.append(" Status");

        try {
            HttpsURLConnection httpsConnection = httpsConnectionFactory.getHttpsConnection(getComponentDetail.getUrl());
            InputStream inputStream = httpsConnection.getInputStream();
            //set timeout for socket and read as we can not wait till end
            //todo read json from manifest response
            status.append(httpsConnection.getResponseCode());

        } catch (Exception e) {
            status.append("NOK");

        }


        return status.toString();

    }


}

