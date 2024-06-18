import java.io.BufferedReader;
import java.io.InputStreamReader;

import SalesTax.SalesTaxContext;
import SalesTax.States.California;
import SalesTax.States.Minnesota;
import SalesTax.States.NewMexico;
import SalesTax.States.NewYork;
import SalesTax.States.Texas;

public class App {
    public static void main(String[] args) throws Exception {

        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);

        double amount;

        SalesTaxContext[] salesTaxContext = {
            new SalesTaxContext(new Minnesota()),
            new SalesTaxContext(new California()),
            new SalesTaxContext(new NewYork()),
            new SalesTaxContext(new NewMexico()),
            new SalesTaxContext(new Texas())
        };
        
        try {
            System.out.print("Kindly enter amount: $");
            amount = Double.parseDouble(reader.readLine());

            for (SalesTaxContext state : salesTaxContext) {
                System.out.print("\n\nState : " + state.getSalesTaxAbstract().getClass().getSimpleName()
                    + "\nSalesTax : $" + state.computeSalesTax(amount));
            }
        } catch (Exception e) {
            throw new RuntimeException("Error occurred: " + e.getMessage());
        }
    }
}
