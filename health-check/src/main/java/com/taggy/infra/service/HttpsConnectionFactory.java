package com.taggy.infra.service;

import org.springframework.cglib.proxy.Factory;
import org.springframework.stereotype.Component;

import javax.net.ssl.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by Mahesh on 08-10-2017.
 */
@Component
public class HttpsConnectionFactory {


    public HttpsURLConnection getHttpsConnection (final String targetUrl) throws IOException, NoSuchAlgorithmException, KeyManagementException {

        URL url=new URL(targetUrl);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setHostnameVerifier(this.createHostnameVerfierr());
        conn.setSSLSocketFactory(this.createSSLFactory());
        return conn;

    };

    private HostnameVerifier createHostnameVerfierr(){

        return new HostnameVerifier() {
            @Override
            public boolean verify(String url, SSLSession sslSession) {
                return true;
            }
        };
    }

    private SSLSocketFactory createSSLFactory() throws KeyManagementException, NoSuchAlgorithmException {
            TrustManager[] allowedTrustManagers =new TrustManager[]{new X509TrustManager(){

            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }}
        };


            final SSLContext sslContext=SSLContext.getInstance("TLS");
            sslContext.init(null,allowedTrustManagers,new SecureRandom());

            return sslContext.getSocketFactory();
    }




}
