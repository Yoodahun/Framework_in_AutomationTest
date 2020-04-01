package section18;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PrioritizingTestcase {

    @Test
    public void weblogin(){
        System.out.println("weblogin");
    }

    @Test
    public void mobileLogin(){
        System.out.println("mobileLogin");
    }

    @Test
    public void mobileWeb(){
        System.out.println("mobileWeb");
    }

    @BeforeSuite
    public void setting() {
        System.out.println("Setting");
    }
}
