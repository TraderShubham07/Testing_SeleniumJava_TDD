package org.selenium.pages;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.WebDriver;
import org.selenium.maps.NaukriMaps;
import org.selenium.utilities.BaseCommands;

public class NaukriPage extends BaseCommands {

    public NaukriPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        enterText(NaukriMaps.USERNAME_FIELD, username);
        enterText(NaukriMaps.PASSWORD_FIELD, password);
        click(NaukriMaps.LOGIN_BUTTON);
    }

    public void updateLocation(String location) {
        click(NaukriMaps.CAREER_PROFILE);
        click(NaukriMaps.EDIT_BUTTON);
//        enterText(NaukriMaps.LOCATION_FIELD, location);
//        click(NaukriMaps.SAVE_BUTTON);
    }

    public void clickonLogin() {
        click(NaukriMaps.LOGIN);
    }

    public void viewProfile(){
        click(NaukriMaps.VIEWPROFILE);
    }

}
