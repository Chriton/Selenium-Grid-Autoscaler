package com.munteandoru.selenium;

import org.springframework.stereotype.Component;

@Component
public class SeleniumGridAPI {

    private String debug;
    private String host;
    private int newSessionRequestCount;
    private SlotCounts slotCounts;

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getNewSessionRequestCount() {
        return newSessionRequestCount;
    }

    public void setNewSessionRequestCount(int newSessionRequestCount) {
        this.newSessionRequestCount = newSessionRequestCount;
    }

    public SlotCounts getSlotCounts() {
        return slotCounts;
    }

    public void setSlotCounts(SlotCounts slotCounts) {
        this.slotCounts = slotCounts;
    }

    @Override
    public String toString() {
        return "Selenium Hub Status {" +
                "debug = " + debug + '\'' +
                ", host = '" + host + '\'' +
                ", newSessionRequestCount = '" + newSessionRequestCount + '\'' +
                ", slotCounts = '" + slotCounts + '\'' +
                '}';
    }
}
