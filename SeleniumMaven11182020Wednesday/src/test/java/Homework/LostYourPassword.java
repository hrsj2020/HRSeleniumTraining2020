package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LostYourPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
//	driver.findElement(By.linkText("Lost your password?")).click();
//		//String str = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).getAttribute("value");
//		driver.findElement(By.id("username")).sendKeys("HR123");
//		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/main/article/div/div/form/p[3]/button")).click();
//		//driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
	}

}
