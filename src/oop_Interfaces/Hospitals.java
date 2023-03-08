package oop_Interfaces;

public class Hospitals {

	public void medicalRD() {
		System.out.println("Hospital-medical R&D");
	}
	
	//final method can not be override but can inherit
	public final void medicalNews() {
		System.out.println("Hospitals--Medical news");
	}
}
