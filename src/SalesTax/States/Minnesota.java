package SalesTax.States;

import SalesTax.SalesTaxAbstract;

public class Minnesota extends SalesTaxAbstract{

    public Minnesota() {
        this.taxrate = 6.78 / 100;
    }
    @Override
    public double computeSalesTax(double amount) {
        try {
            return this.taxrate * amount;
        } catch (Exception e) {
            throw new RuntimeException("Error computing sales tax for Minnesota: " + e.getMessage());
        }
    }
}
