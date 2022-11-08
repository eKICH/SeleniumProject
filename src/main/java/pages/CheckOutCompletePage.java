package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage {

    private final WebDriver driver;
    private final By confirmationTxt = By.className("complete-header");
    private final By backHomeBtn = By.id("back-to-products");

    public CheckOutCompletePage(WebDriver driver){
        this.driver = driver;
    }

    //Method to confirm the order has been completed
    public String getOrderConfirmation(){
        return driver.findElement(confirmationTxt).getText();
    }

    /**
     * @return ProductsPage
     * Method to click the backHome button
     */
    public ProductsPage clickBackHomeButton(){
        driver.findElement(backHomeBtn).click();
        return new ProductsPage(driver);
    }
}
