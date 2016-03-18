/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.patryk.zmijewski.view;

import java.util.ArrayList;


/**
 * @version 1.0.0
 * @author Patryk Żmijewski
 */
/**
 * 
 * Class designed for presentation of the structure of Pascal's triangle
 */
public class PascalTriangleView {

    /**
     * Public constructor for the PascalTriangleView class
     */
    public PascalTriangleView(){

    }
    
    /**
    * Designed to print Pascal's triangle content
    * @param PasTri two-dimenstional ArrayList of type Long and any size 
    */
    public void printOut(ArrayList<ArrayList<Long>> PasTri){
        ArrayList<ArrayList<Long>> triangle = new ArrayList<>();
        triangle=PasTri;
        for(ArrayList<Long> row : triangle){
            System.out.println(row);
        }
    }
   
}
