package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Feedbackpage;

public class Feedbackpagetest extends Baseclass {
	@Test
	public void feedbacktest()
	{
		Feedbackpage obj=new Feedbackpage(driver);
		obj.gotofeedback();
	}

}
