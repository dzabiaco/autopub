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
<<<<<<< HEAD
import org.openqa.selenium.support.ui.Select;
=======
>>>>>>> ba0670c555e28f5162a3819cee71fc7709a31ae0
import org.openqa.selenium.support.ui.WebDriverWait;

public class Initialization {
	
	private static WebDriver driver;
<<<<<<< HEAD
	private static String url ="";
	private static String username = "";
	private static String email = ""
	private static String password = "";
	private static String content;
	
	
	public static void login() {
		driver.manage().window().maximize();
=======
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
		
>>>>>>> ba0670c555e28f5162a3819cee71fc7709a31ae0
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
