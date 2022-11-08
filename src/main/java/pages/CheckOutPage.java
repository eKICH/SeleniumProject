package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    private final WebDriver driver;
    private final By firstNameTxt = By.id("first-name");
    private final By lastNameTxt = By.id("last-name");
    private final By zipCodeTxt = By.id("postal-code");
    private final By continueBtn = By.id("continue");

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @param fname
     * Method to key in first name
     */
    public void keyInFirstName(String fname){
        driver.findElement(firstNameTxt).sendKeys(fname);
    }

    /**
     * @param lname
     * Method to key in last name
     */

    public void keyInLastName(String lname){
        driver.findElement(lastNameTxt).sendKeys(lname);
    }

    /**
     * @param zipCode
     * Method to key in zip code
     */
    public void keyInZipCode(String zipCode){
        driver.findElement(zipCodeTxt).sendKeys(zipCode);
    }

    /**
     * @return CheckOutOverviewPage
     * Method to click continue button
     */
    public CheckOutOverviewPage clickContinue(){
        driver.findElement(continueBtn).click();
        return new CheckOutOverviewPage(driver);
    }
}
