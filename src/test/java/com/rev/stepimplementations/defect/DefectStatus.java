package com.rev.stepimplementations.defect;

import com.rev.runners.DefectRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefectStatus {

    @Given("The tester is on the Home Page")
    public void theTesterIsOnTheHomePage() throws InterruptedException {
        DefectRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        DefectRunner.loginPage.username.sendKeys("cavalier89");
        DefectRunner.loginPage.password.sendKeys("alucard");
        DefectRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        assert DefectRunner.driver.getCurrentUrl().equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/testerhome");
    }


    @Then("The tester can can see only defects assigned to them")
    public void theTesterCanCanSeeOnlyDefectsAssignedToThem() {
        assert DefectRunner.defectPage.lastDefectAssigned.isDisplayed();
    }

    @When("The tester changes to defect to any status")
    public void theTesterChangesToDefectToAnyStatus() throws InterruptedException {
        DefectRunner.defectPage.lastDefectStatus.click();
        Thread.sleep(1000);
        DefectRunner.defectPage.lastDefectChangeStatusButton.click();
        Thread.sleep(1000);
        DefectRunner.defectPage.acceptedStatusButton.click();
        Thread.sleep(1000);
    }

    @Then("The tester should see the defect has a different status")
    public void theTesterShouldSeeTheDefectHasADifferentStatus() {
        assert !DefectRunner.defectPage.lastDefectStatus.getText().equals("Pending");
    }
}
