package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sethu\\eclipse-workspace\\SeleniumTesting\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		WebElement f1 = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		f1.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='cppEmailOrUsername']")).sendKeys("eraiyanbu07@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Send Login Link']")).click();
		Thread.sleep(3000);
}
}
