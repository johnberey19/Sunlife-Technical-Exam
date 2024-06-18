package SalesTax.States;

import SalesTax.SalesTaxAbstract;

public class NewYork extends SalesTaxAbstract{

    public NewYork() {
        this.taxrate = 4.0 / 100;
    }
    @Override
    public double computeSalesTax(double amount) {
        try {
            return this.taxrate * amount;
        } catch (Exception e) {
            throw new RuntimeException("Error computing sales tax for New York: " + e.getMessage());
        }
    }
}
