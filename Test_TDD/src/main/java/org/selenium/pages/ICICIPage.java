package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.utilities.BaseTest;

public class ICICIPage extends BaseTest {

    private static ICICIPage object;

    private ICICIPage() {
    }

    public static ICICIPage getInstance() {
        if (object == null) {
            object = new ICICIPage();
        }
        return object;
    }
}
