/*
 * Peter Horne-Deus
 * NetPay.java
 * This program calculates the netpay of a person making $5 per hour
 * September 18, 2018
 */
package netpay;

/**
 *
 * @author Peter
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hours = 40;
        double wage = 5;
        double insurance = -2;
        double tax = 0.22;
        double netpay =(hours*wage-insurance)-tax*(hours*wage-insurance);
        
        System.out.println("The Net Pay of the person is " + netpay );
    }
    
}
