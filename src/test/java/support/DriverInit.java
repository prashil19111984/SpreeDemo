package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverInit {
    public static WebDriver driver;
    final String baseURL = "http://spree-vapasi.herokuapp.com/";

    public void getBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseURL);
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public WebDriver getDriver()
    {
        return driver;
    }
}
