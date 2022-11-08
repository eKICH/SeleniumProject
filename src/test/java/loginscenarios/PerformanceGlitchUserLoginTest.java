package loginscenarios;

import base.BaseTest;
import org.testng.annotations.Test;


public class PerformanceGlitchUserLoginTest extends BaseTest {

    @Test(testName = "Performance glitch user Login")
    public void performanceGlitchUserLogin() throws InterruptedException {
        loginPage.keyingUserName("performance_glitch_user");
        loginPage.keyingPassword("secret_sauce");
        loginPage.clickLogin();
        //Thread.sleep(3000);
    }
}
