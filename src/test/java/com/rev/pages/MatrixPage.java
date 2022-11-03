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


    public MatrixPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
