package org.selenium.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.selenium.pages.ICICIPage;
import org.testng.annotations.*;

public class BaseTest {
    public static WebDriver driver;

    public BaseTest() {
    }

    @BeforeSuite
    public void setupChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
