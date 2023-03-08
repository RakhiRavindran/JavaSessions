package oop_Encapsualation;

public class Browser {
	private String browserName;
	private double version;
	private String[] plugins;
	
	
	public Browser(String browserName,double version,String[] plugins) {
		this.browserName=browserName;
		this.version=version;
		this.plugins=plugins;
		
	}
	
	public String getBrowserName() {
		return browserName;
	}
	
	public void setBrowserName(String browserName) {
		this.browserName=browserName;
	}

	
	public double getVersion() {
		return version;
	}
	
	public void setVersion(double version) {
		this.version=version;
	}
	
	public String[] getPlugins() {
		return plugins;
	}
	
	public void setplugin(String[] plugins) {
		this.plugins=plugins;
	}
	

}
