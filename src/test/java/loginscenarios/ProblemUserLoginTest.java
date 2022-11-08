package loginscenarios;

import base.BaseTest;
import org.testng.annotations.Test;


public class ProblemUserLoginTest extends BaseTest {

    @Test(testName = "Problem User Login")
    public void problemUserLogin(){
        loginPage.keyingUserName("problem_user");
        loginPage.keyingPassword("secret_sauce");
        loginPage.clickLogin();
    }
}
