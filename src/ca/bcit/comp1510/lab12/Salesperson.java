/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * Salesperson.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Salesperson implements Comparable<Salesperson> {
    
    /**
     * First name.
     */
    private final String firstName;
    
    /**
     * Last name.
     */
    private final String lastName;
    
    /**
     * Total sales.
     */
    private final int totalSales;
    
    /**
     * Constructor.
     * @param first a String
     * @param last a String
     * @param totalSales an int
     */
    public Salesperson(String first, String last, int totalSales) {
        if (first.equals("") || last.equals("")) {
            throw new IllegalArgumentException();
        }
        this.firstName = first;
        this.lastName = last;
        this.totalSales = totalSales;
    }

    /**
     * Return firstname.
     * @return the firstName a string
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Return lastname.
     * @return the lastName a string
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Return totalSales.
     * @return the totalSales an int
     */
    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public int compareTo(Salesperson o) {
        //return this.getTotalSales() - o.getTotalSales();
        return o.getTotalSales() - this.getTotalSales();
    }

    @Override
    public String toString() {
        return "Sales: " + totalSales 
                + " | Name: " + firstName + " " + lastName;
    }
}
