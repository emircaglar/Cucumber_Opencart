package StepDefinitions;
import Utilities.ErsteDriver;
import Utilities.ExcelUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    @Before
    public void Before(Scenario scenario){
        System.out.println("scenario hat angefangen ");
        System.out.println("scenario.getId() = " + scenario.getId());
        System.out.println("scenario.getName() = " + scenario.getName());


    }


    @After
    public void After(Scenario scenario){


        System.out.println("scenario ist vorbei ");
        System.out.println("scenario.getId() = " + scenario.getStatus());
        System.out.println("scenario.getName() = " + scenario.isFailed());

        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yy");
        if(scenario.isFailed()){


            TakesScreenshot screenshot=(TakesScreenshot) ErsteDriver.getDriver();
            File file=screenshot.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(file, new File("target/opencart_screnn/"+scenario.getName()+dateTime.format(formatter)+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            ExcelUtility.writeExcel("src/test/java/apachePOI/resoucess/Excel_Report.xlsx", scenario.getName(), ErsteDriver.getDriver().toString(), dateTime.format(formatter), scenario.getStatus());

        }
        ErsteDriver.DriverQuit();
    }




}
