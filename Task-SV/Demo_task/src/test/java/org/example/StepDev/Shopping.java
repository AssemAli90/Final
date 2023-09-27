package org.example.StepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pomPages.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Shopping {
    public static WebDriver driver;
    Locators locs = new Locators();

    @Given("Navigate To login URL")
    public void Navigate_To_login_URL() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
    }

    @When("Insert valid email")
    public void Insert_valid_email() {
        locs.getValidEmail().sendKeys("vip902@mailinator.com");
    }

    @And("Insert Valid password")
    public void Insert_Valid_password() {
        locs.getValidPassword().sendKeys("Salem@2023");
    }

    @And("Click login btn")
    public void Click_login_btn() {
        locs.Clicklogin().click();
    }

    @And("click on Books")
    public void click_on_Books() {
        locs.ClickOnBooks().click();
    }

    @And("click on sorted by price low to high")
    public void click_on_sorted_by_price_low_to_high() {
        Select Low_to_high = new Select(locs.sortedbylowtohigh());
        Low_to_high.selectByValue("10");
    }

    @And("Select second Item")
    public void Select_second_Item() throws InterruptedException {
        Thread.sleep(3000);
        locs.SelectsecondItem().click();
    }

    @And("Click add to cart")
    public void Click_add_to_cart() {
        locs.Clickaddtocart().click();
    }

    @And("go to your cart")
    public void go_to_your_cart() throws InterruptedException {
        Thread.sleep(5000);
        locs.gotoyourcart().click();

    }

    @Then("make sure item saved to cart")
    public void make_sure_item_saved_to_cart() throws InterruptedException {
        Thread.sleep(2000);
        boolean y = locs.makesureitemsavedtocart().isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(y, true);
        soft.assertAll();
        driver.quit();

    }
}

