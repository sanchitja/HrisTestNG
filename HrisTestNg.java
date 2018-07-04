package Groupid01.Aer01;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HrisTestNg {

	public String baseUrl = "http://hris.qainfotech.com";
	String driverPath = "C:\\Users\\sanchitjain\\Downloads\\chromedriver_win32e\\chromedriver.exe";
	public WebDriver driver;
	Scanner scan = new Scanner(System.in);

	@BeforeTest
	public void varifyHomePageTitle() {
		System.out.println("launching browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@Test
	public void step1_NavigateToLoginButton() {
		driver.findElement(By.xpath("//a[@href='#panel1']")).click();

	}

	@Test
	public void step2_Login() {
		System.out.println("Enter user name :");
		String username = scan.nextLine();
		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys(username);
		System.out.println("Enter password :");
		String password = scan.nextLine();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

	@Test
	public void step3_NavigateToTimesheet() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='icon_size time']")).click();
		driver.findElement(By.xpath("")).click();
	}
	
	
		@Test
		public void step4_accessTimeSheet() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='disabled showtooltip totaltimeColor clsHover cellColor2018-06-25 removeArrow']")).click();
			driver.findElement(By.xpath("(//button[@class='close text-peace'])[1]")).click();
			
					
		}
		
		@Test
		public void step5_LogOut() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='profile-btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='user-profile-option user-profile-option1 list-unstyled']/li[4]/a")).click();
		}

}
