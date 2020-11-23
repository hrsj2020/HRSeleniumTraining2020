package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingLinksCount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchStr = driver.findElement(By.xpath("//input[@name='q']"));
		searchStr.sendKeys("testing");
		searchStr.sendKeys(Keys.ENTER);
		System.out.println("searchstring " + searchStr);
		List<WebElement> listings = driver.findElements(By.tagName("a"));  //Identify the number of Links on webpage and assign into Webelement List-listing in size
		System.out.println("The number of links is " + listings.size());		 
	    List<WebElement> links = driver.findElements(By.xpath("//a"));    //Identify the number of Links on webpage and assign into Webelement List- links in size
        int linkCount = links.size();     // Count the total Link list on Web Page        
        System.out.println("Total Number of links count on the webpage = "  + linkCount);    //Print the total count of links on webpage
        String url = driver.getCurrentUrl();
        System.out.println("current url ="+url);
	}
}
