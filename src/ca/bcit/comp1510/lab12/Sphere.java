package ca.bcit.comp1510.lab12;

/**
 * Makes a new Sphere object.
 *
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class Sphere extends Shape {
    
    /**
     * Declares varible radius.
     */
    private double radius;
    
    /**
     * Constructs a sphere object.
     * @param radius a double
     */
    public Sphere(double radius) {
        super.setShapeName("Sphere");
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    @Override
    public double surfaceArea() {
        final int four = 4;
        return (four * Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.getShapeName();
    }

}
