package stringManupulation;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str4="Automation";
		str4=null;//now automation becomes no reference value
		
		String str5="Cypress";
		str5="Webdriver";//now Cypress becomes no reference value
						// Automation and Cypress are eligible for garbage collector
		
		System.out.println(str4+","+str5);
		
		System.out.println();
		
		String p="Naveen";
		p=p+"Automation";
		System.out.println(p);//o/p=>NaveenAutomation and Naveen becomes non ref. value which is immutable
		
		String h="     hello world       ";
		h=h.trim();
		System.out.println(h);//o/p=>hello world, "   hello world   " becomes immutable and non ref. value
		
		System.out.println();
		
		String r= "eloview";
		System.out.println(r+"polaris");//Here value of r(eloview) is not changing

	}

}
