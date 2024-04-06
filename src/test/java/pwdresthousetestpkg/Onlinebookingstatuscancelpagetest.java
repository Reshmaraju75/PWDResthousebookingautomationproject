package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Onlinebookingstatuscancelpage;

public class Onlinebookingstatuscancelpagetest extends Baseclass
{
	@Test
	public void statuscancelonlinebooking()
	{
		Onlinebookingstatuscancelpage obj=new Onlinebookingstatuscancelpage(driver);
		obj.status();
	}

}
