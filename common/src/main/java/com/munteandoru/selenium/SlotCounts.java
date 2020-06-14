package com.munteandoru.selenium;

public class SlotCounts {
    private int free;
    private int total;

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "{" +
                "free = '" + free + '\'' +
                ", total = '" + total + '\'' +
                '}';
    }
}
