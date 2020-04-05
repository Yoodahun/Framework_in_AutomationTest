package section18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class GlobalParameter {

    WebDriver driver;

    @BeforeSuite
    public void Login() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/yoodahun/Documents/Github/Java/Selenium WebDriver with Java/Framework_in_AutomationTest/TestNG/src/section18/dataDriven.properties");
        prop.load(fis);



        System.out.println(prop.getProperty("username"));
        if(prop.getProperty("browser").contains("chrome")) {
            driver = new ChromeDriver();
            System.out.println("Chrome");
        } else {
            driver = new FirefoxDriver();
            System.out.println("Firefox");
        }

        System.out.println(prop.getProperty("url"));
        driver.get(prop.getProperty("url"));
        //driver.findElement(By.xpath()).sendKeys~~~
    }

    @AfterSuite
    public void close() {
        driver.quit();
        System.out.println("driver closed!");
    }
}
