package genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentSparkReporter reporter;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeSuite(alwaysRun=true)
	public void launchingBrowser() {
		reporter=new ExtentSparkReporter("");
		report=new ExtentReports();
		report.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@BeforeClass
	public void navigatingToApp() {
		driver.get("https://demowebshop.tricentis.com/login");
	}

	@AfterClass
	public void loggingOut() {

	}
	@AfterSuite
	public void tearDownTheBrowser() {

	}
}
