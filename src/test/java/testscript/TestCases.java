package testscript;

import base.baseclass;
import feature.TestFeatures;
import org.testng.annotations.Test;


public class TestCases extends baseclass{

    @Test
    public void A01_TestCase(){
        System.out.println("DRIVER in TestClass:: "+d) ;
        TestFeatures feature = new TestFeatures(d) ;
        feature.performPositiveFlow() ;
    }
}