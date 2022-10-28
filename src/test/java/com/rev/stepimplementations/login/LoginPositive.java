package com.rev.stepimplementations.login;

import com.rev.runners.LoginRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPositive {





    @When("The employee types g8tor into username input")
    public void the_employee_types_g8tor_into_username_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.username.sendKeys("g8tor");
    }
    @When("The employee types chomp! into password input")
    public void the_employee_types_chomp_into_password_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.password.sendKeys("chomp!");
    }
    @Then("the employee should be on the Manager page")
    public void the_employee_should_be_on_the_manager_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String actualUrl = LoginRunner.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }
    @Then("The employee should see their name Patty Pastiche on the home page")
    public void the_employee_should_see_their_name_patty_pastiche_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String welcomeMessage = LoginRunner.homePage.welcomeMessage.getText();
        Assert.assertEquals(welcomeMessage, "Welcome Patty Pastiche");
    }

    @When("The employee types ryeGuy into username input")
    public void the_employee_types_rye_guy_into_username_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.username.sendKeys("ryeGuy");
    }
    @When("The employee types coolbeans into password input")
    public void the_employee_types_coolbeans_into_password_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.password.sendKeys("coolbeans");
    }
    @Then("The employee should see their name Fakey McFakeFace on the home page")
    public void the_employee_should_see_their_name_fakey_mc_fake_face_on_the_home_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String welcomeMessage = LoginRunner.homePage.welcomeMessage.getText();
        Assert.assertEquals(welcomeMessage, "Welcome Fakey McFakeFace");
    }

    @When("The employee types cavalier89 into username input")
    public void the_employee_types_cavalier89_into_username_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.username.sendKeys("cavalier89");
    }
    @When("The employee types alucard into password input")
    public void the_employee_types_alucard_into_password_input() {
        // Write code here that turns the phrase above into concrete actions
        LoginRunner.loginPage.password.sendKeys("alucard");
    }
    @Then("the employee should be on the Tester page")
    public void the_employee_should_be_on_the_tester_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String actualUrl = LoginRunner.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://bugcatcher-jasdhir.coe.revaturelabs.com/testerhome");
    }
    @Then("The employee should see their name Dracula Fangs on the home page")
    public void the_employee_should_see_their_name_dracula_fangs_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String welcomeMessage = LoginRunner.homePage.welcomeMessage.getText();
        Assert.assertEquals(welcomeMessage, "Welcome Dracula Fangs");
    }
}
