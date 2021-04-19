package FM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {

	public static WebDriver driver;

	@Given("^User present in Adactin Login page$")
	public void adactinLoginPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	    	}

	@When("^User Enter Username$")
	public void username() {
		driver.findElement(By.id("username")).sendKeys("rameshadepu");
	    
	}

	@When("^User Enter Password$")
	public void password() {
		driver.findElement(By.id("password")).sendKeys("ramesh");
	}

	@When("^User Click on Login Button$")
	public void login() {
		driver.findElement(By.id("login")).click();
	}

	@Then("^Get Title of the Page$")
	public void TitleOfPage() {
		String ExpectedTitle  = "Adactin.com - Search Hotel";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	@Then("^Close$")
	public void close() {
		driver.close();
	}
}
