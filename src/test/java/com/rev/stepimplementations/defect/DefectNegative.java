package com.rev.stepimplementations.defect;

import com.rev.runners.DefectRunner;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;

public class DefectNegative {

    // not working as expected
    @Then("No confirmation dialog appears")
    public void theEmployeeIsOnTheDefectReporterPage() {
        // assert alert is not present
       if (DefectRunner.driver.switchTo().alert().getText().equals("Confirm Bug Report?")) {
           // if alert is present, dismiss it
              assert false;
              DefectRunner.driver.switchTo().alert().dismiss();

       }
    }
}
