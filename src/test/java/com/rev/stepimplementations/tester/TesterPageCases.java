package com.rev.stepimplementations.tester;


import com.rev.runners.NavRunner;
import com.rev.runners.TestCaseRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterPageCases {

    @Given("The tester is on the test case dashboard")
    public void the_tester_is_on_the_test_case_dashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        NavRunner.loginPage.username.sendKeys("cavalier89");
        NavRunner.loginPage.password.sendKeys("alucard");
        NavRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        NavRunner.homePage.testCasesLink.click();
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals(TestCaseRunner.testPage.testCaseUrl);
        throw new io.cucumber.java.PendingException();
    }

    @When("The tester clicks on details")
    public void the_tester_clicks_on_details() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.detailsButton.click();
        Thread.sleep(1000);
        throw new io.cucumber.java.PendingException();
    }

    @Then("A test case modal should appear showing the case ID")
    public void a_test_case_modal_should_appear_showing_the_case_ID() {
        // Write code here that turns the phrase above into concrete actions

        throw new io.cucumber.java.PendingException();
    }

}
