package simpleListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AdminPanelTest {

    @Test
    public void doLogin(){
        //System.out.println("Executing login test -- pass");
    }

    @Test
    public void fillForm(){
        //System.out.println("Filling form test -- Fail");
        Assert.fail();
        System.out.println("Fill form executed");
    }

    @Test
    public void vaidateData(){
        //System.out.println("Validate date - skip");
        throw new SkipException("Skipping the test");
    }
}
