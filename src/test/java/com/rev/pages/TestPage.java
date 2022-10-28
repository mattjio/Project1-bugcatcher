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

    public String testCaseUrl = "https://bugcatcher-jasdhir.coe.revaturelabs.com/testcases";


    public TestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
