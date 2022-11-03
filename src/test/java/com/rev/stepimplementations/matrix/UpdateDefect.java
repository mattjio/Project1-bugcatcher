package com.rev.stepimplementations.matrix;

import com.rev.runners.MatrixRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class UpdateDefect {

    @Given("A manager or tester has selected a matrix")
    public void aManagerOrTesterHasSelectedAMatrix() throws InterruptedException {
        // manager logs in
        MatrixRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        MatrixRunner.loginPage.username.sendKeys("g8tor");
        MatrixRunner.loginPage.password.sendKeys("chomp!");
        MatrixRunner.loginPage.loginButton.click();
        Thread.sleep(1000);
        assert MatrixRunner.driver.getCurrentUrl().equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
        // manager moves to matrix page and selects a matrix
        MatrixRunner.homePage.matricesLink.click();
        Thread.sleep(1000);
        MatrixRunner.matrixPage.lastMatrixShowButton.click();
        Thread.sleep(1000);
        MatrixRunner.matrixPage.lastMatrixEditButton.click();
        Thread.sleep(1000);
    }

    @When("A manager or tester adds or removes defects")
    public void aManagerOrTesterAddsOrRemovesDefects() throws InterruptedException {
        MatrixRunner.matrixPage.lastMatrixDefectInput.click();
        Thread.sleep(1000);
        MatrixRunner.matrixPage.lastMatrixDefectInput.sendKeys("120");
        MatrixRunner.matrixPage.lastMatrixDefectAddButton.click();
        Thread.sleep(1000);
        String defect = MatrixRunner.matrixPage.lastMatrixDefectData.getText();
        assert defect.equals("120");
        MatrixRunner.matrixPage.lastMatrixDefectRemoveButton.click();
        Thread.sleep(1000);
        assert MatrixRunner.matrixPage.lastMatrixDefectData.getText().equals("None");
    }


    @When("A manager or tester confirms their changes")
    public void aManagerOrTesterConfirmsTheirChanges() throws InterruptedException {
        MatrixRunner.matrixPage.lastMatrixDefectInput.click();
        Thread.sleep(1000);
        MatrixRunner.matrixPage.lastMatrixDefectInput.clear();
        MatrixRunner.matrixPage.lastMatrixDefectInput.sendKeys("300");
        MatrixRunner.matrixPage.lastMatrixDefectAddButton.click();
        Thread.sleep(1000);
        String defect = MatrixRunner.matrixPage.lastMatrixDefectData.getText();
        assert defect.equals("300");
    }


    @Then("Then the matrix should saved")
    public void thenTheMatrixShouldSaved() throws InterruptedException {
        MatrixRunner.matrixPage.lastMatrixSaveButton.click();
        Thread.sleep(1000);
        Alert alert = MatrixRunner.driver.switchTo().alert();
        assert alert.getText().equals("Matrix Saved");
        alert.accept();
    }
}
