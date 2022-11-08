package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage {

    private final WebDriver driver;
    private final By yourCartTxt= By.className("title");
    private final By inventoryItem= By.className("inventory_item_name");
    private final By checkoutBtn= By.id("checkout");

    public YourCartPage(WebDriver driver){
        this.driver = driver;
    }

    //method to confirm you are on your cart page
    public String getYourCartText(){
        return driver.findElement(yourCartTxt).getText();
    }

    //method to confirm the inventory item is on the cart
    public String getInventoryItem(){
        return driver.findElement(inventoryItem).getText();
    }

    /**
     * @return CheckOutPage
     * Method to click checkout button
     */
    public CheckOutPage clickCheckout(){
        driver.findElement(checkoutBtn).click();
        return new CheckOutPage(driver);
    }
}
