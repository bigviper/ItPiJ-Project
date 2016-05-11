package pl.polsl.patryk.zmijewski.model;

import static java.lang.Math.abs;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing class with methods designed for testing of StopwatchModel methods.
 * @author Patryk Żmiewski
 * @verison 1.2.0
 */
public class StopwatchModelTest {
    
    /**
     *
     */
    public StopwatchModelTest() {
    }
    
    /**
     * Test of start method, of class StopwatchModel.
     * @throws InterruptedException if something goes wrong with sleep method.
     */
    @Test
    public void testStart() throws InterruptedException {
        System.out.println("Test of start method");
        StopwatchModel instance = new StopwatchModel();
        
        
        instance.start();
        Thread.sleep(250);
        
        long measuredTime = instance.getDuration();
        
        long expResult = 250;
        
        boolean flag=false;
        if(abs(measuredTime-expResult)<2){
            flag=true;
        }
                
        assertEquals("Flag indicates if difference between measured and expected time is lower than 2ms", true, flag);
    }
    /**
     * 
     * Test of stop method, of class StopwatchModel, when start method was used.
     * @throws InterruptedException if something goes wrong with sleep method.
     */
    @Test
    public void testStop() throws InterruptedException {
        System.out.println("Test of stop method - start method was used");
        StopwatchModel instance = new StopwatchModel();
        instance.start();
        
        Thread.sleep(250);
        
        instance.stop();
        
        long expResult = 250;
        
        boolean flag = false;
        if(abs(instance.getDuration()-expResult)<2){
            flag=true;
        }
        assertEquals("Flag indicates if difference between measured and expected time is lower than 2ms", true, flag);
    }

    /**
     * Test of stop method, of class StopwatchModel, when no start method was used.
     */
    @Test
    public void testStopNoStart() {
        System.out.println("Test of stop method - no start method was used");
        StopwatchModel instance = new StopwatchModel();
        instance.stop();
        
        long measuredTime = instance.getDuration();
        long expResult = 0L;
       
        assertEquals("Measured time should be equal to zero", expResult, measuredTime);
    }
    
    

    /**
     * Test of getDuration method, of class StopwatchModel.
     */
    @Test
    public void testGetDurationNoMeasurement() {
        System.out.println("Test of getDuration method - no start or stop method used");
        StopwatchModel instance = new StopwatchModel();
        long expResult = 0L;
        long result = instance.getDuration();
        assertEquals(expResult, result);
        
        
    }
    
    /**
     * Test of getDuration method, of class StopwatchModel.
     * @throws InterruptedException if something goes wrong with sleep method.
     */
    @Test
    public void testGetDurationNoStop() throws InterruptedException {
        System.out.println("Test of getDuration method - no stop method used");
        StopwatchModel instance = new StopwatchModel();
        instance.start();
        long testStartTime=System.currentTimeMillis();
        
        Thread.sleep(250);
        
        long measuredTime = instance.getDuration();
        long expResult = System.currentTimeMillis()-testStartTime;
        
        boolean flag = false;
        if(abs(measuredTime-expResult)<2){
            flag=true;
        }
        assertEquals("Flag indicates if difference between measured and expected time is lower than 2ms",true, flag);
        
        
    }
    
    
    /**
     * Test of getDuration method, of class StopwatchModel in normal conditions
     * @throws InterruptedException if something goes wrong with sleep method.
     */
    @Test
    public void testGetDurationNormalConditions() throws InterruptedException {
        System.out.println("Test of getDuration method - normal conditions");
        StopwatchModel instance = new StopwatchModel();
        
        
        instance.start();
        long localStartTime = System.currentTimeMillis();
        
        Thread.sleep(250);
        
        instance.stop();
        long expResult= System.currentTimeMillis() - localStartTime;
        
        boolean flag = false;
        if(abs(instance.getDuration()-expResult)<2){
            flag=true;
        }
        assertEquals("Flag indicates if difference between measured and expected time is lower than 2ms",true, flag);
        
        
    }
    
}
