package com.rev.stepimplementations.matrix;

import com.rev.runners.MatrixRunner;
import io.cucumber.java.en.When;

public class UpdateTestCase {

    @When("A manager or tester adds or removes Test Cases")
    public void aManagerOrTesterAddsOrRemovesTestCases() throws InterruptedException {
        MatrixRunner.matrixPage.lastMatrixTestCaseInput.click();
        Thread.sleep(1000);
        MatrixRunner.matrixPage.lastMatrixTestCaseInput.sendKeys("120");
        MatrixRunner.matrixPage.lastMatrixTestCaseAddButton.click();
        Thread.sleep(1000);
        String defect = MatrixRunner.matrixPage.lastMatrixTestCaseData.getText();
        assert defect.equals("120");
        MatrixRunner.matrixPage.lastMatrixTestCaseRemoveButton.click();
        Thread.sleep(1000);
        assert MatrixRunner.matrixPage.lastMatrixTestCaseData.getText().equals("");
    }

    @When("A manager or tester confirms changes")
    public void aManagerOrTesterConfirmsChanges() throws InterruptedException {
        MatrixRunner.matrixPage.lastMatrixTestCaseInput.click();
        Thread.sleep(1000);
        MatrixRunner.matrixPage.lastMatrixTestCaseInput.clear();
        MatrixRunner.matrixPage.lastMatrixTestCaseInput.sendKeys("300");
        MatrixRunner.matrixPage.lastMatrixTestCaseAddButton.click();
        Thread.sleep(1000);
        String defect = MatrixRunner.matrixPage.lastMatrixTestCaseData.getText();
        assert defect.equals("300");
    }
}
