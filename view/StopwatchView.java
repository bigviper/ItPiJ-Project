/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.patryk.zmijewski.view;

/**
 * @version 1.0.0
 * @author Patryk Żmijewski
 */

/**
 * Class designed for time measurements presentation
 */
public class StopwatchView {
    
    /**
     * Public constructor for the class StopwatchView
     */
    public StopwatchView(){
       
    }
    
    /**
     * Prints out the time measurement performed by given StopwatchModel
     * @param duration provides time measurement
     */
    public void printElapsedTime(long duration){
        System.out.println("The execution of the tasks took: "+duration+" ns");
    }
    
}
