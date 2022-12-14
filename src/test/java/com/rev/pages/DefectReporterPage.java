package com.rev.pages;


import com.rev.runners.DefectRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefectReporterPage {

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/input[1]")
    public WebElement dateInput;

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/textarea[1]")
    public WebElement descriptionInput;

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/textarea[2]")
    public WebElement stepsInput;

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/input[2]")
    public WebElement severitySlider;

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/p[1]")
    public WebElement severityValue;

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/input[3]")
    public WebElement prioritySlider;

    @FindBy(xpath = "//body/div[@id='root']/form[@id='defectReport']/p[2]")
    public WebElement priorityValue;

    @FindBy(xpath = "//button[contains(text(),'Report')]")
    public WebElement reportButton;

    @FindBy(className = "ReactModal__Content")
    public WebElement modalContainer;

    @FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/h4[1]")
    public WebElement modalTitle;

    @FindBy(xpath = "//h1[contains(text(),'Defect Reporter')]")
    public WebElement defectReporterTitle;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    public WebElement modalCloseButton;

    @FindBy(xpath = "//body/div[@id='root']/table[1]")
    public WebElement defectTable;

    @FindBy(xpath = "//tbody/tr[last()]/td[3]/button[1]")
    public WebElement lastSelectButtonDefectTable;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/h4[1]")
    public WebElement boldDescription;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/input[1]")
    public WebElement assignTesterInput;

    @FindBy(xpath = "//button[contains(text(),'Assign')]")
    public WebElement assignButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/span[1]/p[1]")
    public WebElement lastDefectAssigned;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/span[1]/p[1]/b[2]")
    public WebElement lastDefectStatus;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")
    public WebElement lastDefectChangeStatusButton;

    @FindBy(xpath = "//body[1]/div[1]/ul[1]/li[last()]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement acceptedStatusButton;


    public DefectReporterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
