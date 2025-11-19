package StepDefination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class LoginScenarioTestCaseStepDefinations {

	WebDriver driver = null;

	@Given("user navigates to facebook URL")
	public void user_navigates_to_facebook_url() {
		// Write code here that turns the phrase above into concrete actions
//		System.getProperty("webDriver.chrome,driver","C:/Users/SHREE/Desktop/Vijayaa/VIJUUU/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	@When("User enter valid username and passwords")
	public void user_enter_valid_username_and_passwords() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");

	}

	@Then("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
		driver.findElement(By.name("login")).click();

	}
	@When("the page is loaded completely")
	public void the_page_is_loaded_completely() {
	    // Wait for the page to load completely
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(webDriver -> ((JavascriptExecutor) webDriver)
	            .executeScript("return document.readyState").equals("complete"));
	}

	@Then("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String expectedTitle) {
	    // Get actual title
	    String actualTitle = driver.getTitle();

	    // Print title for debugging
	    System.out.println("Actual Page Title: " + actualTitle);

	    // Assertion
	    Assert.assertEquals("Page title does not match!", expectedTitle, actualTitle);

	}

	}


