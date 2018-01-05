/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * Makes a new Cube object.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Cube extends Shape {
    
    /**
     * Declares the side length of the cube.
     */
    private double sideLength;
    
    /**
     * Constructs a cube object.
     * @param sideLength a double
     */
    public Cube(double sideLength) {
        super.setShapeName("Cube");
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double surfaceArea() {
        final int numOfSides = 6;
        return (sideLength * sideLength) * numOfSides;
    }

    @Override
    public String toString() {
        return super.getShapeName();
    }

}
