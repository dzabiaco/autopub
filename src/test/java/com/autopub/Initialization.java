package com.autopub;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Initialization {
	
	private static WebDriver driver;
	private static String url ="https://999.md/ru/";
	private static String username = 
	private static String email ="";
	private static String password = "";

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir") + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver =  new ChromeDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
		
		WebElement enter_link = driver.findElement(By.xpath("//a[@id='']"));
		enter_link.click();
		
		WebElement login_input = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[2]/input[1]"));
		login_input.sendKeys(username);
		
		WebElement password_input = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[3]/input[1]"));
		password_input.sendKeys(password);
		
		WebElement login_button = driver.findElement(By.xpath("//button[contains(text(),'Войти')]"));
		login_button.click();
		
		Thread.sleep(2000);
		
		WebElement cabinet = driver.findElement(By.xpath("//header/div[1]/nav[1]/div[1]"));
		WebElement obiava = driver.findElement(By.xpath("//header/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		WebElement ob = driver.findElement(By.cssSelector("body.page.page-index:nth-child(3) div.wrapper:nth-child(6) div.header_menu nav.header_menu_nav div.header_menu_nav__dropdown-wrapper div:nth-child(1) ul:nth-child(1) li:nth-child(1) > a:nth-child(1)"));
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Actions actions = new Actions(driver);
		actions.moveToElement(cabinet).perform();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Объявления"))).click();
		
	}

}
