package hrsPages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrsLogInHome extends WebAPI {
    @FindBy(id = "loginEmail")
    WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement userPassword;
    @FindBy(xpath = "//*[@id=\"loginSubmitButton\"]")
    WebElement logInSubmitButton;
/*
Scenario: HRS Login functionality.
Test cases:Valid user should be able to login HRS Login page.
step 1: Launch Chrome Browser
step 2: User should enter HRS Url
step 3: User should enter valid Email or Username
step 4: User should enter valid Password
step 5: User should click on Sign In button
step 6: User should be able to landed on Homepage
step 7: Landed Homepage should be asserted by PageTitle
 */
    public void hrsLogInCheck() throws InterruptedException {
        userName.sendKeys("abc123@gmail.com");
        userPassword.sendKeys("abc123");
        Thread.sleep(5000);
        logInSubmitButton.submit();
        Assert.assertEquals("HRS | ClinicianConnect", driver.getTitle());
    }
}