package mypackage;

/**
 * The Class Shape outputs the shape information
 *
 * @author Greta Tanudjaja
 */
public class Shape
{
    // Instance variable
    private String mColor;
    
    // A constructor that sets the color instance value
    public Shape(String color)
    {
        mColor = color;
    }
    
    // A method that returns the object's color value
    public String getColor()
    {
        return mColor;
    }
    
    // A method that computes and returns the object's area
    public double area()
    {
        return 0.0;
    }
    
    // A method that returns the object's description (color, type,
    // measurements, and area) as a String
    public String toString()
    {
        return "generic shape";
    }
}
