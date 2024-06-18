package SalesTax.States;

import SalesTax.SalesTaxAbstract;

public class NewMexico extends SalesTaxAbstract{

    public NewMexico() {
        this.taxrate = 5.125 / 100;
    }
    @Override
    public double computeSalesTax(double amount) {
        try {
            return this.taxrate * amount;
        } catch (Exception e) {
            throw new RuntimeException("Error computing sales tax for New Mexico: " + e.getMessage());
        }
    }
}
