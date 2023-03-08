package oop_Encapsualation;

import java.util.Arrays;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b=new Browser("Chrome", 108.05359, new String[] {"adc","asd"});//Assigning using constructor
		System.out.println(b.getBrowserName());//encapsulation and calling
		System.out.println(b.getVersion());
		System.out.println(Arrays.toString(b.getPlugins()));
		
		b.setBrowserName("FireFox");
		b.setVersion(96.102365);
		b.setplugin(new String[] {"Gramerly","Selenium IDE","Google authenticator"});
		
		System.out.println("Updated bName"+b.getBrowserName());
		System.out.println("Updated bVersion:"+b.getVersion());
		System.out.println("Updated bPlugins are:"+Arrays.toString(b.getPlugins()));
		
		
		

	}

}
