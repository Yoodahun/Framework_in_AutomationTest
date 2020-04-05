package section18;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrioritizingTestcase {

    @Test
    public void weblogin(){
        System.out.println("weblogin");
    }

    @Test(dataProvider = "getData")
    public void mobileLogin(String username, String password){
        System.out.println("mobileLogin");
        System.out.println(username);
        System.out.println(password);
    }

    @Test(groups = {"Smoke"})
    public void mobileWeb(){
        System.out.println("mobileWeb");
    }

    @Parameters({"URL", "APIKey/Username"})
    @Test
    public void ascending(String url, String username) {
        System.out.println("asceding");
        System.out.println(username);
        System.out.println(url);

    }

    @DataProvider
    public Object[][] getData() {
        // 1. username , password
        // 2. another username, password
        // 3.
        Object[][] data = new Object[3][2];
        data[0][0] = "first username";
        data[0][1] = "first password";
        data[1][0] = "Second username";
        data[1][1] = "Second password";
        data[2][0] = "Third username";
        data[2][1] = "Third password";

        return data;
    }


    @BeforeSuite
    public void setting() {
        System.out.println("BeforeSuite");
    }
}
