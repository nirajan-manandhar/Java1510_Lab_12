/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * Commission.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Commission extends Hourly {

    /**
     * Total sales.
     */
    private double totalSales;
    
    /**
     * Rate.
     */
    private double rate;
    
    
    /**
     * Constructor for objects of type Hourly.
     * 
     * @param name .
     * @param address .
     * @param phone  .
     * @param sinNumber .
     * @param payRate .
     * @param comRate .
     */
    public Commission(String name, String address, 
            String phone, int sinNumber, double payRate, double comRate) {
        super(name, address, phone, sinNumber, payRate);
        rate = comRate;
        totalSales = 0.0;
    }
    
    /**
     * Adds to sales total.
     * @param sale a double
     */
    public void addSales(double sale) {
        totalSales += sale;
    }
    
    @Override
    public String toString() {
        String result = super.toString();

        result += "\nTotal sales: " + totalSales;

        return result;
    }
    
    /**
     * Pays the worker.
     * @return a double
     */
    public double pay() {
        double payment = super.pay() + (totalSales * rate);
        totalSales = 0;
        return payment;
    }


    
}














