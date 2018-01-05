/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * Makes a paint can object.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public class PaintCan {
    
    /**
     * Declares variable coverage.
     */
    private double coverage;
    
    /**
     * Constructs a PaintCan object.
     * @param coverage a double
     */
    public PaintCan(double coverage) {
        if (coverage > 0) {
            this.coverage = coverage;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    /**
     * Calculates number of cans needed.
     * @param shape a Shape object.
     * @return a double
     */
    public double amount(Shape shape) {
        return shape.surfaceArea() / coverage;
    }
}
