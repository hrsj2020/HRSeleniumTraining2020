package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String title= driver.getTitle();
		//System.out.println(title);


	}

}
