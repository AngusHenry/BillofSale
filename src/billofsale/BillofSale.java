/*
 * Angus Henry
 * BillofSale.Java
 * This program calculates and prints the bill of a shirt sale
 * 27 Feb 2018/28 Feb 2018
 */

package billofsale;

/**
 *
 * @author anhen3335
 */
public class BillofSale {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bill = 20;
        double pay = 12.49;
        double tax = 0.13;
        double taxpay = 0;
        double change = 0;
        taxpay = pay*0.13;
        change = bill - pay;
        System.out.println ("amount payed "  + bill);
        System.out.println ("The price was " + pay);
        System.out.println ("The amount fot taxes was" + taxpay);
        System.out.println ("The person paying got this amount as change "+change);
        
    }
    
    
}
