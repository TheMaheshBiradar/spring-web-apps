package com.taggy.infra;

import com.taggy.infra.model.ConfigurationStatusUrlConfiguration;
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

@SpringBootApplication
@RestController
public class HealthCheckApplication {

    //TODO - move this to services with transaction ready only MUST
    @PersistenceContext
    private EntityManager entityManager;



    public ConfigurationStatusUrlConfiguration getUserDetails() {
        ConfigurationStatusUrlConfiguration config = entityManager.find(ConfigurationStatusUrlConfiguration.class
                , new ConfigurationStatusUrlConfiguration("GOOG", "PROD", "https://google.com"));

        return config;
    }

	public static void main(String[] args) {
		SpringApplication.run(HealthCheckApplication.class, args);


	}

	@RequestMapping(path ="/health-check")
	public String healthCheck() throws IOException {

        RestTemplate restTemplate =new RestTemplate();

        return "OK";

    }


}

