package com.rev.runners;


import com.rev.pages.LoginPage;
import com.rev.pages.HomePage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(
        features = "src/test/resources/features/login",
        glue = "com.rev.stepimplementations.login",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class LoginRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static HomePage homePage;

    @BeforeMethod
    public void setup() {
       WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
