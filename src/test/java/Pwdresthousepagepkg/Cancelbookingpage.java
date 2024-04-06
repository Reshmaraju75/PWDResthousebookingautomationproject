package Pwdresthousepagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Cancelbookingpage
{
	WebDriver driver;
	
	By Booking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	
	By cancelbooking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]"
			+ "/div/div/div/div[1]/ul/li[5]/a");
	
	public Cancelbookingpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	

	
	public void cancelbooking() throws Exception
	{
	 driver.findElement(Booking).click();
	 driver.findElement(cancelbooking).click();
	 driver.findElement(By.id("applnBookingID")).sendKeys("35454");	
	 driver.findElement(By.xpath("//*[@id=\"btn_get_otp\"]"));
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(src,new File("./projectscreenshot//booking.png"));
	 driver.navigate().back();
	 
	}
	
	 

}
