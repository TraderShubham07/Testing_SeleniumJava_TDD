package org.selenium.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.utilities.BaseCommands;

public class ICICIMaps extends BaseCommands {
    WebElement insurance = driver.findElement(By.xpath("//span[text()='Accounts']"));
}
