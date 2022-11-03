package com.rev.stepimplementations.matrix;


import com.rev.runners.MatrixRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class NewMatrix {

    @Given("A manager is on their home page")
    public void aManagerIsOnTheirHomePage() throws InterruptedException {
        MatrixRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        MatrixRunner.loginPage.username.sendKeys("g8tor");
        MatrixRunner.loginPage.password.sendKeys("chomp!");
        MatrixRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        assert MatrixRunner.driver.getCurrentUrl().equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }


    @Then("A manager can pull up a form to make a new matrix")
    public void aManagerCanPullUpAFormToMakeANewMatrix() throws InterruptedException {
        MatrixRunner.matrixPage.createNewMatrixButton.click();
        Thread.sleep(1000);
        assert MatrixRunner.matrixPage.newMatrixHeader.isDisplayed();
    }


    @When("A manager creates a title for a matrix")
    public void aManagerCreatesATitleForAMatrix() {
        MatrixRunner.matrixPage.newMatrixTitle.sendKeys("Test Matrix");
    }


    @When("A manager adds requirements to a matrix")
    public void aManagerAddsRequirementsToAMatrix() throws InterruptedException {
        MatrixRunner.matrixPage.userStoryInput.sendKeys("Test User Story");
        MatrixRunner.matrixPage.priorityDropdown.click();
        MatrixRunner.matrixPage.priorityDropdown.sendKeys("Medium");
        MatrixRunner.matrixPage.noteInput.sendKeys("Test Note");
        MatrixRunner.matrixPage.addRequirementButton.click();
        Thread.sleep(1000);
        assert MatrixRunner.matrixPage.userStoryDisplay.isDisplayed();
    }


    @When("A manager saves a matrix")
    public void aManagerSavesAMatrix() throws InterruptedException {
        MatrixRunner.matrixPage.createMatrixButton.click();
        Thread.sleep(1000);
    }


    @Then("The matrix should be visible for all testers and managers")
    public void theMatrixShouldBeVisibleForAllTestersAndManagers() throws InterruptedException {
        Alert alert = MatrixRunner.driver.switchTo().alert();
        alert.accept();
        MatrixRunner.homePage.matricesLink.click();
        Thread.sleep(1000);
        assert MatrixRunner.matrixPage.lastMatrix.isDisplayed();
    }
}
