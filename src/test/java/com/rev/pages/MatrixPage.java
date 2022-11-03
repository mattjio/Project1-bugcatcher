package com.rev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatrixPage {

    @FindBy(xpath = "//button[contains(text(),'Create A new Requirements Matrix')]")
    public WebElement createNewMatrixButton;

    @FindBy(xpath = "//h2[contains(text(),'New matrix')]")
    public WebElement newMatrixHeader;

    @FindBy(xpath = "//body/div[@id='root']/input[1]")
    public WebElement newMatrixTitle;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
    public WebElement userStoryInput;

    @FindBy(xpath = "//tbody//tr//td//select")
    public WebElement priorityDropdown;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
    public WebElement noteInput;

    @FindBy(xpath = "//button[contains(text(),'Add Requirement')]")
    public WebElement addRequirementButton;

    @FindBy(xpath = "//button[contains(text(),'Create Matrix')]")
    public WebElement createMatrixButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[1]")
    public WebElement userStoryDisplay;

    @FindBy(xpath = "//body/div[@id='root']/ul[1]/li[last()]")
    public WebElement lastMatrix;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/span[1]/button[1]")
    public WebElement lastMatrixShowButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[1]")
    public WebElement lastMatrixEditButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
    public WebElement lastMatrixTestCaseData;

    @FindBy(xpath = "//body/div[@id='root']/ul[1]/li[last()]/div[1]/div[1]/div[1]/ul[2]/li[1]/input[1]")
    public WebElement lastMatrixDefectInput;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/ul[2]/li[1]/button[1]")
    public WebElement lastMatrixDefectAddButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
    public WebElement lastMatrixTestCaseAddButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/ul[2]/li[1]/button[1]")
    public WebElement lastMatrixDefectRemoveButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
    public WebElement lastMatrixTestCaseRemoveButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/button[1]")
    public WebElement lastMatrixSaveButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
    public WebElement lastMatrixDefectData;

    @FindBy(xpath = "//body/div[@id='root']/ul[1]/li[last()]/div[1]/div[1]/div[1]/ul[1]/li[1]/input[1]")
    public WebElement lastMatrixTestCaseInput;

    public MatrixPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
