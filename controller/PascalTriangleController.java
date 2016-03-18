/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.polsl.patryk.zmijewski.controller;


import pl.polsl.patryk.zmijewski.view.*;
import pl.polsl.patryk.zmijewski.model.*;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * @version 1.0.0
 * @author Patryk Żmijewski
 */
/*REPORT
requirements on the platform
Should contain /bat
                    /jar  /bat
                /doc
                    /javadoc
                /src
                    /packages
firtsname.lastname.1.zip ->to platform
*/

/**
 * 
 * Class desinged for communication with the user and program execution
 * <p>
 * Generates the Pascal's Triangle with the use of two methods and compares thier exectuion times
 */
public class PascalTriangleController {
    
    
    /**
     * Main method of PascalTriangleController

     * 1st method - Binomial coefficients method
     * 2nd method - Summation of parent nodes
     * 
     * @param args the command line arguments correspond to triangle's height -
     * if not given - exception handles that case
     */
    public static void main(String[] args) {
        StopwatchModel stopwatch = new StopwatchModel();
        StopwatchView stopwatchView = new StopwatchView();
        
        PascalTriangleModel triangle = new PascalTriangleModel();
        PascalTriangleView triangleView = new PascalTriangleView();
        int height=0;
        boolean isCorrect = false;
        
        
        try{
            height=Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid data format. Please type in the height of the triangle:");
            
            while(!isCorrect){
                 try{
                    Scanner scanner = new Scanner(System.in);
                    height=scanner.nextInt();
                    try{
                        triangle.setHeight(height);
                        isCorrect=true;
                    }
                    catch(PascalTriangleException r){
                        //r.printStackTrace();
                        System.out.println("Please try again: ");
                        isCorrect=false;
                    }
                    
                }
                catch(InputMismatchException t){
                    System.out.println("Invalid data format. Please try again: ");
                    isCorrect=false;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException w){
            System.out.println("No data delivered. Please type in the height of the triangle:");
             
            
            while(!isCorrect){
                try{
                    
                    Scanner scanner = new Scanner(System.in);
                    height=scanner.nextInt();
                    try{
                        triangle.setHeight(height);
                        isCorrect=true;
                    }
                    catch(PascalTriangleException r){
                        isCorrect=false;
                        System.out.println("Invalid height of the triangle. Please try again: ");
                    }
                }
                catch(InputMismatchException n){
                    isCorrect=false;
                    System.out.println("Invalid data format. Please try again: ");
                    
                }
            }
        }
        //i think that finally block is not necessary - wywal go potem :)
        finally{
            while(!isCorrect){
                try{
                    triangle.setHeight(height);
                    isCorrect=true;
                }
                catch(PascalTriangleException y){
                    isCorrect=false;
                    System.out.println("Invalid height of the triangle. Please try again: ");
                    boolean isCorrect2=false;
                    while(!isCorrect2){
                        try{
                            Scanner scanner = new Scanner(System.in);
                            height=scanner.nextInt();
                            isCorrect2=true;
                        }
                        catch(InputMismatchException u){
                            System.out.println("Invalid data format. Please try again: ");
                            isCorrect2=false;
                       }
                    }
                }
                
            }
        }
       
        
        
        
        
       System.out.println("Summation of parent nodes:");
       stopwatch.start();
       triangle.makeSummationTriangle();
       stopwatch.stop();
       triangleView.printOut(triangle.getSummationCoefficients());
       stopwatchView.printElapsedTime(stopwatch.getDuration());
        
        
       System.out.println("Binomial coefficients method:");
       stopwatch.start();
       triangle.makeBinomialTriangle();
       stopwatch.stop();
       triangleView.printOut(triangle.getBinomialCoefficients());
       stopwatchView.printElapsedTime(stopwatch.getDuration());
       
        
    }
    
}
