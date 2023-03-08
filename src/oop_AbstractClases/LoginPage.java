package oop_AbstractClases;

public class LoginPage extends Pages{
	
	public LoginPage() {
		System.out.println("login page constructor");
	}
	
	public LoginPage(int i) {
		System.out.println("login page constructor "+i);
	}


	@Override
	public void title() {
		System.out.println("loginpage title");
		
	}

	@Override
	public void url() {
		System.out.println("login page url");
		
	}
	
	public void resetPassword() {
		System.out.println("lp-reset password");
	}
	
	@Override
	public void pageLoadTimeOut() {
		System.out.println("lp-timeout is 5 seconds");
	}
	
	public static void PageCycle() {
		System.out.println("lp--page cyclesssss");//hiding with static metod
	}

}
