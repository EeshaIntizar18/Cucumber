package mvn;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public static WebDriver driver;
	WebElement ar;
	Properties p = new Properties();

	@Given("^Open chrome browser and enter url$")
	public void openbrowesr() throws InterruptedException {

		// Setting property for Chrome Driver
		System.out.println("Open browser");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path  is" + projectPath);
		System.setProperty("webdriver.chrome.driver", "/home/rlt/Downloads/chromedriver");

		// Instance of ChromeOption
		ChromeOptions options = new ChromeOptions();

		// Disable notification PopUp
		options.addArguments("--disable-notifications");

		// Instance of ChromeDriver.
		driver = new ChromeDriver(options);

		// Calling Ego HomePage
		driver.get("http://ego.co.uk/");
		Thread.sleep(1000);

		// Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(4500);

	}

	@When("^Enter search criteria$")
	public void search() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("heels", Keys.ENTER);
		Thread.sleep(3000);

		System.out.println("Search for desk,Pass");

		// click on size filter
		driver.findElement(By.className("filter-options-title")).click();
		Thread.sleep(3000);

		// select size
		driver.findElement(By.xpath(
				"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/a[3]/div"))
				.click();
		Thread.sleep(3000);

		// click on colour filter
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[1]/div"))
				.click();
		Thread.sleep(3000);

		// click on colour
		driver.findElement(By.className("layer-input-filter")).click();
		Thread.sleep(4000);

		// Scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);

		// click on product
		driver.findElement(
				By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[4]/div[2]/ol/li[3]/div/div[1]/a[1]/img"))
				.click();
		Thread.sleep(3000);

		// Clicking on product size
		driver.findElement(By.className("custom-select__trigger-size")).click();
		Thread.sleep(1000);

		// Selecting size
		driver.findElement(By.id("controlId-item-17")).click();
		Thread.sleep(1500);

		// Clicking on add to cart button
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);

		System.out.println("Pdp page for desk,Pass");
		// Clicking on view bag button
		driver.findElement(By.className("view")).click();
		Thread.sleep(4000);

		// Scrolling Down
		js.executeScript("window.scrollBy(0,50)", "");
		Thread.sleep(3000);

		// Clicking on quantity
		driver.findElement(By
				.xpath("/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select"))
				.click();
		Thread.sleep(2000);

		// Changing Quantity
		driver.findElement(By.xpath(
				"/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[2]"))
				.click();
		Thread.sleep(2500);

		// Clicking on checkout button
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[3]/div[4]/ul/li[1]/button")).click();
		Thread.sleep(2500);

		// Entering Email
		Thread.sleep(2500);
		js.executeScript("window.scrollBy(0,-150)", "");
		Thread.sleep(500);

		// Enter email
		driver.findElement(By.id("customer-email")).sendKeys("usman.ali@rltsquare.com");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,200)", "");

		// Selecting country drop down
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[1]/div/select"))
				.click();

		// Selecting United kingdom
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[1]/div/select/option[234]"))
				.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,50)", "");

		// Setting First name
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form[2]/div/div[2]/div/input"))
				.sendKeys("Test");

		// Setting Last name
		Thread.sleep(500);
		driver.findElement(By
				.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form[2]/div/div[3]/div/input"))
				.sendKeys("Test");
		// Entering post code
		Thread.sleep(500);
		driver.findElement(
				By.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[4]/div/input"))
				.sendKeys("M32 0JT");
		Thread.sleep(250);
		js.executeScript("window.scrollBy(0,50)", "");

		// Entering address line one
		Thread.sleep(500);
		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input"))
				.sendKeys("Unit A1, Thomas Street");

		// Entering address line two
		Thread.sleep(500);
		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/fieldset/div/div[2]/div/input"))
				.sendKeys("Longford Trading Estate Stretford");

		// Entering state
		Thread.sleep(500);
		driver.findElement(
				By.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[6]/div/input"))
				.sendKeys("Greater Manchester");

		// Entering city
		Thread.sleep(250);
		Thread.sleep(500);
		driver.findElement(
				By.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[7]/div/input"))
				.sendKeys("Manchester");

		// Entering mobile number
		Thread.sleep(500);
		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[8]/div/div[1]/input"))
				.sendKeys("+443222204317");
		Thread.sleep(500);

		js.executeScript("window.scrollBy(0,100)", "");
		System.out.println("Guest shipping address,Pass");

		// Clicking on shipping method
		driver.findElement(By.xpath(
				"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[2]/div/div[3]/form/div[2]/table/tbody/tr[2]/td[2]"))
				.click();
		Thread.sleep(3000);
		// Clicking on continue to Payment method Button
		driver.findElement(By.xpath("//span[text()='CONTINUE TO PAYMENT SECURELY']")).click();
		Thread.sleep(2000);

		// Scrolling Down
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		// Clicking on pay now by card
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[1]/label")).click();
		Thread.sleep(500);

		// Scrolling down
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(500);

		// Entering card details
		driver.switchTo().frame(driver.findElement(
				By.xpath("//*[@id=\"cardContainer\"]/div/div/div[2]/div[1]/div[1]/label/div/span/iframe")));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"encryptedCardNumber\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"encryptedCardNumber\"]")).sendKeys("3700 000000 00002");
		Thread.sleep(500);
		driver.switchTo().defaultContent();

		// Add expire date
		Thread.sleep(1500);

		// Converting iFrame to frame
		driver.switchTo().frame(driver.findElement(
				By.xpath("//*[@id=\"cardContainer\"]/div/div/div[2]/div[1]/div[2]/div[1]/label/div/span/iframe")));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"encryptedExpiryDate\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"encryptedExpiryDate\"]")).sendKeys("0330");
		Thread.sleep(500);
		driver.switchTo().defaultContent();

		// Add CVV
		Thread.sleep(1500);

		// Converting iFrame to frame
		driver.switchTo().frame(driver.findElement(
				By.xpath("//*[@id=\"cardContainer\"]/div/div/div[2]/div[1]/div[2]/div[2]/label/div/span/iframe")));
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"encryptedSecurityCode\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"encryptedSecurityCode\"]")).sendKeys("7373");
		Thread.sleep(500);
		driver.switchTo().defaultContent();

		// Add name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("e");
		driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@classnamemodifiers='large']")).sendKeys("t");
		Thread.sleep(500);

		// Click on place order button
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"adyen-cc-form\"]/div[3]/div/button")).click();

	}

	@Then("^Close Browser$")
	public void buton() {
		System.out.println("Close browser");
		driver.quit();
	}
}
