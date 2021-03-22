package testHrsLogIn;

import common.WebAPI;
import hrsPages.HrsLogInHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHrsLogInHome extends WebAPI{
HrsLogInHome hrsLogInHome;
@BeforeMethod
    public void getInIt(){
    hrsLogInHome= PageFactory.initElements(driver,HrsLogInHome.class);
}
@Test
    public void testHrsLogInCheck() throws InterruptedException {
    hrsLogInHome.hrsLogInCheck();
}


}
