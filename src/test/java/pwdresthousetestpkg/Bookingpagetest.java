package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Bookingpagepwd;


public class Bookingpagetest extends Baseclass
{
	@Test
	public void checkbooking() throws Exception {
		
		Bookingpagepwd obj=new Bookingpagepwd(driver);
		obj.clickbookng();
		Bookingpagepwd obj1=new Bookingpagepwd(driver);
		obj1.checkbookingpage();
		Bookingpagepwd obj2=new Bookingpagepwd(driver);
		obj2.screenshot();
		
		
		
		 
		 
		 
	}
}
	
