package intrface_Wbdriver_Arch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("Chrome launched");
	}

	@Override
	public void findElements(String[] elements) {
		
		
	}

	@Override
	public void findElement() {
		
		System.out.println("Chrome-Element located");
	}

	@Override
	public void sendkeys(String element, String username) {
		System.out.println(username+" passed in "+element+" in chrome");
		
	}

	@Override
	public String getTitle() {
		System.out.println("ch-title is");
		return "naveen Automation labs";
	}

	@Override
	public void click() {
		System.out.println("ch-element clicked");
		
	}
	
	public void invidualch() {
		System.out.println("individual ch");
	}
	

}
