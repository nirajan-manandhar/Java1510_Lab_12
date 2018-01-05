/**
 * 
 */
package ca.bcit.comp1510.lab12;

import java.util.Arrays;

/**
 * Weekly sales.
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class WeeklySales {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int seven = 7;
        final int t = 72;
        final int o = 100;
        final int th = 34;
        Salesperson s = new Salesperson("a", "z", 1);
        Salesperson s1 = new Salesperson("b", "z", 2);
        Salesperson s2 = new Salesperson("c", "z", three);
        Salesperson s3 = new Salesperson("John", "Doe", four);
        Salesperson s4 = new Salesperson("Tina", "Chaching", five);
        Salesperson s5 = new Salesperson("f", "z", six);
        Salesperson s6 = new Salesperson("g", "z", seven);
        Salesperson s7 = new Salesperson("h", "z", t);
        Salesperson s8 = new Salesperson("i", "z", o);
        Salesperson s9 = new Salesperson("j", "z", th);
        
        Salesperson[] salesArray = {s, s1, s2, s3, s4, s5, s6, s7, s8, s9};
        Arrays.sort(salesArray);
        
        System.out.println("Most to least sales, ranked:");
        
        for (int x = 0; x < salesArray.length; x++) {
            System.out.println(salesArray[x]);
        }

    }

}
