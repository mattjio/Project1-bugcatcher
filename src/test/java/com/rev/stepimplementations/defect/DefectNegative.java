package com.rev.stepimplementations.defect;

import com.rev.runners.DefectRunner;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;

public class DefectNegative {

    @Then("No confirmation dialog appears")
    public void theEmployeeIsOnTheDefectReporterPage() {
        // assert alert is not present
        try {
            Alert alert = DefectRunner.driver.switchTo().alert();
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }
}
