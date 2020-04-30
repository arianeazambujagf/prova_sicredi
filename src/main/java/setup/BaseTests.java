package setup;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class BaseTests {
    public static WebDriver driver;
    @Before
    public void start(Scenario scenario) throws Exception {
        driver = ConfigBrowsers.getDriver();
    }

    @After
    public void finish(Scenario scenario) throws Exception {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}