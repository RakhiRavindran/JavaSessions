package oop_Constructor;

import java.util.Arrays;

public class BrowserCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserC b =new BrowserC("chrome",109.236, "Google");
		System.out.println(b.getBrowsername()+" ,"+b.getCurrentVersion()+" ,"+b.getVendorName()+" ,"+b.getPlugins());
		
		BrowserC b1=new BrowserC("asd",453.2255, "goooo",new String[]{"dss","sdfs","sdsd"});
		System.out.println(b1.getBrowsername()+" ,"+b1.getCurrentVersion()+" ,"+b1.getVendorName()+" ,"+Arrays.deepToString(b1.getPlugins()));
		

	}

}
