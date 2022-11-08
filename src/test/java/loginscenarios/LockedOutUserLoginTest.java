package loginscenarios;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LockedOutUserLoginTest extends BaseTest {

    @Test(testName = "Locked Out User Login")
    public void lockedOutUserLogin(){
        loginPage.keyingUserName("locked_out_user");
        loginPage.keyingPassword("secret_sauce");
        loginPage.clickLogin();
        assertTrue(loginPage.getLockedOutError().contains("Epic sadface: Sorry, this user has been locked out."),
               "Wrong error message!");
        System.out.println("The user is locked out!");
    }
}
