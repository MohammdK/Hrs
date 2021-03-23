package hrsPages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HrsLogInHome extends WebAPI {
    /*
Scenario: HRS Login functionality.
Test cases:User should be able to login to the HRS Login page.
step 1: Launch Chrome Browser
step 2: User enters HRS Url
step 3: User enters valid Email or Username
step 4: User enters valid Password
step 5: User clicks on Sign In button
step 6: Expected result: User should be able to SignIn to the Homepage
step 7: Post condition: Homepage verified by PageTitle
 */
    @FindBy(id = "loginEmail")
    WebElement userName;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement userPassword;
    @FindBy(xpath = "//*[@id=\"loginSubmitButton\"]")
    WebElement logInSubmitButton;

    public void hrsLogInCheck() throws InterruptedException {
        userName.sendKeys("abc123@gmail.com");
        userPassword.sendKeys("abc123");
        logInSubmitButton.submit();
        Assert.assertEquals("HRS | ClinicianConnect", driver.getTitle());
    }
}
