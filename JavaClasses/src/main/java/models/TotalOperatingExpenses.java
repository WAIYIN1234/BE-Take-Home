package models;

public class TotalOperatingExpenses {
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

    /**
     * Subsection's expenses data
     */
    private BreakdownExpenses breakdown;

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

    public BreakdownExpenses getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(BreakdownExpenses breakdown) {
        this.breakdown = breakdown;
    }
}