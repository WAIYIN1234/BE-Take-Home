package models;

public class BreakdownSales {
    /**
     * Subsection of Product Sales
     */
    private SalesDetail productSales;

    /**
     * Subsection of Service Sales
     */
    private SalesDetail serviceSales;

    public SalesDetail getProductSales() {
        return productSales;
    }

    public void setProductSales(SalesDetail productSales) {
        this.productSales = productSales;
    }

    public SalesDetail getServiceSales() {
        return serviceSales;
    }

    public void setServiceSales(SalesDetail serviceSales) {
        this.serviceSales = serviceSales;
    }
}
