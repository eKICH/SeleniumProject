package loginscenarios;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class StandardUserLoginTest extends BaseTest {

    @Test(testName = "Successfull Login")
    public void standardUserLogin() {
        loginPage.keyingUserName("standard_user");
        loginPage.keyingPassword("secret_sauce");
        productsPage = loginPage.clickLogin();
        assertTrue(productsPage.getTitle().contains("PRODUCTS"),
                "Wrong Title");
        System.out.println("You are currently on the products page!");
    }
}
