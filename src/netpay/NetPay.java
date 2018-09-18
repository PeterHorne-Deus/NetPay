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
        double h = 40;
        double w = 5;
        double i = -2;
        double t = 0.22;
        double n =(h*w-i)-t*(h*w-i);
        
        System.out.println("The Net Pay of the person is " + n );
    }
    
}
