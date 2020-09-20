package mypackage;

/**
 * The Class Square outputs the square information
 * 
 * @author Greta Tanudjaja
 */
public class Square extends Shape
{
    // Instance variable
    private double mSide;
    
    // A constructor that invokes the base constructor (passing the color) 
    // and sets the side length instance value
    public Square(String color, double length)
    {
        super(color);
        mSide = length;
    }
    
    // An overriding method that computes and returns the Square object's
    // area value
    public double area()
    {
        return (mSide * mSide);
    }
    
    // An overriding method that returns the Square object's description
    // (color, type, measurements, and area)
    public String toString()
    {
        // Empty String 
        String result = "";
        
        // Display the result of the Square's description
        result = getColor() + " Square with side length of " + mSide
                 + " and area of " + area();

        // Return the result of the Square's description
        return result;
    }
}
