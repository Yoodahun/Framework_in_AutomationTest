package section18;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

    @BeforeTest
    public void prerequire() {
        System.out.println("Ready to Test !");

    }

    @Test
    public void annotationTest1() {
        System.out.println("Annotatiton Test 1");
    }


}
