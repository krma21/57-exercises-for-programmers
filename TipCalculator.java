
/**
 * Solution to intro example.
 *
 * @author Karmela Alvaro
 * @version 18-08-07
 */

import java.util.Scanner; 
import java.text.DecimalFormat;

public class TipCalculator
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("$0.00"); //formatter.format(double)
        
        double billAmount = 0.0;
        double tip = 0.0;
        int tipRate = 0;
        double total = 0.0;
        
        System.out.println("What is the bill amount?");
        while (!scanner.hasNextDouble()) {
             System.out.println("Please enter valid number for bill amount ($0.00).");
             System.out.println("What is the bill amount?");
             scanner.next();
        }
        billAmount = scanner.nextDouble();
        
        System.out.println("What is the tip rate?");
        while (!scanner.hasNextInt()) {
             System.out.println("Please enter valid number for tip rate (percent).");
             System.out.println("What is the tip rate?");
             scanner.next();
        }
        tipRate= scanner.nextInt();
        
        tip = billAmount * (tipRate/100.0);
        tip = Math.round(tip*100.0) / 100.0; // round tip to nearest cent
        total = billAmount + tip;
        
        System.out.println("Tip: " + formatter.format(tip));
        System.out.println("Total: " + formatter.format(total));
        
    }
}
