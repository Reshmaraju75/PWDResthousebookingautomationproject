package Pwdresthousepagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Feedbackpage
{
    WebDriver driver;
    By feedback=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[6]/a/strong");
    
    public Feedbackpage(WebDriver driver) 
    {
    	this.driver=driver;
    }
    
    public void gotofeedback() 
    {
    	driver.findElement(feedback).click();
    	driver.findElement(By.id("applnMobile")).sendKeys("7902863974");
    	driver.findElement(By.xpath("//*[@id=\"btn_get_otp\"]")).click();
    }
}
