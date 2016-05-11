package pl.polsl.patryk.zmijewski.controller;


/**
 * 
 * Class desinged for program execution, consists only of a main class
 * <p>
 * Program generates the Pascal's Triangle with the use of two methods and compares thier exectuion times
 * @version 1.1.0
 * @author Patryk Żmijewski
 */
public class PascalTriangle {
    
    
    /**
     * Main method of PascalTriangle
     * @param args the command line arguments correspond to triangle's height -
     * if not given - exception handles that case
     */
    public static void main(String[] args) {

        PascalTriangleController pascal = new PascalTriangleController();

        pascal.run(args);
 
        
    }

}
