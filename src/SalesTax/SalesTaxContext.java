package SalesTax;

public class SalesTaxContext {

    private SalesTaxAbstract salesTaxAbstract;
    
    public SalesTaxContext(SalesTaxAbstract salesTaxAbstract) {
        this.salesTaxAbstract = salesTaxAbstract;
    }
    public void setSalesTaxAbstract(SalesTaxAbstract salesTaxAbstract) {
        this.salesTaxAbstract = salesTaxAbstract;
    }
    public SalesTaxAbstract getSalesTaxAbstract() {
        return salesTaxAbstract;
    }
    public double computeSalesTax(double amount) {
        return this.salesTaxAbstract.computeSalesTax(amount);
    }
}
