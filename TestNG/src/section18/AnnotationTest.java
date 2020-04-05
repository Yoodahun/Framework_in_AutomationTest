package section18;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Start this AnnotationClass");
    }

    @BeforeTest
    public void prerequire() {
        System.out.println("Ready to Test !");

    }

    @Test(groups = {"Smoke"})
    public void annotationTest1() {
        System.out.println("Annotatiton Test 1");
    }





}
