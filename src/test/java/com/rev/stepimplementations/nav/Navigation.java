package com.rev.stepimplementations.nav;


import com.rev.runners.NavRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Navigation {

    @Given("The manager is logged in as a manager")
    public void the_manager_is_logged_in_as_a_manager() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.driver.get("https://bugcatcher-jasdhir.coe.revaturelabs.com/?dev=16");
        NavRunner.loginPage.username.sendKeys("g8tor");
        NavRunner.loginPage.password.sendKeys("chomp!");
        NavRunner.loginPage.loginButton.click();
    }
    @Given("The manager is on the home page")
    public void the_manager_is_on_the_home_page() {

        String currentUrl = NavRunner.driver.getCurrentUrl();
        System.out.println(currentUrl);
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }

    @Then("The manager should see links for Matrices, Test Cases, Defect Reporting and Defect Overview")
    public void theManagerShouldSeeLinksForMatricesTestCasesDefectReportingAndDefectOverview() {
        // Write code here that turns the phrase above into concrete actions
        assert NavRunner.homePage.matricesLink.isDisplayed();
        assert NavRunner.homePage.testCasesLink.isDisplayed();
        assert NavRunner.homePage.reportDefectLink.isDisplayed();
        assert NavRunner.homePage.defectOverviewLink.isDisplayed();
    }

    @When("The manager clicks on Matrices")
    public void theManagerClicksOnMatrices() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.matricesLink.click();
    }

    @Then("The title of the page should be Matrix Page")
    public void theTitleOfThePageShouldBeMatrixPage() {
        // Write code here that turns the phrase above into concrete actions
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/matrices");
    }

    @When("The manager clicks the browser back button")
    public void theManagerClicksTheBrowserBackButton() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.driver.navigate().back();
    }

    @Then("The manager should be on the home page and the title of page is Home")
    public void theManagerShouldBeOnTheHomePageAndTheTitleOfPageIsHome() {
        // Write code here that turns the phrase above into concrete actions
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }

    @When("The manager clicks on Test Cases")
    public void theManagerClicksOnTestCases() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.testCasesLink.click();
    }

    @When("The manager clicks on Report a Defect")
    public void theManagerClicksOnReportADefect() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.reportDefectLink.click();
    }

    @Then("The title of the page should be Defect Reporting")
    public void theTitleOfThePageShouldBeDefectReporting() {
        // Write code here that turns the phrase above into concrete actions
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/defectreporter");
    }

    @When("The manager clicks on Defect Overview")
    public void theManagerClicksOnDefectOverview() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.defectOverviewLink.click();
    }

    @Then("The title of the page should be Defect Overview")
    public void theTitleOfThePageShouldBeDefectOverview() {
        // Write code here that turns the phrase above into concrete actions
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/defectoverview");
    }

}
