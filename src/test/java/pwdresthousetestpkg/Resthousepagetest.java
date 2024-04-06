package pwdresthousetestpkg;

import org.testng.annotations.Test;

import Baseclasspkg.Baseclass;
import Pwdresthousepagepkg.Resthousepage;

public class Resthousepagetest extends Baseclass {
	
	@Test
	public void clickresthousetest() {
		Resthousepage obj=new Resthousepage(driver);
		obj.clickresthouse();
		Resthousepage obj1=new Resthousepage(driver);
		obj1.choosedistrict();
		Resthousepage obj2=new Resthousepage(driver);
		obj2.resthouseroom();
		Resthousepage obj3=new Resthousepage(driver);
		obj3.googlemapopen();
		
		
	}
	
}
