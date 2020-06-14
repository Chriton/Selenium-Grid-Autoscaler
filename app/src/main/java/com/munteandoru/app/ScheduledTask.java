package com.munteandoru.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    @Autowired
    HttpRequestHelper httpRequestHelper;

    // @Scheduled(fixedDelay = 5000)
    @Scheduled(fixedRate = 5000)
    public void checkSelenium() {
        log.info("Checking...");

        // TODO - get Selenium free slots
        httpRequestHelper.sendRequest();
    }
}
