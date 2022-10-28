package com.rev.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//body/div[@id='root']/fieldset[1]/input[1]")
    public WebElement username;

    @FindBy(xpath = "//body/div[@id='root']/fieldset[1]/input[2]")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement loginButton;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
