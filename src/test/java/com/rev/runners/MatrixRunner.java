package com.rev.runners;

import com.rev.pages.HomePage;
import com.rev.pages.LoginPage;
import com.rev.pages.MatrixPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;

@CucumberOptions(
        features = "src/test/resources/features/matrix",
        glue = "com.rev.stepimplementations.matrix",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class MatrixRunner extends AbstractTestNGCucumberTests {

    public static ChromeDriver driver;
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static MatrixPage matrixPage;

    public static void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        matrixPage = new MatrixPage(driver);
    }

    public static void teardown() {
        driver.quit();
    }
}
