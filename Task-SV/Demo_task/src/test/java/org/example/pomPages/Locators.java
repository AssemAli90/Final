package org.example.pomPages;

import org.example.StepDev.Shopping;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators {
    public WebElement getValidEmail()
    {
        return Shopping.driver.findElement(By.id("Email"));
    }
    public WebElement getValidPassword()
    {
        return Shopping.driver.findElement(By.id("Password"));
    }
    public WebElement Clicklogin()
    {
        return Shopping.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    }
    public WebElement ClickOnBooks()
    {
        return Shopping.driver.findElement(By.partialLinkText("Books"));
    }
    public WebElement sortedbylowtohigh()
    {
        return Shopping.driver.findElement(By.id("products-orderby"));
    }
    public WebElement SelectsecondItem()
    {
        return Shopping.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000068_fahrenheit-451-by-ray-bradbury_415.jpeg\"]"));
    }
    public WebElement Clickaddtocart()
    {
        return Shopping.driver.findElement(By.cssSelector("button[id=\"add-to-cart-button-37\"]"));
    }
    public WebElement gotoyourcart()
    {
        return Shopping.driver.findElement(By.cssSelector("a[href=\"/cart\"][class=\"ico-cart\"]"));
    }
    public WebElement makesureitemsavedtocart()
    {
        return Shopping.driver.findElement(By.cssSelector("span[class=\"sku-number\"]"));
    }



}
