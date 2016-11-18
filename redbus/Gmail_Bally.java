package redbus;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Gmail_Bally {

	WebDriver driver=null;
	String subject="failOut";
	EventFiringWebDriver eDriver=null;
	
	@BeforeTest

	public void login_() throws InterruptedException{
		
		driver=new FirefoxDriver();
		driver.navigate().to("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		driver.findElement(By.name("Email")).sendKeys("zapakjyoti");
		driver.findElement(By.cssSelector("#next")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("");
		driver.findElement(By.cssSelector("#signIn")).click();
		
		Thread.sleep(7000);
	}
	@Test
	public void compose() throws InterruptedException{
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@class='z0']/div")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id=':nq']")).sendKeys("jyotiranjan7637@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id=':na']")).sendKeys(subject);
		driver.findElement(By.xpath(".//*[@id=':of']")).sendKeys("jnkfsf "
				+ "fanflaf"
				+ "falf"
				+ "fkf"
				+ "fkf");
		driver.findElement(By.xpath(".//*[@id=':m0']/following-sibling::div")).click();
		Thread.sleep(7000);
		
	}@Test
	public void on_fail(){
		 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String sd=driver.findElement(By.xpath(".//*[@id=':2o']/tbody/tr[1]")).getText();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(sd);
		//Assert.assertEquals(sd, subject);
		for(String s:sd.split(" ")){
			System.out.println(s.trim()+"==="+s.length());
			if(s.equalsIgnoreCase("Me,")){
				System.out.println(" sf jf fa js jkf  fj fkj fj ffkfj ********************************************************************");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.xpath(".//*[@id=':2o']/tbody/tr[1]")).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				eDriver=new EventFiringWebDriver(driver);
				File scrImg=eDriver.getScreenshotAs(OutputType.FILE);
				File destImg=new File("C:\\Users\\JYOTI\\Desktop\\failed_email.png");
				Utils.copyFile(scrImg, destImg);
				break;
			}
		}
	}
	@AfterClass
	public void logout() throws InterruptedException{
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
	}
	
}
