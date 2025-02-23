import org.selenium.maps.NaukriMaps;
import org.selenium.pages.NaukriPage;
import org.selenium.utilities.BaseTest;
import org.selenium.utilities.ConfigReader;
import org.testng.annotations.Test;


public class Naukri extends BaseTest {

    @Test
    public void testNaukriAutomation() {
        NaukriPage naukriPage = new NaukriPage(driver);
        // Get username & password from config
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        String location = ConfigReader.getProperty("location");
        naukriPage.clickOnLogin();
        naukriPage.login(username, password);
        naukriPage.viewProfile();
        naukriPage.updateLocation(location);

        System.out.println("Profile updated successfully!");
    }
}
