package ca.bcit.comp1510.lab12;


/**
 * Staff.
 *
 * @author BCIT
 * @version 2017
 */
public class Staff {
    
    public static final int STAFF_SIZE = 8;
    
    private StaffMember[] staffList;

    /**
     * Constructor for objects of type Staff.
     */
    public Staff() {
        staffList = new StaffMember[STAFF_SIZE];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", 123456789, 2423.07);
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", 123456789, 1246.15);
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", 123456789, 1169.23);
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", 123456789, 10.55);
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        staffList[6] = new Commission("Hulk", "999 Anger Ave.", "555-9999", 123456789, 30.00, 0.05);
        staffList[7] = new Commission("Thor", "222 Space Ave.", "555-2222", 123456789, 10.00, 0.2);
        
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        
        ((Commission) staffList[6]).addHours(20);
        ((Commission) staffList[6]).addSales(2000);
        
        ((Commission) staffList[7]).addHours(35);
        ((Commission) staffList[7]).addSales(500);

        }

    /**
     * Pays staff members.
     */
    public void payday() {
        for (int count = 0; count < staffList.length; count++) {
            System.out.println(" ");
            System.out.println(staffList[count]);
            double amount = staffList[count].pay(); // polymorphic
            System.out.println(staffList[count] + " Paid: " + amount);
        }
    }
}
