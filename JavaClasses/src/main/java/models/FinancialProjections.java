package models;

public class FinancialProjections {
    /**
     * Number of months included in the Excel file
     */
    private int numberOfMonths;

    /**
     * Summary of total sales section
     */
    private TotalSales totalSales;

    /**
     * Summary of total operating expenses section
     */
    private TotalOperatingExpenses totalOperatingExpenses;

    /**
     * Summary of net income section
     */
    private NetIncome netIncome;

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public TotalSales getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(TotalSales totalSales) {
        this.totalSales = totalSales;
    }

    public TotalOperatingExpenses getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    public void setTotalOperatingExpenses(TotalOperatingExpenses totalOperatingExpenses) {
        this.totalOperatingExpenses = totalOperatingExpenses;
    }

    public NetIncome getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(NetIncome netIncome) {
        this.netIncome = netIncome;
    }
}
