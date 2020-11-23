package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.id("reg_username")).sendKeys("HR123");
		driver.findElement(By.id("reg_email")).sendKeys("hrsj2020@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("$ABC1234#");
		driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();
	}

}
