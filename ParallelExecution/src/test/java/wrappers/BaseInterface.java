package wrappers;


import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 

public interface BaseInterface {

	public void clickingElement(WebElement webelement);

	public void setUp() throws MalformedURLException;

	public void openBaseUrl();

	public void enteringValue(WebElement webelement, String text);

	public void selectByIndex(WebElement webelement, int index);

	public void selectByVisibleText(WebElement webelement, String text);

 

	public void selectByValue(WebElement webelement, String value);

	public String gettingValue(WebElement webelement);

	public void mouseHover(WebElement webelement, WebDriver driver);

 

}