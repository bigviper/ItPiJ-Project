package pl.polsl.patryk.zmijewski.controller;

import pl.polsl.patryk.zmijewski.view.*;
import pl.polsl.patryk.zmijewski.model.*;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Controller class desinged for  communication with the 
 * @version 1.1.0
 * @author Patryk Żmijewski
 */
public class PascalTriangleController {
    
   /**
    * An instance of a StopwatchModel used for execution times calculation.
    */
    private StopwatchModel stopwatch;
    
    /**
    * An instance of a StopwatchView used for execution times printing.
    */
    private StopwatchView stopwatchView;
     
    /**
    * An instance of a PascalTriangleModel used for Pascal's Triangles creation (with the use of two methods). 
    */
    private PascalTriangleModel triangle;
    
    /**
    * An instance of a PascalTriangleView used for Pascal's Triangles and error information prinitng.
    */
    private PascalTriangleView triangleView;
    
    /**
     * Height recived from the user through input parameters or input stream, which is further passed to PascalTriangleModel.levels .
     */
    private int height;
    
    /**
     * Public constructor of a PascalTriangleContorller.
     * Consists of public constructors of objects instantiated in the private fields.
     * That constuctor is used in a main method.
     */
    public PascalTriangleController(){
        this.stopwatch = new StopwatchModel();
        this.stopwatchView = new StopwatchView();
        
        this.triangle = new PascalTriangleModel();
        this.triangleView = new PascalTriangleView();
        
        height =0;
    }
    
    /**
     * Checks if one parameter (correct number) is passed to the program.
     * @param args table of parameters passed to the program from the console in form of strings
     * @throws PascalTriangleException if the table of parameters is empty or bigger than 1 element
     */
    private void checkParameters(String[] args) throws PascalTriangleException{
        if(args.length>1 || args.length<1){
            
            throw new PascalTriangleException("Invalid number of input parameters.");
        }
        
    }
  
    /**
     * Assigns height of a PascalTriangleController instance to  PascalTriangleModel.levels of the same instance and catches exceptions.
     * @return true is the assignmet was performed correctly, false if an exception was caught and assignment was incorrect.
     */
    private boolean setPascalTriangleModelHeight(){
        try{
            this.triangle.setHeight(this.height);
            return true;
        }
        catch(PascalTriangleException e){
            this.triangleView.printErrorInformation(2);
            return false;
 
        }
    }
    
    /**
     * Assigns height to PascalTriangleController from input stream.
     */
    private void setHeightInputStream(){
  
        boolean isCorrect = false;
        
        while(!isCorrect){
            try{
                Scanner scanner = new Scanner(System.in);
                this.height = scanner.nextInt();
                isCorrect = setPascalTriangleModelHeight();
      
            }
            catch(InputMismatchException e){
                this.triangleView.printErrorInformation(1);
                isCorrect = false;
            }
        }
        
    }
    
    /**
     * Assigns height to PascalTriangleController from input parameter passed to the program in the console.
     * @param args table of parameters passed to the program from the console in form of strings
     */
    private void setHeightArgs(String[] args){

        boolean isCorrect;
        this.height = Integer.parseInt(args[0]);

        isCorrect = setPascalTriangleModelHeight();
        
        if(!isCorrect){
            this.setHeightInputStream();
        }   
   
    }
    /**
     * Public method designed for public execution. Uses private methods of PascalTriangleContorller and handles
     * the exceptions that occur if wrong parameters are passed to the program.
     * <p>
     * In finally block two Pascal's triangles with the use of two methods are generated.
     * Their structres and execution times are printed.
     * @param args table of parameters passed to the program from the console in form of strings
     */
    public void run(String[] args){
   
        try{
            this.checkParameters(args);
            
            this.setHeightArgs(args);
        }
        catch(NumberFormatException e){
            triangleView.printErrorInformation(1);
            
            this.setHeightInputStream();
        }
        catch(PascalTriangleException e){
            triangleView.printErrorInformation(3);
            
            this.setHeightInputStream();
        }
        finally{
            stopwatch.start();
            triangle.makeSummationTriangle();
            stopwatch.stop();
        
            triangleView.printStructure(1, triangle.getSummationCoefficients());
            stopwatchView.printElapsedTime(stopwatch.getDuration());
        
        
        
            stopwatch.start();
            triangle.makeBinomialTriangle();
            stopwatch.stop();
        
            triangleView.printStructure(2, triangle.getBinomialCoefficients());
            stopwatchView.printElapsedTime(stopwatch.getDuration());
            
           
                    
        }
    }
}
