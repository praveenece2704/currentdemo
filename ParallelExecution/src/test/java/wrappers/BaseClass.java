package wrappers;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass implements BaseInterface {


	public  Properties property;
	public  WebDriver driver;
    public DesiredCapabilities cap;

	public BaseClass() {
		// super();
		property = new Properties();

		try {
			property.load(
					new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties"));
		} catch (Exception e) {
			System.out.println("Exception caught due to file not found is " + e.getMessage());
		}


	}

	@Override
	public void setUp() throws MalformedURLException {

		String browser = property.getProperty("browser"); 

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
	}

	public void openBaseUrl() {
		String url = property.getProperty("url");
		driver.get(url);
	}

 

	@Override
	public void clickingElement(WebElement webelement) {
		webelement.click();
	}

 

	@Override
	public void enteringValue(WebElement webelement, String text) {
		webelement.sendKeys(text);
	}

 

	@Override
	public void selectByIndex(WebElement webelement, int index) {
		Select select = new Select(webelement);
		select.selectByIndex(index);

 

	}

 

	@Override
	public void selectByVisibleText(WebElement webelement, String text) {
		Select select = new Select(webelement);
		select.selectByVisibleText(text);

 

	}

 

	@Override
	public void selectByValue(WebElement webelement, String value) {
		Select select = new Select(webelement);
		select.selectByValue(value);
	}

 

	@Override
	public String gettingValue(WebElement webelement) {
		return webelement.getText();
	}

 

	@Override
	public void mouseHover(WebElement webelement, WebDriver driver) {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Actions actions = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		actions.moveToElement(webelement).build().perform();

 

	}

 

}