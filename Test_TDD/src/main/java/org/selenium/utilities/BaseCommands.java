package org.selenium.utilities;

public class BaseCommands extends BaseTest {

    public BaseCommands(){}

    //This method is used To enter the URL
    public static void getURL(String inputURL) {
        try {
            driver.get(inputURL);
        } catch (Exception var4) {
            System.out.println(("Failed to enter application URL ............. " + var4));
        }
    }
}
