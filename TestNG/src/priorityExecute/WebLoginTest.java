package priorityExecute;

import org.testng.annotations.Test;

public class WebLoginTest {

    @Test(groups = {"web"})
    public void pcWebLogin() {
        System.out.println("pc web login");
    }

    @Test(groups = {"Android"})
    public void androidWebLogin() {
        System.out.println("Android web login");
    }

    @Test(groups = {"iOS"})
    public void iosWebLogin() {
        System.out.println("IOS web login");
    }
}
