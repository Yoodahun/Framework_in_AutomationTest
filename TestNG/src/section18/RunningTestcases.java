package section18;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Section18-135 Running testcaes in TestNG
public class RunningTestcases {


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test
    public void Demo() {
        System.out.println("hello");
    }

    @Test
    public void Demo2nd(){
        System.out.println("world !");

    }
    @Test
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

}
