package SalesTax.States;

import SalesTax.SalesTaxAbstract;

public class California extends SalesTaxAbstract{

    public California() {
        this.taxrate = 6.5 / 100;
    }
    @Override
    public double computeSalesTax(double amount) {
        try {
            return this.taxrate * amount;
        } catch (Exception e) {
            throw new RuntimeException("Error computing sales tax for California: " + e.getMessage());
        }
    }

}
