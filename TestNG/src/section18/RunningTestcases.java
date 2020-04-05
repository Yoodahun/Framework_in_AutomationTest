package section18;


import org.testng.Assert;
import org.testng.annotations.*;

//Section18-135 Running testcaes in TestNG
public class RunningTestcases {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test
    public void Demo() {
        System.out.println("Demo");
        Assert.assertTrue(true);
    }

    @Test(groups = {"Smoke"})
    public void Demo2nd(){
        System.out.println("world !");

    }
    @Test(dependsOnMethods = {"Demo"})
    public void Demo3rd(){
        System.out.println("world !");

    }

    @AfterTest
    public void lastExecute(){
        System.out.println("Test done !");
    }

    @AfterSuite
    public void last() {
        System.out.println("After suit!");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

}
