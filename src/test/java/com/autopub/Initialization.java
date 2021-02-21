package com.autopub;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Initialization {
	
	private static WebDriver driver;
	private static String url ="";
	private static String username = "";
	private static String email = ""
	private static String password = "";
	private static String content;
	
	
	public static void login() {
		driver.manage().window().maximize();
		WebElement enter_link = driver.findElement(By.xpath("//a[@id='']"));
		enter_link.click();
		
		WebElement login_input = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[2]/input[1]"));
		login_input.sendKeys(username);
		
		WebElement password_input = driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/div[3]/input[1]"));
		password_input.sendKeys(password);
		
		WebElement login_button = driver.findElement(By.xpath("//button[contains(text(),'Войти')]"));
		login_button.click();
		driver.get("https://999.md/cabinet/items/"+username);
	}
	
	public static void clearCache() throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
	}
	
	
	
	public static void readFromFile() throws IOException {
			     
		      try {
		          File fileDir = new File("content.txt");

		          BufferedReader in = new BufferedReader(
		             new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));

		          String str;

		          while ((str = in.readLine()) != null) {
		        	  content = str;
//		              System.out.println(str);
		          }

		                  in.close();
		          } 
		          catch (UnsupportedEncodingException e) 
		          {
		              System.out.println(e.getMessage());
		          } 
	}
	
	public static void createNewAnunt() throws InterruptedException  {
		WebElement create_button = driver.findElement(By.xpath("//a[@id='js-add-ad']"));
		create_button.click();
		
		WebElement business_link = driver.findElement(By.xpath("//a[contains(text(),'Бизнес')]"));
		business_link.click();
		
		WebElement site_development = driver.findElement(By.xpath("//a[contains(text(),'Сайты и разработка')]"));
		site_development.click();
		
		WebElement check = driver.findElement(By.xpath("//body/div[3]/div[1]/section[1]/div[1]/div[1]/section[2]/div[1]/div[1]/section[1]/div[1]/div[1]/dl[3]/dd[1]/form[1]/label[2]/input[1]"));
		check.click();
		
		WebElement title_anunt = driver.findElement(By.xpath("//input[@id='control_12']"));
		String title_text = "Разработка чат-ботов в Мессенджерах (Telegram ,Facebook, WhatsApp, Viber)";
		title_anunt.sendKeys(title_text);
		
		WebElement content_anunt = driver.findElement(By.xpath("//textarea[@id='control_13']"));
		String textarea = "Создадим чат-ботов для Telegram,Facebook,WhatsApp,Viber.\r\n"
				+ "\r\n"
				+ "Быстро, качественно, надёжно.\r\n"
				+ "\r\n"
				+ "Преимущества для бизнеса:\r\n"
				+ "1) Автоматизация бизнес - процессов\r\n"
				+ "2) Мгновенный ответ и доступность\r\n"
				+ "3) Удобная панель управления ботом\r\n"
				+ "4) Ботов можно улучшить и оптимизировать\r\n"
				+ "5) Накопление базы данных клиентов\r\n"
				+ "\r\n"
				+ "Мы также предоставляем услуги:\r\n"
				+ " - Создание сайтов (landing page, сайт - визитка, интернет - магазин)\r\n"
				+ " - Анимация HTML5 баннеров\r\n"
				+ " - Создание шаблонов для E-mail писем\r\n"
				+ " - Создание программного обеспечения для автоматизации бизнес - процессов\r\n"
				+ "\r\n"
				+ "Уточнить детали можно по телефону, который указан в объявлении, по телеграмму https://t.me/yg_wooods или по почту ssennetta@gmail.com";
		
		content_anunt.sendKeys(textarea);
		
		//Region
		WebElement region = driver.findElement(By.xpath("//select[@id='control_7']"));
		Select dropdown = new Select(region); 
		dropdown.selectByIndex(1);    
		
		// Price
		WebElement price = driver.findElement(By.xpath("//label[contains(text(),'договорная')]"));
		price.click();
		
		WebElement first_check = driver.findElement(By.xpath("//label[contains(text(), 'Создание сайтов')]"));
		first_check.click();
		
//		WebElement second_check = driver.findElement(By.xpath("//label[contains(text(), 'Дизайн сайтов')]"));
//		second_check.click();
//		
//		WebElement third_check = driver.findElement(By.xpath("//label[contains(text(), 'Разработка софта')]"));
//		third_check.click();
		
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String path = System.getProperty("user.dir") + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver =  new ChromeDriver();
		clearCache();
		driver.get(url);
		
		login();

		
		createNewAnunt();
		
		
	}

}
