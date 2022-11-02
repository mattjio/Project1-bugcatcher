package com.rev.stepimplementations.tester;


import com.rev.runners.NavRunner;
import com.rev.runners.TestCaseRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Wait;

public class TesterPageCases {

    //Scenario: Add a new test case
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

    @When("The tester types into \"Description\" input with")
    public void the_tester_types_into_description_input_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        string = "Verify that usernames cannot have illegal characters";
        TestCaseRunner.testPage.descriptionInput.sendKeys(string);
        throw new io.cucumber.java.PendingException();
    }

    @When("The tester types into \"Steps\" input with")
    public void the_tester_types_into_steps_input_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        string = "Go to create a new account page\n2. create several users with each username having 1 illegal character\n3. Make sure none of them are successful\n" +
                "illegal characters: $, #, /, <, >, (, ), ^";
        TestCaseRunner.testPage.stepsInput.sendKeys(string);
        throw new io.cucumber.java.PendingException();
    }

    @When("The tester presses the submit button")
    public void the_tester_presses_the_submit_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.submitButton.click();
        Thread.sleep(1000);
    }

    @Then("The test case should appear at the bottom of the table")
    public void the_test_case_should_appear_at_the_bottom_of_the_table() {
        // Write code here that turns the phrase above into concrete actions
        String lastDescription = TestCaseRunner.testPage.lastTestCaseDescription.getText();
        assert lastDescription.equals("Verify that usernames cannot have illegal characters");
        throw new io.cucumber.java.PendingException();
    }

    @Then("The test case result should say UNEXECUTED")
    public void the_test_case_result_should_say_unexecuted() {
        // Write code here that turns the phrase above into concrete actions
        String lastResult = TestCaseRunner.testPage.lastTestCaseResult.getText();
        assert lastResult.equals("UNEXECUTED");
        throw new io.cucumber.java.PendingException();
    }

    @When("The tester presses on details")
    public void the_tester_presses_on_details() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.lastTestCaseDetails.click();
        Thread.sleep(1000);
    }

    @Then("The performed by field should say No One")
    public void the_performed_by_field_should_say_no_one() {
        // Write code here that turns the phrase above into concrete actions
        String performedBy = TestCaseRunner.testPage.performedBy.getText();
        assert performedBy.equals("No One");
        throw new io.cucumber.java.PendingException();
    }

    @When("The tester presses the close button")
    public void the_tester_presses_the_close_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.closeButton.click();
        Thread.sleep(1000);
    }

    @Then("The Modal Should be closed")
    public void the_modal_should_be_closed() {
        // Write code here that turns the phrase above into concrete actions
        assert !TestCaseRunner.testPage.detailsModal.isDisplayed();
    }

    //Scenario: Edit existing case
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
        assert TestCaseRunner.testPage.detailsModal.isDisplayed();
        assert TestCaseRunner.testPage.caseTitle.isDisplayed();

        throw new io.cucumber.java.PendingException();
    }

    @When("The Tester clicks on edit within the modal")
    public void theTesterClicksOnEditWithinTheModal() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.editButton.click();
        Thread.sleep(1000);
    }


    @Then("The Tester should be on the case editor for that case")
    public void theTesterShouldBeOnTheCaseEditorForThatCase() {
        // Write code here that turns the phrase above into concrete actions
        String currentUrl = TestCaseRunner.driver.getCurrentUrl();


    }
}
