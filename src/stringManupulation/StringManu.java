package stringManupulation;

public class StringManu {

	public static void main(String[] args) {
		
		String str= "This is my string manupulation clase";
		int len=str.length();
		int li=0;
		int hi=len-1;
		
		System.out.println(li+"," +hi);
		System.out.println("length"+len);
		System.out.println("highest index: "+hi);
		
		System.out.println(str.charAt(5));//to get character at 4th index
		
		System.out.println(str.indexOf('y'));//single chat in ''
		System.out.println(str.indexOf("manupulation"));//words in ""
		
		if(str.indexOf("clase")==10) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		System.out.println();
		
		System.out.println("first occurence of i : "+str.indexOf('i'));
		System.out.println("Second occurence of i : "+str.indexOf('i',str.indexOf('i')+1));
		System.out.println("3rd occurrence of i: "+str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1));
		
		//nth Occurrence of i using while loop
		
	/*	int fo=str.indexOf('i');
		System.out.println(fo);
		while(fo<str.length()) {
			fo=str.indexOf('i',fo+1);
			fo++;
		}
		System.out.println(fo);*/
		
		
		
		System.out.println();
		
		System.out.println(str.indexOf("python"));	//if no output found to this, then returns -1
		if(str.indexOf("string") != -1) {
			System.out.println("verified : found");
		}
		
		

	}

}
