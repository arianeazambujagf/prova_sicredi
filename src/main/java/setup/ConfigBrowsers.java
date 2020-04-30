package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigBrowsers {

    public static WebDriver driver;


    public static WebDriver getDriver() {
        setPath();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static void setPath() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }
}