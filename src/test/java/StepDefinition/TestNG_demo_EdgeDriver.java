package StepDefinition;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_demo_EdgeDriver {
	public static WebDriver driver;

	@Test
	public void launch_Application() {

		Reporter.log("Executing launch_Application");

	    
		    WebDriverManager manager = WebDriverManager.edgedriver(); 
		    manager.config().setEdgeDriverVersion("111.0.1661.62"); 
		    manager.setup(); 
		    EdgeOptions options = new EdgeOptions(); 
		    //options = webdriver.ChromeOptions()
		    options.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
		    options.setExperimentalOption("useAutomationExtension", false);
		    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

		    		
		    driver = new EdgeDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        driver.manage().window().maximize();

		

		driver.get("https://www.saucedemo.com/");
		System.out.println("Launch application");

		String title = driver.getTitle();
		assertEquals("Swag Labs", title);

	}

	@Test(priority = 1)
	public void login() {
		System.out.println("login in to application");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}

	@Test(priority = 2)
	public void add_product() throws InterruptedException {
		Reporter.log("adding product ");
		assertTrue(true);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(7000);
	}

	@Test(priority = 3)
	public void customer_info() {
		Reporter.log("processing customer_Info");
		assertTrue(true);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.id("checkout")).click();
		// checkout

		driver.findElement(By.id("first-name")).sendKeys("Boii");
		driver.findElement(By.id("last-name")).sendKeys("Moda");
		driver.findElement(By.id("postal-code")).sendKeys("1234");

	}
	
	@Test(enabled=false)
	public void paymentDetails() {
	//	System.out.println("This is Payment details test Method");
		Reporter.log( "Payment details Test execution");
	}

	@Test(priority = 4)
	public void check_out() throws InterruptedException {
		Reporter.log("processing check_out");
		driver.findElement(By.id("continue")).click();
		// finish
		driver.findElement(By.id("finish")).click();
		// driver.findElement(By.id("react-burger-menu-btn")).click();
		// logout_sidebar_link
		Thread.sleep(7000);
	}

	@Test(priority = 5)
	public void Logout() throws InterruptedException {
		assertTrue(true);
		Reporter.log("Executing Logout");
		// driver.findElement(By.id("react-burger-menu-btn")).click();
		// logout_sidebar_link
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
//		Actions obj = new Actions(driver);
//		WebElement objLog = driver.findElement(By.id("logout_sidebar_link"));
//
//		Action mousehover = obj.moveToElement(objLog).build();
//		mousehover.perform();
//
//		Thread.sleep(7000);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing after method");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing before method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Executing after method");
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing before method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Executing after method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing before method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Executing after method");
	}

}