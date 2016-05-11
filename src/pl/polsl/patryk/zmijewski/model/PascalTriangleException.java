package pl.polsl.patryk.zmijewski.model;



/**
 * Exeption class designed for incorrect height values setting etc.
 * @version 1.1.0
 * @author Patryk Żmijewski
 */
public class PascalTriangleException extends Exception {
    
    /**
     * Public constructor of the class
     */
    public PascalTriangleException()
    {
    }
    
    /**
     * Public constructor of the class specifying the specified message it throws
     * @param message - message of the exception
     */
    public PascalTriangleException(String message)
    {
	super(message);
    }
    
    
    /**
     * Public constructor of the class specifying the cause why it hass been thrown
     * @param cause - reason of the exception throw
     */
    public PascalTriangleException(Throwable cause)
    {
	super(cause);
    }
    
    
    /**
     * Public constructor of the class specifying the cause why it hass been thrown and the specified message it throws
     * @param message - message of the exception
     * @param cause - reason of the exception throw
     */
    public PascalTriangleException(String message, Throwable cause)
    {
	super(message, cause);
    }
    
}
