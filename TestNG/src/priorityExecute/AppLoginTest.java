package priorityExecute;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppLoginTest {

    @Test(groups = {"Android"})
    public void androidlogin(){
        System.out.println("androidlogin");

    }

    @Test(groups = {"iOS"})
    public void iosLogin() {
        System.out.println("iosLogin");
    }

//    @Test(dependsOnMethods = {"androidlogin"})
//    public void checkMobileLoggedIn() {
//        System.out.println("check API Logged in");
//    }

}
