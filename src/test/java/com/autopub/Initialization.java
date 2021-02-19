package com.autopub;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization {
	
	private static WebDriver driver;
	private static String url ="";
	private static String username = "";
	private static String email ="";
	private static String password = "";

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver =  new ChromeDriver();
		driver.get(url);
		
		WebElement enter_link = driver.findElement(By.xpath("//a[@id='']"));
		enter_link.click();
		
		WebElement login_input = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[2]/input[1]"));
		login_input.sendKeys(username);
		
		WebElement password_input = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[3]/input[1]"));
		password_input.sendKeys(password);
		
		WebElement login_button = driver.findElement(By.xpath("//button[contains(text(),'Войти')]"));
		login_button.click();
		
	}

}
