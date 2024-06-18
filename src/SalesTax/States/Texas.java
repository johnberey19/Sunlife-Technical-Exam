package SalesTax.States;

import SalesTax.SalesTaxAbstract;

public class Texas extends SalesTaxAbstract{

    public Texas() {
        this.taxrate = 6.25 / 100;
    }
    @Override
    public double computeSalesTax(double amount) {
        try {
            return this.taxrate * amount;
        } catch (Exception e) {
            throw new RuntimeException("Error computing sales tax for Texas: " + e.getMessage());
        }
    }
}
