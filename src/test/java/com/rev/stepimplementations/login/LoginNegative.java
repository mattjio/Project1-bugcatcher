package com.rev.stepimplementations.login;

import com.rev.runners.LoginRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginNegative {

    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");

    }

    @When("The employee types in g8tor into the username input")
    public void the_employee_types_in_g8tor_into_the_username_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.username.sendKeys("g8tor");
        ;
    }

    @When("The employee types in chomp into the password input")
    public void the_employee_types_in_chomp_into_the_password_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.password.sendKeys("chomp");

    }

    @When("The employee clicks on the login button")
    public void the_employee_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.loginButton.click();

    }

    @Then("The employee should see an alert saying they have the wrong password")
    public void the_employee_should_see_an_alert_saying_they_have_the_wrong_password() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String actualAlertText = LoginRunner.driver.switchTo().alert().getText();
        System.out.println(actualAlertText);
        Assert.assertEquals(actualAlertText, "Wrong password for User");

    }

    @When("The employee types in sicEmDawgs into the username input")
    public void the_employee_types_in_sicEmDawgs_into_the_username_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.username.sendKeys("sicEmDawgs");
    }


    @When("The employee types in natchamps into the password input")
    public void theEmployeeTypesInNatchampsIntoThePasswordInput() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.password.sendKeys("natchamps");
    }

    @Then("The employee should see an alert saying no user with that username found")
    public void theEmployeeShouldSeeAnAlertSayingNoUserWithThatUsernameFound() {
        // Write code here that turns the phrase above into concrete actions
        String actualAlertText = LoginRunner.driver.switchTo().alert().getText();
        System.out.println(actualAlertText);
        Assert.assertEquals(actualAlertText, "Username not found");
    }
}
