package pl.polsl.patryk.zmijewski.model;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Class designed for Pascal's Triangle generation
 * @version 1.1.0
 * @author Patryk Żmijewski
 */
public class PascalTriangleModel {
    
    /**
     * contains the Pascal's triangle height
     */
    private int levels;
    
   
    /**
     * contains structure and values of a Pascal's triangle, obtained with the method of binomial coefficients.
     */
    private PascalTriangleStructure<BigInteger> coefficientsBinomial;
    
    /**
     * contains structure and values of a Pascal's triangle obtained with the method of nodes summation.
     */
    private PascalTriangleStructure<BigInteger> coefficientsSummation;
    
    
    
    /** 
     * Public constructor for the PascalTrianglelModel class.
    */
    public PascalTriangleModel(){ 
        this.coefficientsBinomial = new PascalTriangleStructure<>();
        this.coefficientsSummation = new PascalTriangleStructure<>();
    }
    
    
    /** 
     * Public constructor for the PascalTriangleBinomialModel class specifying height of the triangle
     * @param height argument defines height of the triangle
    */
    public PascalTriangleModel (int height){
        levels=height;
        this.coefficientsBinomial = new PascalTriangleStructure<>();
        this.coefficientsSummation = new PascalTriangleStructure<>();
    }
    
    
    /**
     * Method setting the height of the Pascal's triangle
     * @param height is passed to this.levels
     * @throws PascalTriangleException if triangle height is being set to 0 or less
     */
    public void setHeight(int height) throws PascalTriangleException {
        if(height<1){
            throw new PascalTriangleException("Invalid triangle height was set");
        }
        else{
            levels=height;
        }
        
    }
    
    public int getHeight(){
        return levels;
    }
    
    
    /**
     * Method used to get the coefficients o Pascal's triangle, obtained with the method of binomial coefficients
     * @return two-dimensional array containing Pascal's triangle coefficients
     */
    public PascalTriangleStructure<BigInteger> getBinomialCoefficients(){
        return this.coefficientsBinomial;
        
    }
    
    
    /**
     * Method used to get the coefficients o Pascal's triangle, obtained with the method of summation of the nodes
     * @return two-dimensional array containing Pascal's triangle coefficients
     */
     public PascalTriangleStructure<BigInteger> getSummationCoefficients(){
        return this.coefficientsSummation;
        
    }

    
    /**
     * Calculates the value of the element of Pascal's triangle on a specified position
     * @param rowIndex  Pascal's triangle row number starting from 0
     * @param columnIndex Pascal's triangle column number starting from 0
     * @return a pascal's triangle element calctulated according to a formula: (rowIndex!)/(columnIndex! * (rowIndex-columnIndex)!)
     */
    private BigInteger generateElement(int rowIndex, int columnIndex){
        
        BigInteger result=BigInteger.valueOf(1);
        if (columnIndex>rowIndex-columnIndex){
            columnIndex=rowIndex-columnIndex; 
        }

        
        for (int i=1, m=rowIndex; i<=columnIndex; i++, m--){
            result= result.multiply(BigInteger.valueOf(m));
            result = result.divide(BigInteger.valueOf(i));
        }
        
        
        return result;
    }
    
    
    /**
     * Makes a Pascal's triangle of defined height (when this.levels is non-zero)
     * To do that Binomial Coefficients formula is used
     */
    public void makeBinomialTriangle(){
        
        for(int rowIndex=0; rowIndex<levels; rowIndex++){
            ArrayList<BigInteger> row = new ArrayList<>();
            for(int columnIndex=0; columnIndex <= rowIndex; columnIndex++)
            {
                row.add(generateElement(rowIndex, columnIndex));
            }
            coefficientsBinomial.add(row);
        }
       
    }
    
    
    /**
     * Makes a Pascal's triangle of defined height (when this.levels is non-zero)
     * To do that summation of parent nodes is applied
     */
     public void makeSummationTriangle(){
        
        
        ArrayList<BigInteger> row = new ArrayList<>();
        
        for(int currentLevel=1;currentLevel<=levels;currentLevel++)
        {   
            ArrayList<BigInteger> currentRow = new ArrayList<>();
            if(currentLevel==1){
                currentRow.add(BigInteger.valueOf(1));
            }
           
            else{
                currentRow.add(BigInteger.valueOf(1));
                for(int count=0;count<(row.size()-1);count++){
                    currentRow.add(row.get(count).add(row.get(count+1)));   
                }
                currentRow.add(BigInteger.valueOf(1));
            }
            row = currentRow;
            coefficientsSummation.add(row);
        }
    }
   

}


