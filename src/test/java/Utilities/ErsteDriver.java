package Utilities;

import Pages.Parent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErsteDriver {

    public static WebDriver driver;// Singleton Driver habe ich definiert

    // einen erforderlichen driver wurde definiert
    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static void DriverQuit() {

        Parent.schlafen(2);
        if (driver != null) {
           driver.quit();
           driver = null;
        }

    }


}
