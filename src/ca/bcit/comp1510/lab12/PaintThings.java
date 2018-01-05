/**
 * 
 */
package ca.bcit.comp1510.lab12;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculates how many cans of paint are required
 * to paint the given objects.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class PaintThings {

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How much coverage does one can provide?");
        double coverage = scan.nextDouble();
        
        PaintCan can1 = new PaintCan(coverage);
        
        System.out.println("We are making a cube, "
                + "\nWhat is the side length of the cube?");
        double sideLength = scan.nextDouble();
        
        System.out.println("We are making a sphere, "
                + "\nWhat is the radius of the sphere?");
        double sphereRadius = scan.nextDouble();
        
        System.out.println("We are making a cylinder, "
                + "\nWhat is the radius and height"
                + "of the cylinder?");
        
        double cRadius = scan.nextDouble();
        double height = scan.nextDouble();
        double totalCans = 0;
        
        Cube cube1 = new Cube(sideLength);
        totalCans += can1.amount(cube1);
        
        Sphere sphere1 = new Sphere(sphereRadius);
        totalCans += can1.amount(sphere1);
        
        Cylinder c1 = new Cylinder(cRadius, height);
        totalCans += can1.amount(c1);
        
        DecimalFormat fmt = new DecimalFormat("#.00");
        
        System.out.println("You need " + fmt.format(totalCans) 
        + " cans of paint.\nYou should buy " + Math.ceil(totalCans) 
        + " cans of paint.");
        scan.close();
    }

}
