package Pwdresthousepagepkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pwdresthousehomesearch {
	WebDriver driver;
	By Destination=By.id("district");
	By Stayin=By.id("resthouse");
	By Roomtype=By.id("room_type");
	By datepickerin=By.xpath("//*[@id=\"starts_from\"]");
	By datepickerout=By.xpath("//*[@id=\"end_to\"]");
	By month=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]");
	By search=By.xpath("//*[@id=\"search_availability\"]");
	By scroll=By.xpath("//*[@id=\"content\"]/div/section[2]/div/div/div[1]/div[1]/span/a");

	public Pwdresthousehomesearch(WebDriver driver) {
		this.driver=driver;
	}
	
	public void titleverification() {
		
		 String title=	driver.getTitle();
		    System.out.println(title);
		    String expectedtitle="22-03-2024 മുതൽ പൊതുമരാമത്തിന്റെ കീഴിലുള്ള എല്ലാ വിശ്രമ കേന്ദ്രങ്ങളും 2024 ലെ ലോക "
		    		+ "  സഭ പൊതുതെരഞ്ഞെടുപ്പുമായി ബന്ധപ്പെട്ട് ജനപ്രാതിനിധ്യ നിയമം സെക്ഷൻ 160(a) പ്രകാരം"
		    		+ " 2024 ഏപ്രിൽ 26 വരെ തിരഞ്ഞെടുപ്പ് ആവശ്യത്തിനു മാത്രമായി പരിമിതപ്പെടുത്തിയിരിക്കുന്നു.\r\n";
		    if(title.equals(expectedtitle));
		    {
		    	System.out.println("rooms are not available because of parliment election");
		    }
	    }
		
	
	public void search() throws InterruptedException {
		
	WebElement	Destinationelement=driver.findElement(Destination);
	
				Select obj=new Select(Destinationelement);
				obj.selectByValue("1610");
				
				Thread.sleep(1000);
	WebElement stayinelement=driver.findElement(Stayin);
			Select obj1=new Select(stayinelement);
			obj1.selectByValue("1001"); 
			
			Thread.sleep(1000);
    WebElement roomtypeelement=driver.findElement(Roomtype);
			Select obj2=new Select(roomtypeelement);
			obj2.selectByValue("7");
	
	            //TO FIND THE COUNT IN THE DROPDOWN OPTIONS
	            
	         List<WebElement> li= obj.getOptions();
	         System.out.println(li.size()+"count of destinations-");
	        
	         
	         List<WebElement> li1=obj1.getOptions();
	         System.out.println(li1.size()+"countofstays-");
	         
	         List<WebElement> li2=obj1.getOptions();
	         System.out.println(li2.size()+"countofroomtype-");
	         
	}   
	         
	     
	         public void datepicker() throws Exception
	         {

	     		driver.findElement(datepickerin).sendKeys("28-03-2024");
	     		Thread.sleep(1000);
	     		driver.findElement(datepickerout).sendKeys("30-03-2024");
	     		Thread.sleep(1000);
	     	    driver.findElement(search).click();
	     		
	         }
	         
	         public void scrolldown() 
	     	{
	     		JavascriptExecutor js = (JavascriptExecutor) driver;
	     		WebElement Element = driver.findElement(scroll);
	     		js.executeScript("arguments[0].scrollIntoView();", Element);
	     		
	     	}
}



