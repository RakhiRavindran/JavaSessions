package stringManupulation;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "      I hate Java         ";
		String s2="25-05-1993";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println();
		System.out.println(s1.trim());
		
		System.out.println();
		System.out.println(s1.replace("hate", "love"));
		System.out.println(s2.replace('-', '/'));
		System.out.println(s1.replaceAll(" ", ""));//replacing all the spaces
		
		String eTitle="Google.com";
		System.out.println(eTitle.equals("Google"));///true or false
		
		if(eTitle.equals("Google")) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
		
		if(eTitle.equalsIgnoreCase(s1)) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		}
		if(eTitle.equalsIgnoreCase(s1.trim())) {
			System.out.println("equals");
		}
		else {
			System.out.println("not equals");
		
		}
		
		String t1="Welcome to Naveen Automation labs";
		System.out.println(t1.contains("Naveen"));//true or false
		
		
		String lg="this-is-to-inform- you that-I-am-start-learning-JAVA";
		String l[]=lg.split("-");
		System.out.println(Arrays.toString(l));

	}

}
