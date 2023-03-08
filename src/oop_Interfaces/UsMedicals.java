package oop_Interfaces;

public interface UsMedicals extends WHO,USHG {
	
	int min_fee =15;//this should be static and final by default
	
	public void cardioServices();
	public void neuroServices();
	public void physioServices();
	
	public void emergencyServices();
	
	//after JDK1.8
	//static method with body ::can create in interface
	
	public static void taxCalculation() {
		System.out.println("Us-taxcalculation rules");
	}
	

}
