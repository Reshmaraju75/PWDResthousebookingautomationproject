package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Gocircularpage;

public class Gocircularpagetest extends Baseclass {
	
	@Test
	public void gocirculartest() throws Exception {
		
		 Gocircularpage ob=new  Gocircularpage(driver);
		 ob.clickgocircular();
		 Gocircularpage obj=new  Gocircularpage(driver);
		 obj.Goorder();
		 Gocircularpage obc=new  Gocircularpage(driver);
		 obc.circulars();
		 Gocircularpage obs=new  Gocircularpage(driver);
		 obs.screenshot();
	}

}
