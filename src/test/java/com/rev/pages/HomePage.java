package com.rev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//body/div[@id='root']/nav[1]/p[1]")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//a[contains(text(),'Matrices')]")
    public WebElement matricesLink;

    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement testCasesLink;

    @FindBy(xpath = "//a[contains(text(),'Report a Defect')]")
    public WebElement reportDefectLink;

    @FindBy(xpath = "//a[contains(text(),'Defect Overview')]")
    public WebElement defectOverviewLink;

    @FindBy(xpath = "//a[contains(text(),'Log Out')]")
    public WebElement logoutLink;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homeLink;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
