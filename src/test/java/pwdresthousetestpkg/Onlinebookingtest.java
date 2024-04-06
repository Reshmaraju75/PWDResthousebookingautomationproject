package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Onlinebookingpage;

public class Onlinebookingtest extends Baseclass
{
	@Test
	public void onlinetest() throws Exception 
	{
		 Onlinebookingpage ob=new  Onlinebookingpage(driver);
		 ob.onlinebooking();
	}

}
