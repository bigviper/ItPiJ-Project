package pl.polsl.patryk.zmijewski.model;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for tests of model classes.
 * @author Patryk Żmiewski
 * @verison 1.2.0
 */

@RunWith(Suite.class)
@SuiteClasses({
    PascalTriangleModelTest.class,
    StopwatchModelTest.class})

public class ModelTestSuite {
    
}
