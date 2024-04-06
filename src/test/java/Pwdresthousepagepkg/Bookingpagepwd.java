package Pwdresthousepagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Bookingpagepwd {
	
WebDriver driver;
	
	By booking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div"
			+ "/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	By checkavalable=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]"
			+ "/div/div/nav/div/div[2]/div/div/ul/li[3]"
			+ "/div/div/div/div[1]/ul/li[1]/a");
	
    By checkrate=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[2]");
    
    By checkstatus=By.xpath("/html/body/div[2]/div/div/div[1]/div/div/ul/li[3]/a");
	
	public  Bookingpagepwd(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickbookng() throws Exception
	
	{
		Thread.sleep(1000);
		driver.findElement(booking).click();
	}
	
	public void checkbookingpage() throws Exception 
	{
		
		//check availability
		driver.findElement(checkavalable).click();
		
		WebElement district=driver.findElement(By.id("district"));
		Select di=new Select(district);
		di.selectByVisibleText("PALAKKAD");
	    Thread.sleep(1000);
		
		WebElement resthouse=driver.findElement(By.id("resthouse"));
		Select re=new Select(resthouse);
		re.selectByVisibleText("Agali");
		Thread.sleep(1000);
		
		WebElement roomtype=driver.findElement(By.id("room_type"));
		Select ro=new Select(roomtype);
		ro.selectByVisibleText("Double Room AC");
		Thread.sleep(1000);
		
		//datepick using sendkeys
		
		driver.findElement(By.xpath("//*[@id=\"starts_from\"]")).sendKeys("28-03-2024");
		driver.findElement(By.xpath("//*[@id=\"end_to\"]")).sendKeys("30-03-2024");
		
		driver.findElement(By.id("search_availability")).click();
	


		driver.findElement(checkrate).click();
		WebElement district1=driver.findElement(By.id("district"));
		Select dis=new Select(district1);
		dis.selectByVisibleText("ALAPPUZHA");
		Thread.sleep(1000);
		
		WebElement resthouse1=driver.findElement(By.id("resthouse"));
		Select res=new Select(resthouse1);
		res.selectByVisibleText("Chengannur");
		
	    driver.findElement(By.id("search_rates")).click();
	}
	    //take screenshot of rates
	    public void screenshot() throws Exception {
	    
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(src,new File("./projectscreenshot//rate.png"));
	    
	    
	}
		
}


