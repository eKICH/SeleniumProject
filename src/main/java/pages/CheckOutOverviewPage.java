package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {
    private final WebDriver driver;
    private final By finishBtn = By.id("finish");

    public CheckOutOverviewPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @return CheckOutCompletePage
     * Method to click on the finish button
     */
    public CheckOutCompletePage clickFinish(){
        driver.findElement(finishBtn).click();
        return new CheckOutCompletePage(driver);
    }
}
