package mypackage;

/**
 * The Class Circle outputs the circle information
 *
 * @author Greta Tanudjaja
 */

public class Circle extends Shape
{
    // Instance variable
    private double mRadius;
    
    // A constructor that invokes the base constructor (passing the color) 
    // and sets the radius instance value
    public Circle(String color, double radius)
    {
        super(color);
        mRadius = radius;
    }
    
    // An overriding method that computes and returns the Circle object's
    // area value
    public double area()
    {
        return (3.14159 * mRadius * mRadius);
    }
    
    // An overriding method that returns the Circle object's description
    // (color, type, measurements, and area)
    public String toString()
    {
        // Empty String 
        String result = "";
        
        // Display the result of the Circle's description
        result = getColor() + " circle with radius of " + mRadius
                 + " and area of " + area();

        // Return the result of the Circle's description
        return result;
    }
            
}
