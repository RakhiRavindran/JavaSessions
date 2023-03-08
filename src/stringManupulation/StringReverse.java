package stringManupulation;

public class StringReverse {
	
	public  String reverseOf(String name) {
		
		if(name==null) {
			System.out.println("not a string");
			return null;
			
		}
		int len=name.length();
		if(len==1) {
			return name;
		}
		String rev="";
		for(int i=(len-1);i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse sr=new StringReverse();
		
		System.out.println(sr.reverseOf("Seleniumjava"));
		System.out.println(sr.reverseOf("98745"));
		System.out.println(sr.reverseOf("n"));
		System.out.println(sr.reverseOf(null));

	}

}
