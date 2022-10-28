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
    public void the_manager_is_on_the_home_page() throws InterruptedException {
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        System.out.println(currentUrl);
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }

    @Then("The manager should see links for Matrices, Test Cases, Defect Reporting and Defect Overview")
    public void theManagerShouldSeeLinksForMatricesTestCasesDefectReportingAndDefectOverview() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
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

    @Then("The manager should be on the Matrix Page")
    public void theTitleOfThePageShouldBeMatrixPage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/matrices");
    }

    @When("The manager clicks the browser back button")
    public void theManagerClicksTheBrowserBackButton() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.driver.navigate().back();
    }

    @Then("The manager should be on the home page and the title of page is Home")
    public void theManagerShouldBeOnTheHomePageAndTheTitleOfPageIsHome() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/managerhome");
    }

    @When("The manager clicks on Test Cases")
    public void theManagerClicksOnTestCases() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.testCasesLink.click();
    }


    @Then("The manager should see all links")
    public void the_manager_should_see_all_links() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        assert NavRunner.homePage.matricesLink.isDisplayed();
        assert NavRunner.homePage.testCasesLink.isDisplayed();
        assert NavRunner.homePage.reportDefectLink.isDisplayed();
        assert NavRunner.homePage.defectOverviewLink.isDisplayed();

    }

    @When("The manager clicks on the Matrices link")
    public void the_manager_clicks_on_the_matrices_link() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.matricesLink.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("The title of page should be Matrix Overview")
    public void the_title_of_page_should_be_matrix_overview() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/matrices");
        throw new io.cucumber.java.PendingException();
    }

    @When("The manager clicks on the Test Cases link")
    public void the_manager_clicks_on_the_test_cases_link() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.testCasesLink.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("The title of page should be Test Case Overview")
    public void the_title_of_page_should_be_test_case_overview() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/testcases");
        throw new io.cucumber.java.PendingException();
    }

    @When("The manager clicks on the Report a Defect link")
    public void the_manager_clicks_on_the_report_a_defect_link() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.reportDefectLink.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("The title of page should be Report a Defect")
    public void the_title_of_page_should_be_report_a_defect() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/defectreporter");
        throw new io.cucumber.java.PendingException();
    }

    @When("The manager clicks on the Defect Overview link")
    public void the_manager_clicks_on_the_defect_overview_link() {
        // Write code here that turns the phrase above into concrete actions
        NavRunner.homePage.defectOverviewLink.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("The title of page should be Defect Overview")
    public void the_title_of_page_should_be_defect_overview() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        String currentUrl = NavRunner.driver.getCurrentUrl();
        assert currentUrl.equals("https://bugcatcher-jasdhir.coe.revaturelabs.com/defectoverview");
        throw new io.cucumber.java.PendingException();
    }

}
