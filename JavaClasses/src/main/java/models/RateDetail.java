package models;

import java.util.List;

public class RateDetail {
    /**
     * List of months related
     */
    private List<String> months;

    /**
     * Calculated rate for the months
     */
    private double rate;

    public List<String> getMonths() {
        return months;
    }

    public void setMonths(List<String> months) {
        this.months = months;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
