import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.selenium.pages.ICICIPage;
import org.selenium.utilities.BaseCommands;
import org.selenium.utilities.BaseTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class ICICIBANK extends BaseTest {

    ICICIPage iciciPage = ICICIPage.getInstance();

    @Test
    public void iciciBankInsurance() throws IOException {
        BaseCommands.getURL("https://www.icicibank.com");


//        WebElement logo = driver.findElement(By.xpath("//span[text()='logo-image logo-india']"));
////        wait.until(ExpectedConditions.visibilityOf(logo));
//        Actions actions = new Actions(driver);
//        actions.contextClick(insurance).perform();
//
//        WebElement lifeInsurance = driver.findElement(By.xpath("//a[contains(text(),'Savings Account')]"));
//        lifeInsurance.click();
//
//        driver.findElement(By.xpath("//a[text()='SAVINGS ACCOUNT INTEREST CALCULATOR']")).click();
////
////        driver.findElement(By.xpath("//input[@class='sf-searchbox']")).sendKeys("Icici");
//
//        List<WebElement> dropdowns = driver.findElements(By.xpath("//ul[@id='years_fd-menu']"));
//
//        for (WebElement dropdown : dropdowns) {
//            System.out.println("Element is : " + dropdown.getText());
//        }
//
////        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id, 'year')]"));
////        Select select= new Select(dropdown);
//////        dropdown.click();
//////        select.selectByValue("2");
//
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(screenshot, new File("screenshot.png"));
    }
}
