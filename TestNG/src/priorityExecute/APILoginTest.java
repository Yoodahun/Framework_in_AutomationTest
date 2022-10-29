package priorityExecute;

import org.testng.annotations.Test;
import section18.AnnotationTest;

public class APILoginTest extends AnnotationTest {

    @Test
    public void internalApiLogin() {
        System.out.println("internal API Login");
    }

    @Test
    public void externalApiLogin() {
        System.out.println("external API Login");
    }

}
