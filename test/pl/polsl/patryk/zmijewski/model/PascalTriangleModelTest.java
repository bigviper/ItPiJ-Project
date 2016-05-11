package pl.polsl.patryk.zmijewski.model;

import java.math.BigInteger;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Testing class with methods designed for testing of PascalTriangleModel methods.
 * @author Patryk Żmiewski
 * @verison 1.2.0
 */
public class PascalTriangleModelTest {
    
    /**
     *
     */
    public PascalTriangleModelTest() {
    }
    
    /**
     * Test of setHeight method, of class PascalTriangleModel with correct parameter.
     * @throws PascalTriangleException if value of height lower or equal to 0.
     */
    @Test
    public void testSetHeight() throws PascalTriangleException {
        System.out.println("Test of setHeight method when the height is positive");
        int height = 10;
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("Result of height setting: ",height, instance.getHeight());
    }

    /**
     * Test of setHeight method, of class PascalTriangleModel with 0 height.
     * @throws PascalTriangleException if value of height lower or equal to 0.
     */
    @Test (expected = PascalTriangleException.class)
    public void testSetHeightEqualZero() throws PascalTriangleException {
        System.out.println("Test of setHeight method when the height is zero");
        int height = 0;
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("Should throw PascalTriangleException.");
    }
    
    /**
     * Test of setHeight method, of class PascalTriangleModel with negative height.
     * @throws PascalTriangleException if value of height lower or equal to 0.
     */
    @Test (expected = PascalTriangleException.class)
    public void testSetHeightEqualNegative() throws PascalTriangleException {
        System.out.println("Test of setHeight method when the height is negative");
        int height = -5;
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("Should throw PascalTriangleException.");
    }

    /**
     * Test of getBinomialCoefficients method, of class PascalTriangleModel.
     * Checks the content of 10th row and if getter returns correct data type.
     * @throws PascalTriangleException if improper height was set
     */
    @Test
    public void testGetBinomialCoefficients() throws PascalTriangleException {
        System.out.println("Test of getBinomialCoefficients method");
        PascalTriangleModel instance = new PascalTriangleModel();
        boolean flag = false;
        instance.setHeight(10);
        instance.makeBinomialTriangle();
       
        ArrayList<BigInteger> result = instance.getBinomialCoefficients().get(9);
        
        ArrayList<BigInteger> expResult = new ArrayList<>();
        
        expResult.add(BigInteger.ONE);
        expResult.add(BigInteger.valueOf(9));
        expResult.add(BigInteger.valueOf(36));
        expResult.add(BigInteger.valueOf(84));
        expResult.add(BigInteger.valueOf(126));
        expResult.add(BigInteger.valueOf(126));
        expResult.add(BigInteger.valueOf(84));
        expResult.add(BigInteger.valueOf(36));
        expResult.add(BigInteger.valueOf(9));
        expResult.add(BigInteger.ONE);
        
       if("pl.polsl.patryk.zmijewski.model.PascalTriangleStructure".equals(instance.getBinomialCoefficients().getClass().getName())&& result.equals(expResult)){
           flag=true;
       }
        
        
        assertEquals("Result of the class name check and proper content of 10th row ",true, flag);

    }

    /**
     * Test of getSummationCoefficients method, of class PascalTriangleModel.
     * Checks the content of 10th row and if getter returns correct data type.
     * @throws PascalTriangleException if improper height was set
     */
    @Test
    public void testGetSummationCoefficients() throws PascalTriangleException{
        System.out.println("Test of getSummationCoefficients method");
        PascalTriangleModel instance = new PascalTriangleModel();
        boolean flag = false;
        instance.setHeight(10);
        instance.makeSummationTriangle();
       
        ArrayList<BigInteger> result = instance.getSummationCoefficients().get(9);
        
        ArrayList<BigInteger> expResult = new ArrayList<>();
        
        expResult.add(BigInteger.ONE);
        expResult.add(BigInteger.valueOf(9));
        expResult.add(BigInteger.valueOf(36));
        expResult.add(BigInteger.valueOf(84));
        expResult.add(BigInteger.valueOf(126));
        expResult.add(BigInteger.valueOf(126));
        expResult.add(BigInteger.valueOf(84));
        expResult.add(BigInteger.valueOf(36));
        expResult.add(BigInteger.valueOf(9));
        expResult.add(BigInteger.ONE);
        
       if("pl.polsl.patryk.zmijewski.model.PascalTriangleStructure".equals(instance.getSummationCoefficients().getClass().getName())&& result.equals(expResult)){
           flag=true;
       }
        
        
        assertEquals("Result of the class name check and proper content of 10th row ",true, flag);
    }

