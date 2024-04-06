package Pwdresthousepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Paymentstatuspage
    {
	WebDriver driver;
	By onlinebooking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	By failedtrans=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/div/div/"
			+ "div/div[2]/ul/li[1]/a");
	By successtrans=By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div/ul/li[1]/a");
	
	public Paymentstatuspage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void failedtransaction() 
	{
		driver.findElement(onlinebooking).click();
		driver.findElement(failedtrans).click();
		driver.findElement(By.id("applnMobile")).sendKeys("7902863974");
		driver.findElement(By.xpath("//*[@id=\"btn_get_otp\"]")).click();
	}
	public void successtransaction()
	{
		driver.findElement(successtrans).click();
		driver.findElement(By.id("applnMobile")).sendKeys("7902863974");
		driver.findElement(By.xpath("//*[@id=\"btn_get_otp\"]")).click();
		
	}

}
