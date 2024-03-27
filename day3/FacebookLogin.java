package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		String text = driver.findElement(By.className("_9ay7")).getText();
		
		System.out.println(text);
		
		driver.close();
	}
	
	
	
}
