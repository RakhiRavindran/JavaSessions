package intrface_Wbdriver_Arch;

public interface WebDriver extends SearchContext {
	
	public void findElement();
	public void sendkeys(String element,String username);
	public String getTitle();
	public void click();
	

}
