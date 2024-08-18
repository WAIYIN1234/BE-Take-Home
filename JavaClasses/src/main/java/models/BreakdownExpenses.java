package models;

public class BreakdownExpenses {
    /**
     * Subsection of Cost of Good Sold
     */
    private ExpenseDetail costOfGoodsSold;

    /**
     * Subsection of Marketing
     */
    private ExpenseDetail marketing;

    /**
     * Subsection of Staff Salaries
     */

    private ExpenseDetail staffSalaries;
    public ExpenseDetail getCostOfGoodsSold() {
        return costOfGoodsSold;
    }

    public void setCostOfGoodsSold(ExpenseDetail costOfGoodsSold) {
        this.costOfGoodsSold = costOfGoodsSold;
    }

    public ExpenseDetail getMarketing() {
        return marketing;
    }

    public void setMarketing(ExpenseDetail marketing) {
        this.marketing = marketing;
    }

    public ExpenseDetail getStaffSalaries() {
        return staffSalaries;
    }

    public void setStaffSalaries(ExpenseDetail staffSalaries) {
        this.staffSalaries = staffSalaries;
    }
}
