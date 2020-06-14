package com.munteandoru.app;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.munteandoru.selenium.SeleniumGridAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class HttpRequestHelper {
    private static final Logger log = LoggerFactory.getLogger(HttpRequestHelper.class);

    @Autowired
    SeleniumGridAPI seleniumGridAPI;

    @Value("http://${seleniumGridHost}/grid/api/hub")
    private String seleniumGridHost;

    public void sendRequest() {

        try {
            URL url = new URL(seleniumGridHost);

            //create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Ignore not defined properties from the selenium hub json - http://tutorials.jenkov.com/java-json/jackson-objectmapper.html
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            //read Selenium JSON and convert it to SeleniumGridAPI object
            SeleniumGridAPI customer = objectMapper.readValue(url, SeleniumGridAPI.class);

            // https://asky.io/
            log.info("Selenium slotCounts -> free: {} ¯\\_(ツ)_/¯", customer.getSlotCounts().getFree());
            log.info("Selenium slotCounts -> total: {}", customer.getSlotCounts().getTotal());
            log.info("Selenium newSessionRequestCount: {}", customer.getNewSessionRequestCount());
            //log.info(customer);

        } catch (Exception e) {
            // When eg. cannot connect to the hub
//            log.info("Cannot get data from the hub /connect to the hub", e);
            log.error("Cannot get data from the hub /connect to the hub. Hub address is {}", seleniumGridHost);
        }
    }

}
