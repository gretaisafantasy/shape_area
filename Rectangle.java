package mypackage;

/**
 * The Class Rectangle outputs the rectangle information
 * 
 * @author Greta Tanudjaja
 */

public class Rectangle extends Shape
{
    // Instance variables
    private double mWidth;
    private double mLength;
    
    // A constructor that invokes the base constructor (passing the color) 
    // and sets the width and length instance value
    public Rectangle(String color, double width, double length)
    {
        super(color);
        mWidth = width;
        mLength = length;
    }
    
    // An overriding method that computes and returns the Rectangle object's
    // area value
    public double area()
    {
        return (mWidth * mLength);
    }
    
    // An overriding method that returns the Rectangle object's description
    // (color, type, measurements, and area)
    public String toString()
    {
        // Empty String 
        String result = "";
        
        // Display the result of the Rectangle's description
        result = getColor() + " Rectangle with length of " + mWidth
                 + " width of " + mLength + " and area of " + area();

        // Return the result of the Rectangle's description
        return result;
    }
}
