package pl.polsl.patryk.zmijewski.view;

import pl.polsl.patryk.zmijewski.model.PascalTriangleStructure;


/**
 * 
 * Class designed for presentation of the structure of Pascal's triangle
 * @version 1.1.0
 * @author Patryk Żmijewski
 */
public class PascalTriangleView {

    /**
     * Public constructor for the PascalTriangleView class
     */
    public PascalTriangleView(){

    }
   
    /**
    * Designed to print Pascal's triangle content.
    * @param pascalTriangle data structure of PascalTriangleStructure of any type and any size.
    * @param mode varaible used in switch-case value 1 points to a summation of nodes method, 
    * 2 points to binomial coefficients method.
    */
    public void printStructure(int mode, PascalTriangleStructure pascalTriangle){
        
        switch (mode){
            case 1:{
                System.out.println("Summation of parent nodes method: ");
                break;
            }
            case 2:{
                System.out.println("Binomial coefficients method: ");
                break;
            }
        }
        for(Object row : pascalTriangle){
            System.out.println(row);
        }
    }
    /**
     * Method used to print out the error onformation.
     * @param mode used in switch-case: 1 - points to wrong data format error, 
     * 2 - points to invalid height of the triangle, 
     * 3 - points to wrong number of parameters passed to the program.
     */
    public void printErrorInformation(int mode){
        
        switch(mode){
            
            case 1:{
                System.out.println("Invalid data format. Please type in the height of the triangle:");
                break;
            }
            case 2:{
                System.out.println("Invalid height of the triangle. Please type in the height of the triangle again: ");
                break;
            }
            case 3:{
                System.out.println("Invalid number of parameters passed to the program. Please type in the height of the triangle:");
                break;
            }
            
            
        }
    }
   
}
