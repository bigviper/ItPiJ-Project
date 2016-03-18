/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.patryk.zmijewski.model;
import pl.polsl.patryk.zmijewski.model.PascalTriangleException;
import java.util.ArrayList;
/**
 * @version 1.0.0
 * @author Patryk Żmijewski
 */
/**
 * Class designed for Pascal's Triangle generation
 */
public class PascalTriangleModel {
    /**
     * contains the Pascal's triangle height
     */
    private int levels;
    /**
     * contains Pascal's triangle, obtained with the method of binomial coefficients, structure and values
     */
    private ArrayList<ArrayList<Long>> coefficientsBinomial;
    /**
     * contains Pascal's triangle, obtained with the method of nodes summation, structure and values
     */
    private ArrayList<ArrayList<Long>> coefficientsSummation;
    
    /** 
     * Public constructor for the PascalTriangleBinomialModel class.
    */
    public PascalTriangleModel(){ 
        this.coefficientsBinomial = new ArrayList<>();
        this.coefficientsSummation = new ArrayList<>();
    }
    
    
    /** 
     * Public constructor for the PascalTriangleBinomialModel class specifying height of the triangle
     * @param height argument defines height of the triangle
    */
    public PascalTriangleModel (int height){
        levels=height;
        this.coefficientsBinomial = new ArrayList<>();
        this.coefficientsSummation = new ArrayList<>();
    }
    
    
    /**
     * Method setting the height of the Pascal's triangle
     * @param height sets this.levels
     * @throws pl.polsl.patryk.zmijewski.model.PascalTriangleException if triangle height is being set to 0 or less
     */
    public void setHeight(int height) throws PascalTriangleException {
        if(height<1){
            throw new PascalTriangleException("Invalid triangle height was set");
        }
        else{
            levels=height;
        }
        
    }
    
    
    /**
     * Method used to get the coefficients o Pascal's triangle, obtained with the method of binomial coefficients
     * @return two-dimensional array containing Pascal's triangle coefficients
     */
    public ArrayList<ArrayList<Long>> getBinomialCoefficients(){
        return this.coefficientsBinomial;
        
    }
    /**
     * Method used to get the coefficients o Pascal's triangle, obtained with the method of summation of the nodes
     * @return two-dimensional array containing Pascal's triangle coefficients
     */
     public ArrayList<ArrayList<Long>> getSummationCoefficients(){
        return this.coefficientsSummation;
        
    }
     
    
    
    /**
     * Calculates the value of the element of Pascal's triangle
     * @param n n-th row of the Pascal's triangle starting from 0
     * @param k k-th column of the Pascal's triangle starting from 0
     * @return n!/(k! * (n-k)! )
     */
    private static long generateElement(int n, int k){
        
        long result=1;
        if (k>n-k){
            k=n-k; 
        }

        
        for (int i=1, m=n; i<=k; i++, m--){
            result=result*m/i;
        }
            
        return result;
    }
    
    
    /**
     * Makes a Pascal's triangle of defined height (when this.levels is non-zero)
     * To do that Binomial Coefficients formula is used
     */
    public void makeBinomialTriangle(){
        
        for(int n=0; n<levels; n++){
            ArrayList<Long> row = new ArrayList<>();
            for(int k=0;k<=n;k++)
            {
                row.add(generateElement(n,k));
            }
            coefficientsBinomial.add(row);
        }
       
        
    }
    
    
    /**
     * Makes a Pascal's triangle of defined height (when this.levels is non-zero)
     * To do that summation of parent nodes is applied
     */
     public void makeSummationTriangle(){
        
        
        ArrayList<Long> row = new ArrayList<>();
        
        for(int currentLevel=1;currentLevel<=levels;currentLevel++)
        {   
            ArrayList<Long> currentRow = new ArrayList<>();
            if(currentLevel==1){
                currentRow.add((long)1);
            }
           
            else{
                currentRow.add((long)1);
                for(int count=0;count<(row.size()-1);count++){
                    currentRow.add(row.get(count)+row.get(count+1));   
                }
                currentRow.add((long)1);
            }
            row = currentRow;
            coefficientsSummation.add(currentLevel-1,row);
        }
    }
   
    
    
}
