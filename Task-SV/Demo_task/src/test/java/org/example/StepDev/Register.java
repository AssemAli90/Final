package org.example.StepDev;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Register {
    WebDriver driver = new ChromeDriver();

    @Given("Navigate To system URL")
    public void Navigate_To_system_URL() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @When("Click on Register")
    public void Click_on_Register() {
        driver.findElement(By.className("ico-register")).click();
    }

    @And("select Gender")
    public void select_Gender() {
        driver.findElement(By.id("gender-male")).click();
    }

    @And("Entries First Name")
    public void Entries_First_Name() {
        driver.findElement(By.id("FirstName")).sendKeys("Assem");
    }

    @And("Entries Last Name")
    public void Entries_Last_Name() {
        driver.findElement(By.id("LastName")).sendKeys("Ali");
    }

    @And("Select day of Birth")
    public void Select_day_of_Birth() {
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue("12");
    }

    @And("Select month of Birth")
    public void Select_month_of_Birth() {
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByValue("5");
    }

    @And("select year of Birth")
    public void select_year_of_Birth() {
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("1990");
    }

    @And("Entries valid email")
    public void Entries_valid_email() {
        driver.findElement(By.id("Email")).sendKeys("vip902@mailinator.com");
    }

    @And("Entries company name")
    public void Entries_company_name() {
        driver.findElement(By.id("Company")).sendKeys("Salem Ventures");
    }

    @And("Entries password")
    public void Entries_password() {
        driver.findElement(By.id("Password")).sendKeys("Salem@2023");
    }

    @And("Entries Confirm password")
    public void Entries_Confirm_password() {
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Salem@2023");
    }

    @And("Click on Register Button")
    public void Click_on_Register_Button() {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("Registered successfully")
    public void Registered_successfully() {
        boolean x = driver.findElement(By.className("result")).isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(x, true);
        soft.assertAll();
        driver.quit();
    }
}
