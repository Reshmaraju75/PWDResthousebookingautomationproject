package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Paymentstatuspage;

public class Paymentstatustest extends Baseclass 
{
	
	@Test
	public void transactionstest() 
	{
		Paymentstatuspage obj=new Paymentstatuspage(driver);
		obj.failedtransaction();
		Paymentstatuspage ob=new Paymentstatuspage(driver);
		ob.successtransaction();
		
	}

}
