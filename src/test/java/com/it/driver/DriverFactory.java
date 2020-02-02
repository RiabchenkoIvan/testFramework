package com.it.driver;

import com.it.common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.*;

public class DriverFactory {
    public static final String USERNAME = "ian466";
    public static final String AUTOMATE_KEY = "Y7yw4YFNWtjZSyXQkAhp";
    public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver getDriver() throws Exception{
        WebDriver driver;
        String driverSysProperty = System.getProperty("driver");
        if ("firefox".equals(driverSysProperty)) {
            System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("browserstack".equals(driverSysProperty)) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Firefox");
            caps.setCapability("browser_version", "71.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "2048x1536");
            caps.setCapability("name", "Bstack-[Java] Sample Test");
            driver = new RemoteWebDriver(new URL(URL), caps);
        } else {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        System.out.println(driver.manage().getCookies());
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(BASE_IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return driver;
    }
}
