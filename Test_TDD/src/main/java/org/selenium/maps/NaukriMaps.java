package org.selenium.maps;

import org.openqa.selenium.By;

public class NaukriMaps {

    public static final By LOGIN = By.xpath("//a[text()='Login']");
    public static final By USERNAME_FIELD = By.xpath("//input[contains(@placeholder,'Enter your active Email ID')]");
    public static final By PASSWORD_FIELD = By.xpath("//input[contains(@placeholder,'Enter your password')]");
    public static final By LOGIN_BUTTON = By.xpath("//button[text()='Login']");
    public static final By CAREER_PROFILE = By.xpath("(//span[text()='Career profile'])[1]");
    public static final By EDIT_BUTTON = By.xpath("(//span[text()='Career profile'])[2]/following-sibling::span");
    public static final By LOCATION_FIELD = By.xpath("//input[@placeholder='Enter location']");
    public static final By SAVE_BUTTON = By.xpath("//button[text()='Save']");
    public static final By VIEWPROFILE = By.xpath("(//a[contains(@href,'user/profile')])[1]");
}
