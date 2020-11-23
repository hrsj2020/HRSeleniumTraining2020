package Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterInvalid {
		
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://c2ta.co.in/login/");
	driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	driver.findElement(By.id("reg_username")).sendKeys("HR123");
	// (1)If the user name is correct and wrong email given this message displays as "Sorry, that username already exists!""
	//(2)Message displays as "Sorry, that username already exists!"
	
	//Message displays as Invalid email address is used "Sorry, that email address is already used!"
	//driver.findElement(By.id("reg_username")).sendKeys("HR12345");
	//driver.findElement(By.id("reg_email")).sendKeys("hrsj2020@gmail.com");
	driver.findElement(By.id("reg_email")).sendKeys("hrsj202@gmail.com");
	//Wrong password entered - Message ddisplays as "Sorry, that username already exists!"
	driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("$ABC123#");
	//driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("$ABC1234#");
	//driver.findElement(By.)
	//driver.findElement(By.id("submit")).click();
	driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();
	}
}
