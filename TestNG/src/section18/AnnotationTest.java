package section18;

import org.testng.annotations.*;

public class AnnotationTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Start this AnnotationClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("End this AnnotationClass");
    }

    @BeforeTest
    public void prerequire() {
        System.out.println("Ready to Test !");

    }

    @AfterTest
    public void endTest() {
        System.out.println("End Test !");
    }

    @Test(groups = {"Smoke"})
    public void annotationTest1() {
        System.out.println("Annotatiton Test 1");
    }





}
