/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * Makes a new cylinder.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Cylinder extends Shape {
    
    /**
     * Declares variable radius.
     */
    private double radius;
    
    /**
     * Declares variable height.
     */
    private double height;
    
    /**
     * Constructs a cylinder object.
     * @param radius a double
     * @param height a double
     */
    public Cylinder(double radius, double height) {
        super.setShapeName("Cylinder");
        if (radius > 0 || height > 0) {
            this.radius = radius;
            this.height = height;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double surfaceArea() {
        return ((2 * Math.PI * radius * height) 
                + (2 * Math.PI * radius * radius));
    }

    @Override
    public String toString() {
        return super.getShapeName();
    }

}
