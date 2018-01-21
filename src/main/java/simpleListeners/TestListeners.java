package simpleListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListeners extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {
        //super.onTestFailure(tr);
        System.out.println("Failing the test "+tr.getName());
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        //super.onTestSkipped(tr);
        System.out.println("Skipping the test - "+tr.getName());
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        //super.onTestSuccess(tr);
        System.out.println("Test pass - "+tr.getName());
    }
}
