package oop_Constructor;

public class BrowserC {
	String browserName;
	double currentVersion;
	String vendorName;
	String plugins[];
	
	public BrowserC(String browserName,double currentVersion,String vendorName) {
		this.browserName=browserName;
		this.currentVersion=currentVersion;
		this.vendorName=vendorName;
	}

	public BrowserC(String browserName, double currentVersion, String vendorName, String[] plugins) {
		//super();
		this.browserName = browserName;
		this.currentVersion = currentVersion;
		this.vendorName = vendorName;
		this.plugins = plugins;
	}
	
	public String getBrowsername() {
		return browserName;
		
	}
	
	public String getVendorName() {
		return vendorName;
	}
	
	public String[] getPlugins(){
		return plugins;
		
	}
	
	public double getCurrentVersion() {
		return currentVersion;
		
	}

}
