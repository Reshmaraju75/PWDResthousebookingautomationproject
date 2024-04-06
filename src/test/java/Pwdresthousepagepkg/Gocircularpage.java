package Pwdresthousepagepkg;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Gocircularpage 
   {
	WebDriver driver;
	By gocircular=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/"
			+ "div/nav/div/div[2]/div/div/ul/li[4]/a/strong");
	By go=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[1]/a");
	By circular=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[2]");

	public Gocircularpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void clickgocircular() 
	{
		driver.findElement(gocircular).click();
	}
	
	public void Goorder() throws Exception 
	
	{
		driver.findElement(go).click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window title"+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/fieldset/"
				+ "div[1]/table/tbody/tr[2]/td[2]/a")).click();
		Set<String> allwindowhandles =driver.getWindowHandles();
		
		
		
	     List<WebElement> li = driver.findElements(By.tagName("a"));
		 System.out.println(li.size());
		
		for(WebElement s:li) {
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link+"----"+text);
		}
	}
	
	public void screenshot() throws Exception {
		

		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src,new File("./projectscreenshot//order.png"));
	}
	public void circulars()
	{
		driver.findElement(circular).click();
		 List<WebElement> li = driver.findElements(By.tagName("a"));
		 System.out.println(li.size());
		
		for(WebElement s:li) {
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link+"----"+text);
	}
   }
   }
	
