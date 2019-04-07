

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class A01_TestRunner {
    public static void main(String[] args) {
       Result result = JUnitCore.runClasses(A01_TestJunit.class);
       for (Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
       }
       System.out.println(result.wasSuccessful());
    }
 }


