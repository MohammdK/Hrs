package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import java.util.concurrent.TimeUnit;

public class WebAPI {
public static WebDriver driver;
    @BeforeMethod
    public void setUp(@Optional("https://www.google.com") String url){
        System.setProperty("webdriver.chrome.driver", "/Users/mohammadislam/IdeaProjects/Hrs/Generic/BrowserDriver/Mac/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://cc.healthrecoverysolutions.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
