package com.rev.pages;

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

    @FindBy(xpath = "//a[contains(text(),'Edit')]")
    public WebElement editCaseButton;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement resetCaseButton;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement saveCaseButton;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[1]/input[1]")
    public WebElement automatedCheckbox;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[1]/select[1]")
    public WebElement perfomedByDropdown;

    @FindBy(xpath = "//body/div[@id='root']/form[1]/fieldset[1]/textarea[1]")
    public WebElement descriptionInput;

    @FindBy(xpath = "//body/div[@id='root']/form[1]/fieldset[1]/textarea[2]")
    public WebElement stepsInput;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;


    @FindBy(xpath = "//tbody/tr[last()]/td[2]")
    public WebElement lastTestCaseDescription;

    @FindBy(xpath = "//tbody/tr[last()]/td[3]")
    public WebElement lastTestCaseResult;

    @FindBy(xpath = "//tbody/tr[last()]/td[4]/button")
    public WebElement lastTestCaseDetails;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/p[6]")
    public WebElement performedBy;


    public String testCaseUrl = "https://bugcatcher-jasdhir.coe.revaturelabs.com/testcases";

    @FindBy(xpath = "//body/div[4]/div[1]/div[1]")
    public WebElement detailsModal;

    @FindBy(xpath = "/html/body/div[4]/div/div/h3")
    public WebElement caseTitle;
    // split up case title into 2 parts
    @FindBy(xpath = "/html/body/div[4]/div/div/h3/span[1]")
    public WebElement caseTitlePart1;
    @FindBy(xpath = "/html/body/div[4]/div/div/h3/span[2]")
    public WebElement caseId;



    
    
    


    public TestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
