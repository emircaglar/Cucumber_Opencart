package Utilities;

import Pages.Parent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErsteDriver {

    private static  ThreadLocal<WebDriver> threaddriver=new ThreadLocal<>();//Webdriver1,Webdriver1    // Thread Driver habe ich definiert
    public static  ThreadLocal<String> threadBrowserName=new ThreadLocal<>();//Chrome,FireFox    //Thread Driver habe ich eigene name gegeben

    // einen erforderlichen driver wurde definiert
    public static WebDriver getDriver() {

        if (threaddriver.get() == null) { // gibt es hier eine Driver

            switch (threadBrowserName.get()){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    threaddriver.set(new ChromeDriver());
                     break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threaddriver.set(new FirefoxDriver());
                     break;

            }

        }
        return threaddriver.get();
    }


    public static void DriverQuit() {

        Parent.schlafen(2);
        if (threaddriver.get()!= null) {
           WebDriver driver=threaddriver.get();
          driver = null;
          threaddriver.set(driver);
        }

    }


}
