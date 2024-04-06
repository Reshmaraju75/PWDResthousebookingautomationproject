package Pwdresthousepagepkg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Onlinebookingpage 
{
WebDriver driver;
	
	By Booking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	By onlinebooking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]"
			+ "/div/div/div/div[1]/ul/li[4]/a");
	
	public Onlinebookingpage (WebDriver driver) {
		this.driver=driver;
	}
	public void onlinebooking() throws Exception
	{
		driver.findElement(Booking).click();
		driver.findElement(onlinebooking).click();
		
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src,new File("./projectscreenshot//onlinebooking.png"));
		 driver.navigate().back();
			
  }

}