    /**
     * Test of makeBinomialTriangle method, of class PascalTriangleModel.
     * @throws PascalTriangleException if improper height was set
     */
    @Test
    public void testMakeBinomialTriangle() throws PascalTriangleException{
        System.out.println("Test of makeBinomialTriangle method v1");
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(5);
        instance.makeBinomialTriangle();
        
        ArrayList<BigInteger> rowOne = new ArrayList<>();
        ArrayList<BigInteger> rowTwo = new ArrayList<>();
        ArrayList<BigInteger> rowThree = new ArrayList<>();
        ArrayList<BigInteger> rowFour = new ArrayList<>();
        ArrayList<BigInteger> rowFive = new ArrayList<>();
        ArrayList<BigInteger> rowSix = new ArrayList<>();
        PascalTriangleStructure<BigInteger> triangle = new PascalTriangleStructure();
        
        rowOne.add(BigInteger.ONE);
        
        rowTwo.add(BigInteger.ONE);
        rowTwo.add(BigInteger.ONE);
        
        rowThree.add(BigInteger.ONE);
        rowThree.add(BigInteger.valueOf(2));
        rowThree.add(BigInteger.ONE);
                
        rowFour.add(BigInteger.ONE);
        rowFour.add(BigInteger.valueOf(3));
        rowFour.add(BigInteger.valueOf(3));
        rowFour.add(BigInteger.ONE);
        
        rowFive.add(BigInteger.ONE);
        rowFive.add(BigInteger.valueOf(4));
        rowFive.add(BigInteger.valueOf(6));
        rowFive.add(BigInteger.valueOf(4));
        rowFive.add(BigInteger.ONE);
        
        rowSix.add(BigInteger.ONE);
        rowSix.add(BigInteger.valueOf(5));
        rowSix.add(BigInteger.valueOf(10));
        rowSix.add(BigInteger.valueOf(10));
        rowSix.add(BigInteger.valueOf(5));
        rowSix.add(BigInteger.ONE);
        
        triangle.add(rowOne);
        triangle.add(rowTwo);
        triangle.add(rowThree);
        triangle.add(rowFour);
        triangle.add(rowFive);
        triangle.add(rowSix);
        
        boolean flag = false;
        
        for(int i =0;i<instance.getHeight();i++){
            if(instance.getBinomialCoefficients().get(i).equals(triangle.get(i))){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        assertEquals("Result of binomial triangle generation: ",true, flag);
    }
    
    /**
     * Test of makeBionomialTriangle method, of class PascalTriangleModel, 
     * Checks the content of 50th row
     * @throws PascalTriangleException if improper height was set
     */
    @Test
    public void testMakeBinomialTriangle50thRow() throws PascalTriangleException{
        System.out.println("Test of makeBinomialTriangle method v2");
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(50);
        instance.makeBinomialTriangle();
        
        ArrayList<BigInteger> row50= new ArrayList<>();
        
      
        row50.add(new BigInteger("1"));
        row50.add(new BigInteger("49"));
        row50.add(new BigInteger("1176"));
        row50.add(new BigInteger("18424"));
        row50.add(new BigInteger("211876"));
        row50.add(new BigInteger("1906884"));
        row50.add(new BigInteger("13983816"));
        row50.add(new BigInteger("85900584"));
        row50.add(new BigInteger("450978066"));
        row50.add(new BigInteger("2054455634"));
        row50.add(new BigInteger("8217822536"));
        row50.add(new BigInteger("29135916264"));
        row50.add(new BigInteger("92263734836"));
        row50.add(new BigInteger("262596783764"));
        row50.add(new BigInteger("675248872536"));
        row50.add(new BigInteger("1575580702584"));
        row50.add(new BigInteger("3348108992991"));
        row50.add(new BigInteger("6499270398159"));
        row50.add(new BigInteger("11554258485616"));
        row50.add(new BigInteger("18851684897584"));
        row50.add(new BigInteger("28277527346376"));
        row50.add(new BigInteger("39049918716424"));
        row50.add(new BigInteger("49699896548176"));
        row50.add(new BigInteger("58343356817424"));
        row50.add(new BigInteger("63205303218876"));
        row50.add(new BigInteger("63205303218876"));
        row50.add(new BigInteger("58343356817424"));
        row50.add(new BigInteger("49699896548176"));
        row50.add(new BigInteger("39049918716424"));
        row50.add(new BigInteger("28277527346376"));
        row50.add(new BigInteger("18851684897584"));
        row50.add(new BigInteger("11554258485616"));
        row50.add(new BigInteger("6499270398159"));
        row50.add(new BigInteger("3348108992991"));
        row50.add(new BigInteger("1575580702584"));
        row50.add(new BigInteger("675248872536"));
        row50.add(new BigInteger("262596783764"));
        row50.add(new BigInteger("92263734836"));
        row50.add(new BigInteger("29135916264"));
        row50.add(new BigInteger("8217822536"));
        row50.add(new BigInteger("2054455634"));
        row50.add(new BigInteger("450978066"));
        row50.add(new BigInteger("85900584"));
        row50.add(new BigInteger("13983816"));
        row50.add(new BigInteger("1906884"));
        row50.add(new BigInteger("211876"));
        row50.add(new BigInteger("18424"));
        row50.add(new BigInteger("1176"));
        row50.add(new BigInteger("49"));
        row50.add(new BigInteger("1"));
        
         assertEquals("Is the generated triangle's 50th row equal to proper 50th row of a Pascal Triangle ",row50, instance.getBinomialCoefficients().get(49));
    }

    /**
     * Test of makeSummationTriangle method, of class PascalTriangleModel.
     * @throws PascalTriangleException if improper height was set
     */
    @Test
    public void testMakeSummationTriangle() throws PascalTriangleException {
        System.out.println("Test of makeSummationTriangle method v1");
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(5);
        instance.makeSummationTriangle();
        ArrayList<BigInteger> rowOne = new ArrayList<>();
        ArrayList<BigInteger> rowTwo = new ArrayList<>();
        ArrayList<BigInteger> rowThree = new ArrayList<>();
        ArrayList<BigInteger> rowFour = new ArrayList<>();
        ArrayList<BigInteger> rowFive = new ArrayList<>();
        ArrayList<BigInteger> rowSix = new ArrayList<>();
        PascalTriangleStructure<BigInteger> triangle = new PascalTriangleStructure();
        
        rowOne.add(BigInteger.ONE);
        
        rowTwo.add(BigInteger.ONE);
        rowTwo.add(BigInteger.ONE);
        rowThree.add(BigInteger.ONE);
        rowThree.add(BigInteger.valueOf(2));
        rowThree.add(BigInteger.ONE);
                
        rowFour.add(BigInteger.ONE);
        rowFour.add(BigInteger.valueOf(3));
        rowFour.add(BigInteger.valueOf(3));
        rowFour.add(BigInteger.ONE);
        
        rowFive.add(BigInteger.ONE);
        rowFive.add(BigInteger.valueOf(4));
        rowFive.add(BigInteger.valueOf(6));
        rowFive.add(BigInteger.valueOf(4));
        rowFive.add(BigInteger.ONE);
        
        rowSix.add(BigInteger.ONE);
        rowSix.add(BigInteger.valueOf(5));
        rowSix.add(BigInteger.valueOf(10));
        rowSix.add(BigInteger.valueOf(10));
        rowSix.add(BigInteger.valueOf(5));
        rowSix.add(BigInteger.ONE);
        
        triangle.add(rowOne);
        triangle.add(rowTwo);
        triangle.add(rowThree);
        triangle.add(rowFour);
        triangle.add(rowFive);
        triangle.add(rowSix);
        
        
        boolean flag = false;
        
        for(int i =0;i<instance.getHeight();i++){
            if(instance.getSummationCoefficients().get(i).equals(triangle.get(i))){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        
        // TODO revie;w the generated test code and remove the default call to fail.
        assertEquals("Result of summation triangle generation: ",true, flag);
    }
    
    /**
     * Test of makeSummationTriangle method, of class PascalTriangleModel.
     * Checks the content of 50th row
     * @throws PascalTriangleException if improper height was set
     */
    @Test
    public void testMakeSumamtionTriangle50thRow() throws PascalTriangleException{
        System.out.println("Test of makeSummationTriangle method v2");
        PascalTriangleModel instance = new PascalTriangleModel();
        instance.setHeight(50);
        instance.makeSummationTriangle();
        
        ArrayList<BigInteger> row50= new ArrayList<>();
        
      
        row50.add(new BigInteger("1"));
        row50.add(new BigInteger("49"));
        row50.add(new BigInteger("1176"));
        row50.add(new BigInteger("18424"));
        row50.add(new BigInteger("211876"));
        row50.add(new BigInteger("1906884"));
        row50.add(new BigInteger("13983816"));
        row50.add(new BigInteger("85900584"));
        row50.add(new BigInteger("450978066"));
        row50.add(new BigInteger("2054455634"));
        row50.add(new BigInteger("8217822536"));
        row50.add(new BigInteger("29135916264"));
        row50.add(new BigInteger("92263734836"));
        row50.add(new BigInteger("262596783764"));
        row50.add(new BigInteger("675248872536"));
        row50.add(new BigInteger("1575580702584"));
        row50.add(new BigInteger("3348108992991"));
        row50.add(new BigInteger("6499270398159"));
        row50.add(new BigInteger("11554258485616"));
        row50.add(new BigInteger("18851684897584"));
        row50.add(new BigInteger("28277527346376"));
        row50.add(new BigInteger("39049918716424"));
        row50.add(new BigInteger("49699896548176"));
        row50.add(new BigInteger("58343356817424"));
        row50.add(new BigInteger("63205303218876"));
        row50.add(new BigInteger("63205303218876"));
        row50.add(new BigInteger("58343356817424"));
        row50.add(new BigInteger("49699896548176"));
        row50.add(new BigInteger("39049918716424"));
        row50.add(new BigInteger("28277527346376"));
        row50.add(new BigInteger("18851684897584"));
        row50.add(new BigInteger("11554258485616"));
        row50.add(new BigInteger("6499270398159"));
        row50.add(new BigInteger("3348108992991"));
        row50.add(new BigInteger("1575580702584"));
        row50.add(new BigInteger("675248872536"));
        row50.add(new BigInteger("262596783764"));
        row50.add(new BigInteger("92263734836"));
        row50.add(new BigInteger("29135916264"));
        row50.add(new BigInteger("8217822536"));
        row50.add(new BigInteger("2054455634"));
        row50.add(new BigInteger("450978066"));
        row50.add(new BigInteger("85900584"));
        row50.add(new BigInteger("13983816"));
        row50.add(new BigInteger("1906884"));
        row50.add(new BigInteger("211876"));
        row50.add(new BigInteger("18424"));
        row50.add(new BigInteger("1176"));
        row50.add(new BigInteger("49"));
        row50.add(new BigInteger("1"));
        
         assertEquals("Is the generated triangle's 50th row equal to proper 50th row of a Pascal Triangle ",row50, instance.getSummationCoefficients().get(49));
    }
    
}
