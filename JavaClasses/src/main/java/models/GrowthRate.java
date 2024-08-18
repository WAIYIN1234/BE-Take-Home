package models;

public class GrowthRate {
    /**
     * Minimum growth rate and related month(s)
     */
    private RateDetail minimum;

    /**
     * Maximum growth rate and related month(s)
     */
    private RateDetail maximum;

    /**
     * Average growth rate in percentage
     */
    private double average;

    /**
     * Total growth rate in percentage
     */
    private double total;

    public RateDetail getMinimum() {
        return minimum;
    }

    public void setMinimum(RateDetail minimum) {
        this.minimum = minimum;
    }

    public RateDetail getMaximum() {
        return maximum;
    }

    public void setMaximum(RateDetail maximum) {
        this.maximum = maximum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

