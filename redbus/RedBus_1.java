package redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.StringTokenizer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class RedBus_1 {

	
	
	@Test
	public void jenkin_not_first() throws InterruptedException, AWTException{
		
	/*	System.setProperty("webdriver.ie.driver", ""
				+ "D:\\garbaage\\chromeDriver/IEDriverServer.exe");*/
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Robot rb=new Robot();
		//rb.keyPress(driver.findElement(By.id("src")).sendKeys("Bangalore"));
		
		driver.findElement(By.id("src")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
		driver.findElement(By.id("dest")).sendKeys("Goa");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
		
		driver.findElement(By.xpath(".//*[@id='rb-calendar_return_cal']/following-sibling::div/table/tbody/tr[6]/td[4]")).click();
		System.out.println("jyda");
		driver.findElement(By.xpath(".//*[@id='search']/div/div[4]/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='rb-calendar_return_cal']/table/tbody/tr[7]/td[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='search_btn']")).click();
	   
		String list=driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[2]/div[1]/div/div[1]")).getText();
		
		
	//	for(WebElement s:list)
		//System.out.println(list);
		
		StringTokenizer st=new StringTokenizer(list,"\n");
		
		String[] ss=new String[32];
		int i=0;
		while(st.hasMoreTokens()){
			
		//	System.out.print(st.nextToken());
			ss[i]=st.nextToken();
			++i;
		}for(String s:ss){
			if(s==null)
				break;
			//System.out.println("sfjf_______"+s);
		}
		
     driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[2]/div[1]/div/div[1]/div[7]/div[2]/button")).click();
		
     Thread.sleep(3000);
		String xpat;
		List<WebElement> kis=driver.findElements
		(By.xpath
				(".//*[@id='buses_viewonward']/div/ul/li[2]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div[2]/canvas"));
		//.getAttribute("title");
		//.getText();
		//System.out.println(xpat); 
		
           JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript(arg0, arg1)
		
		List<WebElement> hidd=driver.findElements(By.tagName("canvas"));
		for(int i1=0;i1<hidd.size();i1++){
			
			if(hidd.get(i1).getAttribute("type").trim().equalsIgnoreCase("hidden")){
				
				System.out.println(hidd.get(i).getAttribute("value").trim());
			}
		}
	
	}
}
