package com.rev.pages;

import com.rev.runners.TestCaseRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {

    @FindBy(xpath = "//tbody//tr//td//button")
    public WebElement detailsButton;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    public WebElement closeButton;

    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editCaseButton;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement resetCaseButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveCaseButton;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[1]/input[1]")
    public WebElement automatedCheckBox;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[1]/select[1]")
    public WebElement performedByDropdown;

    @FindBy(xpath = "//body/div[@id='root']/form[1]/fieldset[1]/textarea[1]")
    public WebElement descriptionInput;

    @FindBy(xpath = "//body/div[@id='root']/form[1]/fieldset[1]/textarea[2]")
    public WebElement stepsInput;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[2]/select[1]")
    public WebElement testResultDropdown;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[2]/textarea[1]")
    public WebElement summaryInput;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;


    @FindBy(xpath = "//tbody/tr[last()]/td[2]")
    public WebElement lastTestCaseDescription;

    @FindBy(xpath = "//tbody/tr[last()]/td[3]")
    public WebElement lastTestCaseResult;

    @FindBy(xpath = "//tbody/tr[last()]/td[4]/button[1]")
    public WebElement lastTestCaseDetails;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/p[6]")
    public WebElement performedBy;


    public String testCaseUrl = "https://bugcatcher-jasdhir.coe.revaturelabs.com/testcases";

    @FindBy(xpath = "//body/div[4]/div[1]/div[1]")
    public WebElement detailsModal;

    @FindBy(xpath = "/html/body/div[4]/div/div/h3[1]")
    public WebElement caseTitle;

    // caseid from case edit page
    @FindBy(xpath = "//body/div[@id='root']/h1[1]/span[2]")
    public WebElement caseId;

    // case editor page
    @FindBy(xpath = "/html[1]/body[1]/div[1]/fieldset[1]/textarea[1]")
    public WebElement caseDescription;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/fieldset[1]/textarea[2]")
    public WebElement caseSteps;

    @FindBy(xpath = "//p[contains(text(),'UNEXECUTED')]")
    public WebElement testResult;

    @FindBy(className = "ReactModal__Content")
    public WebElement modalContainer;

    @FindBy(xpath = "//h1[contains(text(),'Test Case Dashboard')]")
    public WebElement testCaseDashboard;

    public TestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
