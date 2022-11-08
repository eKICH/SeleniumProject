package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private final By userNameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By lockedOutTxt = By.xpath("//div/h3");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @param userName
     * Method to key in userName
     */

    public void keyingUserName(String userName){
        //Clear the username field
        driver.findElement(userNameField).clear();
        //Key in the username
        driver.findElement(userNameField).sendKeys(userName);
    }

    /**
     * @param password
     * Method to key in password
     */

    public void keyingPassword(String password){
        //Clear the username field
        driver.findElement(passwordField).clear();
        //Key in the username
        driver.findElement(passwordField).sendKeys(password);
    }

    /**
     * @return ProductsPage
     * Method to click login button
     */

    public ProductsPage clickLogin(){
        driver.findElement(loginBtn).click();
        return new ProductsPage(driver);
    }

    //Method to get the locked out user error message
    public String getLockedOutError(){
        return driver.findElement(lockedOutTxt).getText();
    }
}
