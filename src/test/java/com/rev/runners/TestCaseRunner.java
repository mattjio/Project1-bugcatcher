package com.rev.runners;

import com.rev.pages.HomePage;
import com.rev.pages.LoginPage;
import com.rev.pages.TestPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        features = "src/test/resources/features/testcases",
        glue = "com.rev.stepimplementations.tester",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class TestCaseRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static TestPage testPage;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        testPage = new TestPage(driver);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
