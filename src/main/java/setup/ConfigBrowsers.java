package setup;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigBrowsers {

    public  static WebDriver driver;

    public static WebDriver getDriver(){
     System.setProperty("webdriver.chrome.driver", "C:/Users/Paulo/Desktop/drivers/chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
        return driver;
    }
}
