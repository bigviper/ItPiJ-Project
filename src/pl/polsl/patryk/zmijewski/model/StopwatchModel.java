package pl.polsl.patryk.zmijewski.model;


/**
 * Class designed for time measuerements
 * @version 1.0.0
 * @author Patryk Żmijewski
 */
public class StopwatchModel {
    
    /**
     * conatins the time at which the stopwatch was turned on
     */
    private long startTime;
    
    /**
     * conatins the time at which the stopwatch was turned off
     */
    private long stopTime;
    
    /**
     * conatins the information on wether the stopwatch is still running or it's finished the measurement
     */
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
        this.startTime = System.currentTimeMillis();
        this.isRunning = true;
    
    }
    
    /**
     *  Stops the time measurement
     */
    public void stop() {
        long localStopTime = System.currentTimeMillis();
        if(!isRunning){
            this.startTime=localStopTime;
        }
        this.stopTime = localStopTime;
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
