package basicJava;

import java.util.Arrays;
import java.util.Scanner;

public class MethArrayCon {
	
	public String[] getEmployeeDevices(String name) {
		if(name.toLowerCase().trim().equals("neha"))//toLowerCase> to covert name value to lowercase
		{                                           //trim() > Used to rmove space before and after words       
			String devices[]= {"Iseries2.0","Iseries4.0 GMS","HH"};
			return devices;
		}
		else if (name.equals("Aju")) {
			String devices[]= { "MR16 HH","MR60 non payment","laptop"};
			return devices;
		}
		else {
			System.out.println("Employee name found");
			
		}
		return null;
	}
	
	//program to return in single line
	public String[] devicesList(String name) {
		String devices[]=null;
		if(name.toLowerCase().trim().equals("neha"))//toLowerCase> to covert name value to lowercase
		{                                           //trim() > Used to rmove space before and after words       
			devices=new String[]{"dev0","dev1","dev2"};
			
		}
		else if (name.equals("Aju")) {
			devices=new String[]{ "xy1","Mde","ssds"};
			
		}
		else {
			System.out.println("Employee name found");
			
		}
		return devices;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter employee name");
		Scanner sc= new Scanner(System.in);
		String emplyee=sc.next();
		MethArrayCon mac= new MethArrayCon();
		String d[]=mac.getEmployeeDevices(emplyee);// calling array value and assign to an array
		System.out.println(Arrays.toString(d));
		System.out.println();
		
		String l[]=mac.devicesList(emplyee);// calling array value and assign to an array
		System.out.println(Arrays.toString(l));
		
		sc.close();
		

	}

}
