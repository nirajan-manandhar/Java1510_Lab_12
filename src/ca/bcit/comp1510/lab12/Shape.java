/**
 * 
 */
package ca.bcit.comp1510.lab12;

/**
 * Abstract parent class.
 * 
 * @author Nirajan Manandhar
 * @version 1.0
 *
 */
public abstract class Shape {
    
    /**
     * Declares String for name of a shape.
     */
    private String shapeName;
    
    /**
     * Calculates surface area.
     * @return a double.
     */
    public abstract double surfaceArea();
    
    /**
     * Returns a string with 
     * information about the shape.
     * @return a String
     */
    public abstract String toString();

    /**
     * Gets the shapes name.
     * @return the shapeName as a string.
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * Sets the shape name.
     * @param shapeName the shapeName to set
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

}
