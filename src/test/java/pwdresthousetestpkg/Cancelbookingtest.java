package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Cancelbookingpage;

public class Cancelbookingtest extends Baseclass
{

	@Test
	
	public void onlinebooking() throws Exception 
	{

		Cancelbookingpage obj1= new Cancelbookingpage(driver);
		obj1.cancelbooking();
		
		
	}
}
