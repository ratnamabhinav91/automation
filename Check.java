package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class facebooks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Abhinav\\Selenium_Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement text_size = driver.findElement(By.id("pass"));
		//String attribute    = text_size.getAttribute("Maxlength");
		//System.out.print("Maxlength =" + attribute);
		WebElement title_tooltip = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _517i _517h _51sy']"));
		String tooltip_attribute = title_tooltip.getAttribute("title");
		if(tooltip_attribute.equals("Show more languages"))
		{
			System.out.print("correct");
		}
	
		else
			System.out.print("In correct");
	
	