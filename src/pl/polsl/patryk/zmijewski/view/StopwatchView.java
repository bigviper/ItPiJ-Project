package pl.polsl.patryk.zmijewski.view;

/**
 * Class designed for time measurements presentation
 * @version 1.0.0
 * @author Patryk Żmijewski
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
        System.out.println("The execution of the tasks took: "+duration+" ms");
    }
    
    
}
