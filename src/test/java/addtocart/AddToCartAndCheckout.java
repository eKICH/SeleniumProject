package addtocart;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AddToCartAndCheckout extends BaseTest {

    @Test(testName = "Adding BackPack to Cart and Checking Out")
    public void addToCart() throws InterruptedException {
        //Login
        loginPage.keyingUserName("standard_user");
        loginPage.keyingPassword("secret_sauce");
        productsPage = loginPage.clickLogin();

        //Add to cart
        productsPage.clickAddToCart();
        assertTrue(productsPage.getNewButtonText().contains("REMOVE"),
                "Wrong button text!");
        System.out.println("Product added successfully!");
        assertTrue(productsPage.cartCounter().contains("1"),
                "Counter is zero!");
        System.out.println("Cart contains 1 product");
        yourCartPage = productsPage.clickCartIcon();
        assertTrue(yourCartPage.getYourCartText().contains("YOUR CART"),
                "You are not in your cart page!");
        System.out.println("You are in your cart page!");
        assertTrue(yourCartPage.getInventoryItem().contains("Sauce Labs Backpack"),
                "Cart doesn't contain the item!");

        //CheckOut
        checkOutPage = yourCartPage.clickCheckout();
        checkOutPage.keyInFirstName("Demo1");
        checkOutPage.keyInLastName("Demo");
        checkOutPage.keyInZipCode("60500");
        checkOutOverviewPage = checkOutPage.clickContinue();
        checkOutCompletePage = checkOutOverviewPage.clickFinish();

        //Assert that we are on the checkout complete page
        assertTrue(checkOutCompletePage.getOrderConfirmation().contains("THANK YOU FOR YOUR ORDER"),
                "You are not at checkout complete page!");

        //BackHome
        productsPage = checkOutCompletePage.clickBackHomeButton();

        //Logout
        productsPage.clickMenuIcon();
        loginPage = productsPage.clickLogout();

        Thread.sleep(10000);
    }
}
