package Pwdresthousepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Onlinebookingstatuscancelpage {
	
	WebDriver driver;
	By Booking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	By Status=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/div/div"
			+ "/div/div[1]/ul/li[3]/a");
	
	
	
	public Onlinebookingstatuscancelpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void status() 
	{
		driver.findElement(Booking).click();
		driver.findElement(Status).click();
		driver.findElement(By.id("applnBookingID")).sendKeys("35454");	
		driver.findElement(By.id("search_status")).click();
		driver.switchTo().alert().accept();
		driver.navigate().back();

	}
	
	
}
