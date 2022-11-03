package com.rev.stepimplementations.defect;

import com.rev.runners.DefectRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignDefect {

    @Given("The manager is logged in as a manager")
    public void the_manager_is_logged_in_as_a_manager() throws InterruptedException {
        DefectRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        DefectRunner.loginPage.username.sendKeys("g8tor");
        DefectRunner.loginPage.password.sendKeys("chomp!");
        DefectRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
    }
    @Given("The manager is on the home page")
    public void the_manager_is_on_the_home_page() {
        assert DefectRunner.driver.getCurrentUrl().equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }

    @Then("The manager should see pending defects")
    public void theManagerShouldSeePendingDefects() {
        assert DefectRunner.defectPage.defectTable.isDisplayed();

    }

    @When("The manager clicks on the select button for a defect")
    public void theManagerClicksOnTheSelectButtonForADefect() throws InterruptedException {
        DefectRunner.defectPage.lastSelectButtonDefectTable.click();
        Thread.sleep(1000);
    }

    @Then("The defect description should appear in bold")
    public void theDefectDescriptionShouldAppearInBold() {
        assert DefectRunner.defectPage.boldDescription.isDisplayed();
    }

    @When("The manager selects an tester from the drop down")
    public void theManagerSelectsAnTesterFromTheDropDown() {
        DefectRunner.defectPage.assignTesterInput.click();
        DefectRunner.defectPage.assignTesterInput.sendKeys("cavalier89");
    }

    @When("The manager clicks assign")
    public void theManagerClicksAssign() throws InterruptedException {
        DefectRunner.defectPage.assignButton.click();
        Thread.sleep(1000);
    }

    @Then("The defect should disappear from the list")
    public void theDefectShouldDisappearFromTheList() {
        assert DefectRunner.defectPage.defectTable.isDisplayed();
    }

    @Given("The assigned tester is on their home page")
    public void theAssignedTesterIsOnTheirHomePage() throws InterruptedException {
        // manager logs out
        DefectRunner.homePage.logoutLink.click();
        Thread.sleep(1000);
        // tester logs in
        DefectRunner.loginPage.username.sendKeys("cavalier89");
        DefectRunner.loginPage.password.sendKeys("alucard");
        DefectRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        // tester should be on home page
        String currentUrl = DefectRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/testerhome");
    }

    @Then("The tester should see the pending defect")
    public void theTesterShouldSeeThePendingDefect() {
        assert DefectRunner.defectPage.lastDefectAssigned.isDisplayed();
    }
}
