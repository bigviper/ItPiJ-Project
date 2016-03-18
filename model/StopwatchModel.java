/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.patryk.zmijewski.model;

/**
 * @version 1.0.0
 * @author Patryk Żmijewski
 */
/**
 * Class designed for time measuerements
 */
public class StopwatchModel {
    
    private long startTime;
    private long stopTime;
    private boolean isRunning;
    
    /**
     * Public constructor for the StopwatchModel class
     */
    public StopwatchModel(){
        this.startTime=0;
        this.stopTime=0;
        this.isRunning=false;
    }
    /**
     * Starts the time measurement
     */
    public void start() {
    this.startTime = System.nanoTime();
    this.isRunning = true;
    
    }
    
    /**
     *  Stops the time measurement
     */
    public void stop() {
    this.stopTime = System.nanoTime();
    this.isRunning = false;
    }
     
    /**
     * Gets the duration of a measurement. 
     * @return duration given in nanoseconds
     */
    public long getDuration(){
        long duration;
        if(isRunning){
            duration=(System.currentTimeMillis()-startTime);
        }
        else{
            duration=stopTime-startTime;
        }
        return duration;
    }
    
    
}
