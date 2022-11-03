package com.rev.runners;

import com.rev.pages.DefectReporterPage;
import com.rev.pages.HomePage;
import com.rev.pages.LoginPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(
        features = "src/test/resources/features/defect",
        glue = "com.rev.stepimplementations.defect",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class DefectRunner extends AbstractTestNGCucumberTests {

    public static ChromeDriver driver;
    public static LoginPage loginPage;
    public static HomePage homePage;
    public static DefectReporterPage defectPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        defectPage = new DefectReporterPage(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
