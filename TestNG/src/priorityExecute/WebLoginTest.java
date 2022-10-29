package priorityExecute;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebLoginTest {

    @Test(groups = {"web"})
    public void pcWebLogin() {
        System.out.println("pc web login");
    }

    @Parameters({"URL"})
    @Test(groups = {"web"})
    public void pcNaverWebLogin(String url) {
        System.out.println(url);

    }

    @Test(groups = {"Android"})
    public void androidWebLogin() {
        System.out.println("Android web login");
    }

    @Parameters({"URL"})
    @Test(groups = {"Android"})
    public void androidNaverWebLogin(String url) {
        System.out.println(url);

    }


    @Test(groups = {"iOS"})
    public void iosWebLogin() {
        System.out.println("IOS web login");
    }
}
