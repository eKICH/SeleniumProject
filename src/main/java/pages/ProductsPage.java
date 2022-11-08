package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private final WebDriver driver;
    private final By titleText = By.className("title");
    private final By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private final By removeFromCartBtn = By.id("remove-sauce-labs-backpack");
    private final By cartCounter = By.className("shopping_cart_badge");
    private final By cartIcon = By.className("shopping_cart_link");
    private final By burgerMenuIcon = By.className("bm-burger-button");
    private final By logoutOption = By.id("logout_sidebar_link");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    //Method to get the title on the products page - PRODUCTS
    public String getTitle(){
        return driver.findElement(titleText).getText();
    }

    //Method to add product to cart
    public void clickAddToCart(){
        driver.findElement(addToCartBtn).click();
    }

    //Method to confirm the button text changed to REMOVE
    public String getNewButtonText(){
        return driver.findElement(removeFromCartBtn).getText();
    }

    //Method to confirm cart counter is greater than zero
    public String cartCounter(){
        return driver.findElement(cartCounter).getText();
    }

    /**
     * @return YourCartPage
     * Method to click cart icon
     */

    public YourCartPage clickCartIcon(){
        driver.findElement(cartIcon).click();
        return new YourCartPage(driver);
    }

    //Method to click the burger menu Icon
    public void clickMenuIcon(){
        driver.findElement(burgerMenuIcon).click();
    }

    /**
     * @return LoginPage
     * Method to click logout
     */
    public LoginPage clickLogout(){
        driver.findElement(logoutOption).click();
        return new LoginPage(driver);
    }
}
