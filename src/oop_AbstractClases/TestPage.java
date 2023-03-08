package oop_AbstractClases;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp=new LoginPage();
		LoginPage lp1=new LoginPage(10);
		
		System.out.println();
		
		lp.displayLogo();
		lp.resetPassword();
		lp.pageLoadTimeOut();
		lp.title();
		lp.url();
		//lp.PageCycle();-->warning
		LoginPage.PageCycle();
		Pages.PageCycle();
		
		System.out.println();
		
		//topCasting
		Pages p= new LoginPage(20);
		p.displayLogo();
		p.pageLoadTimeOut();
		p.title();
		p.url();
		//p.PageCycle();
		

	}

}
