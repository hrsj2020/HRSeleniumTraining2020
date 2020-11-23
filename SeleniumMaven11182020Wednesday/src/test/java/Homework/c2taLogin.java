package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2taLogin {

				public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://c2ta.co.in/login/");
			//driver.findElement(By.id("username")).sendKeys("Admin");
			driver.findElement(By.id("username")).sendKeys("HR123");
			driver.findElement(By.id("password")).sendKeys("$ABC1234#");
			driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[1]/label/input")).click();
			driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
			driver.findElement(By.linkText("Log out")).click();
			driver.get("https://c2ta.co.in");
			}
}
