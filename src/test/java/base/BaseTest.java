package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

public class BaseTest {

    WebDriver driver;
    protected LoginPage loginPage;
    protected ProductsPage productsPage;
    protected YourCartPage yourCartPage;
    protected CheckOutPage checkOutPage;
    protected CheckOutOverviewPage checkOutOverviewPage;
    protected CheckOutCompletePage checkOutCompletePage;

    //Method to set up chrome driver and initializing new session
    @BeforeClass
    public void setUp() throws InterruptedException {
        //Set up the browser - Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        yourCartPage = new YourCartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        checkOutOverviewPage = new CheckOutOverviewPage(driver);
        checkOutCompletePage = new CheckOutCompletePage(driver);
    }

    //Method to quit session
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
