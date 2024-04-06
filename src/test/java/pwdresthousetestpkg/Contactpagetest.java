package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Contactpage;

public class Contactpagetest extends Baseclass
{
	@Test
	public void gotocontacttest()
	{
		
		Contactpage obj=new Contactpage (driver);
		obj.gotocontact();
	}

}
