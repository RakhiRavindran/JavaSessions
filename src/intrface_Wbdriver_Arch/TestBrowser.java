package intrface_Wbdriver_Arch;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver ch=new ChromeDriver();
		ch.findElement();
		ch.findElements(args);
		ch.sendkeys("emailId", "rakhi@gmailcom");
		System.out.println(ch.getTitle());
		ch.click();
		
		System.out.println();
		System.out.println("-----top castiing----");
		
		//top casting
		WebDriver driver=null;
		String b="ff";
		switch (b) {
		case "chrome":
			driver=new ChromeDriver();
			
			break;
		case "ff" :
			driver=new FirefoxDriver();
			break;

		default:
			System.out.println("enter correct browsername");
			break;
		}
		
		driver.findElement();
		driver.sendkeys("ee", "bb");
		driver.click();
		System.out.println(driver.getTitle());
		//driver-->individual method in chromdriver won't access
		
		
		
		
		

	}

}
