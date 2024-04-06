package pwdresthousetestpkg;



import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Pwdresthousehomesearch;

public class pwdhomesearchtest extends Baseclass {
	@Test
	
	public void search() throws Exception {
		
		 Pwdresthousehomesearch ob=new  Pwdresthousehomesearch(driver);
		 Pwdresthousehomesearch obdate=new  Pwdresthousehomesearch(driver);
		 Pwdresthousehomesearch obtitle=new  Pwdresthousehomesearch(driver);
		 Pwdresthousehomesearch obscroll=new  Pwdresthousehomesearch(driver);
		 ob.titleverification();
		 ob.search();
		 obdate.datepicker();
		 obscroll.scrolldown();
		
	}

}
