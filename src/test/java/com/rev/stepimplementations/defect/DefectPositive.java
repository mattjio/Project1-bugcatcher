package com.rev.stepimplementations.defect;

import com.rev.runners.DefectRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class DefectPositive {

    @Given("The employee is on the Defect Reporter Page")
    public void theEmployeeIsOnTheDefectReporterPage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        DefectRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        DefectRunner.loginPage.username.sendKeys("g8tor");
        DefectRunner.loginPage.password.sendKeys("chomp!");
        DefectRunner.loginPage.loginButton.click();
        wait(1000);
        DefectRunner.homePage.reportDefectLink.click();
        wait(1000);
        String currentUrl = DefectRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/defectreporter");
    }

    @When("The employee selects todays date")
    public void theEmployeeSelectsTodaysDate() throws InterruptedException {
        DefectRunner.defectPage.dateInput.sendKeys("11032022");
    }

    @When("The employee types in Description with")
    public void theEmployeeTypesInDescriptionWith() throws InterruptedException {
        DefectRunner.defectPage.descriptionInput.sendKeys(" Users are able to create multiple accounts using the same username but\n" +
                "with a different password.");
        wait(1000);
    }

    @When("The employee types in Steps with")
    public void theEmployeeTypesInStepsWith() throws InterruptedException {
        DefectRunner.defectPage.stepsInput.sendKeys("1. User creates a new account\n" +
                "2. User reloads the new user page\n" +
                "3. User creates an account with same username but different password");
        wait(1000);
    }

    @When("The employee selects high priority")
    public void theEmployeeSelectsHighPriority() throws InterruptedException {
        wait(1000);
        String currentPriority = DefectRunner.defectPage.priorityValue.getText();
        assert currentPriority.equals("High");
    }

    @When("The employee selects low severity")
    public void theEmployeeSelectsLowSeverity() throws InterruptedException {
        // click on severity slider
        Actions move = new Actions(DefectRunner.driver);
        Action action = move.dragAndDropBy(DefectRunner.defectPage.severitySlider, 0, 0).build();
        action.perform();
        wait(1000);
        String currentSeverity = DefectRunner.defectPage.severityValue.getText();
        assert currentSeverity.equals("LOW");
    }

    @When("The employee clicks the report button")
    public void theEmployeeClicksTheReportButton() throws InterruptedException {
        DefectRunner.defectPage.reportButton.click();
        wait(1000);
    }

    @Then("There should be a confirmation box")
    public void thereShouldBeAConfirmationBox() {
        Alert alert = DefectRunner.driver.switchTo().alert();
        String alertText = alert.getText();
        assert alertText.equals("Confirm Bug Report?");
    }

    @When("The employee clicks Ok")
    public void theEmployeeClicksOk() throws InterruptedException {
        Alert alert = DefectRunner.driver.switchTo().alert();
        alert.accept();
        wait(1000);
    }

    @Then("A modal should appear with a Defect ID")
    public void aModalShouldAppearWithADefectID() {
        // switch to modal
        DefectRunner.driver.switchTo().frame(DefectRunner.defectPage.modalFrame);
        assert DefectRunner.defectPage.modalTitle.isDisplayed();
    }

    @When("The employee clicks close")
    public void theEmployeeClicksClose() throws InterruptedException {
        DefectRunner.defectPage.modalCloseButton.click();
        wait(1000);
    }

    @Then("The modal should disappear")
    public void theModalShouldDisappear() {
    }

}
