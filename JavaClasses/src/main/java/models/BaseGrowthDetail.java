package models;

public class BaseGrowthDetail {
    /**
     * Initial value in the first month
     */
    private double initialValue;

    /**
     * Final projected value in the last projection month
     */
    private double finalProjectedValue;

    /**
     * Growth rate detail for the section
     */
    private GrowthRate growthRate;

    public double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }

    public double getFinalProjectedValue() {
        return finalProjectedValue;
    }

    public void setFinalProjectedValue(double finalProjectedValue) {
        this.finalProjectedValue = finalProjectedValue;
    }

    public GrowthRate getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(GrowthRate growthRate) {
        this.growthRate = growthRate;
    }
}
