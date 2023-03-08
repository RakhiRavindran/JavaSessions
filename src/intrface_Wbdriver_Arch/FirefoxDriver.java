package intrface_Wbdriver_Arch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("ff launched");
	}

	@Override
	public void findElements(String[] elements) {
		
		
	}

	@Override
	public void findElement() {
		
		System.out.println("ff-Element located");
	}

	@Override
	public void sendkeys(String element, String username) {
		System.out.println(username+" passed in "+element+" in ff");
		
	}

	@Override
	public String getTitle() {
		System.out.println("ff-title is");
		return "naveen Automation labs";
	}

	@Override
	public void click() {
		System.out.println("ff-element clicked");
		
	}
}
