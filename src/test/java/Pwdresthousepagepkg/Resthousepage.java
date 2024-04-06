package Pwdresthousepagepkg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resthousepage {
WebDriver driver;
	
	By resthouse=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[2]/a");
	By district=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[1]")	;
	By resthousename=By.xpath("//*[@id=\"form\"]/div[1]/div[2]/div/h4/span/a");
	By resthousenameback=By.xpath("/html/body/div[2]/section[2]/div/div[1]/div/a");
	By googlemap=By.xpath("//*[@id=\"form\"]/div[1]/div[2]/div/h6/a/i");
	
    public  Resthousepage(WebDriver driver) 
    {
		this.driver=driver;
	}
	public void clickresthouse()
	{
		driver.findElement(resthouse).click();
	}
	public void choosedistrict()
	{
		List<WebElement> alldistrict=driver.findElements(district);
		for(WebElement districtelement:alldistrict) 
		{
			String district=districtelement.getText();
			System.out.println(district);
			districtelement.click();
			System.out.println("district selected");
		}	
	}
	
	public void resthouseroom()
	{
		driver.findElement(resthousename).click();
		System.out.println("resthouse selected");
		driver.findElement(resthousenameback).click();
	}

	public void googlemapopen() {
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window title"+ driver.getTitle());
		driver.findElement(googlemap).click();
		Set<String> allwindowhandles =driver.getWindowHandles();
	   
	    }
	}

	

