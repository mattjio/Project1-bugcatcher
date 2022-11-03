package com.rev.stepimplementations.tester;


import com.rev.runners.NavRunner;
import com.rev.runners.TestCaseRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesterPageCases {

    //Scenario: Add a new test case
    @Given("The tester is on the test case dashboard")
    public void the_tester_is_on_the_test_case_dashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        TestCaseRunner.loginPage.username.sendKeys("cavalier89");
        TestCaseRunner.loginPage.password.sendKeys("alucard");
        TestCaseRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        TestCaseRunner.homePage.testCasesLink.click();
        Thread.sleep(1000);
        String currentUrl = TestCaseRunner.driver.getCurrentUrl();
        assert currentUrl.equals(TestCaseRunner.testPage.testCaseUrl);

    }

    @When("The tester types into \"Description\" input with")
    public void the_tester_types_into_description_input_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        string = "Verify that usernames cannot have illegal characters";
        TestCaseRunner.testPage.descriptionInput.sendKeys(string);

    }

    @When("The tester types into \"Steps\" input with")
    public void the_tester_types_into_steps_input_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        string = "Go to create a new account page\n2. create several users with each username having 1 illegal character\n3. Make sure none of them are successful\n" +
                "illegal characters: $, #, /, <, >, (, ), ^";
        TestCaseRunner.testPage.stepsInput.sendKeys(string);

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

    }

    @Then("The test case result should say UNEXECUTED")
    public void the_test_case_result_should_say_unexecuted() {
        // Write code here that turns the phrase above into concrete actions
        String lastResult = TestCaseRunner.testPage.lastTestCaseResult.getText();
        assert lastResult.equals("UNEXECUTED");

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

    }

    @When("The tester presses the close button")
    public void the_tester_presses_the_close_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement modalCloseButton = TestCaseRunner.testPage.modalContainer.findElement(By.xpath("//button[contains(text(),'Close')]"));
        modalCloseButton.click();
        Thread.sleep(1000);
    }

    @Then("The Modal Should be closed")
    public void the_modal_should_be_closed() {
        // Write code here that turns the phrase above into concrete actions
        assert TestCaseRunner.testPage.testCaseDashboard.isDisplayed();
    }

    //Scenario: Edit existing case
    @When("The tester clicks on details")
    public void the_tester_clicks_on_details() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.detailsButton.click();
        Thread.sleep(1000);

    }

    @Then("A test case modal should appear showing the case ID")
    public void a_test_case_modal_should_appear_showing_the_case_ID() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        assert TestCaseRunner.testPage.modalContainer.isDisplayed();
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
        assert TestCaseRunner.testPage.descriptionTitle.isDisplayed();
    }

    @Then("The fields should be uneditable")
    public void theFieldsShouldBeUneditable() {
        // Write code here that turns the phrase above into concrete actions
        assert !TestCaseRunner.testPage.caseDescription.isEnabled();
        assert !TestCaseRunner.testPage.caseSteps.isEnabled();

    }

    @When("The tester clicks on the edit button")
    public void the_tester_clicks_on_the_edit_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.editCaseButton.click();
        Thread.sleep(1000);
    }
    
    @Then("The test case fields should be editable")
    public void the_test_case_fields_should_be_editable() {
        // Write code here that turns the phrase above into concrete actions
        assert TestCaseRunner.testPage.caseDescription.isEnabled();
        assert TestCaseRunner.testPage.caseSteps.isEnabled();

    }
    
    @When("The tester types in a new description into the description text area")
    public void the_tester_types_in_a_new_description_into_the_description_text_area() {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.caseDescription.clear();
        TestCaseRunner.testPage.caseDescription.sendKeys("Automated Test Case");
    }
    
    @When("The tester types in a new steps into the steps text area")
    public void the_tester_types_in_a_new_steps_into_the_steps_text_area() {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.caseSteps.clear();
        TestCaseRunner.testPage.caseSteps.sendKeys("Automated Test Case");
    }
    
    @When("The tester clicks on the automated check mark")
    public void theTesterClicksOnTheAutomatedCheckMark() {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.automatedCheckBox.click();
    }
    
    @When("The tester selects ryeGuy for performed from drop down")
    public void theTesterSelectsRyeGuyForPerformedFromDropDown() {
        // Write code here that turns the phrase above into concrete actions
        Select select = new Select(TestCaseRunner.testPage.performedByDropdown);
        select.selectByVisibleText("ryeGuy");
    }
    
    @When("The tester selects FAIL for test result from drop down")
    public void theTesterSelectsFAILForTestResultFromDropDown() {
        // Write code here that turns the phrase above into concrete actions
        Select select = new Select(TestCaseRunner.testPage.testResultDropdown);
        select.selectByVisibleText("FAIL");
    }


    @When("The tester types in a new summary into the summary text area")
    public void theTesterTypesInANewSummaryIntoTheSummaryTextArea() {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.summaryInput.clear();
        TestCaseRunner.testPage.summaryInput.sendKeys("Automated Test Case");
    }

    @When("The tester clicks save on test case page")
    public void theTesterClicksSaveOnTestCasePage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TestCaseRunner.testPage.saveCaseButton.click();
        Thread.sleep(1000);
    }


    @Then("A confirmation prompt should appear")
    public void aConfirmationPromptShouldAppear() {
        // check if browser shows confirmation prompt
        Alert alert = TestCaseRunner.driver.switchTo().alert();
        assert alert.getText().equals("Are you sure you want to update the test case?");
    }


    @When("The tester clicks on Ok")
    public void theTesterClicksOnOk() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Alert alert = TestCaseRunner.driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);
    }

    @Then("An alert says the test case has been saved")
    public void anAlertSaysTheTestCaseHasBeenSaved() {
        // Write code here that turns the phrase above into concrete actions
        Alert alert = TestCaseRunner.driver.switchTo().alert();
        assert alert.getText().equals("Test Case has been Saved");
        alert.accept();
    }

    //Scenario: Reset Test Case

    @Given("the tester is on the test case editor for a specific test case")
    public void theTesterIsOnTheTestCaseEditorForASpecificTestCase() throws InterruptedException {
        TestCaseRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        TestCaseRunner.loginPage.username.sendKeys("cavalier89");
        TestCaseRunner.loginPage.password.sendKeys("alucard");
        TestCaseRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        TestCaseRunner.homePage.testCasesLink.click();
        Thread.sleep(1000);
        TestCaseRunner.testPage.lastTestCaseDetails.click();
        Thread.sleep(1000);
        TestCaseRunner.testPage.editButton.click();
        Thread.sleep(1000);
        assert TestCaseRunner.testPage.descriptionTitle.isDisplayed();
    }


    @When("The Tester clicks on the edit button")
    public void theTesterClicksOnTheEditButton() throws InterruptedException {
        TestCaseRunner.testPage.editCaseButton.click();
        Thread.sleep(1000);
    }


    @When("The tester clicks on the reset button")
    public void theTesterClicksOnTheResetButton() throws InterruptedException {
        TestCaseRunner.testPage.resetCaseButton.click();
        Thread.sleep(1000);
    }


    @Then("The fields should be populated to their old values")
    public void theFieldsShouldBePopulatedToTheirOldValues() {
        assert !TestCaseRunner.testPage.testResult.getText().equals("FAIL");
    }
}
