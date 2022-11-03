package com.rev.runners;

import com.rev.pages.HomePage;
import com.rev.pages.LoginPage;
import com.rev.pages.MatrixPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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

    @BeforeMethod
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        matrixPage = new MatrixPage(driver);
    }
    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
