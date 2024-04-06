package Pwdresthousepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contactpage 
{
	WebDriver driver;
	By contact=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[5]/a/strong");
	By resthousecontact=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[2]");
	By headoffice=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[1]");
	
	public Contactpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void gotocontact()
	{
		driver.findElement(contact).click();
		driver.findElement(headoffice).click();
		driver.findElement(resthousecontact).click();
		
	}
}
