package org.example.StepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Login {
    WebDriver driver = new ChromeDriver();

    @Given("Navigate To login page URL")
    public void Navigate_To_login_page_URL() {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("Enter valid email")
    public void Enter_valid_email() {
        driver.findElement(By.id("Email")).sendKeys("vip902@mailinator.com");
    }

    @And("Enter Valid password")
    public void Enter_Valid_password() {
        driver.findElement(By.id("Password")).sendKeys("Salem@2023");
    }

    @And("Click login")
    public void Click_login() {
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    }

    @Then("User login successful")
    public void user_login_successful() {
        boolean v = driver.findElement(By.className("ico-logout")).isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(v, true);
        soft.assertAll();
        driver.quit();
    }


}
