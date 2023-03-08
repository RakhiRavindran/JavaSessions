package oop_Interfaces;

public class FortisHospital extends Hospitals implements UsMedicals,IndianMedicals,UkMedicals {

	@Override
	public void cardioServices() {
		System.out.println("FH-CardioServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH-NeuroServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH-physioServices");
		
	}

	@Override
	public void gynicServices() {
		System.out.println("FH-Gynic");		
	}

	@Override
	public void ongologyServices() {
		System.out.println("FH-ongology");	
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-Dental");	
		
	}

	@Override
	public void orthoServies() {
		System.out.println("FH-orthology");	
		
	}

	@Override
	public void entServices() {
		System.out.println("FH-ent");	
		
	}
	
	//individual methods
	public void medicalTraining() {
		System.out.println("Fh-medical training::Individual");
	}
	
	//common methods
	public void emergencyServices() {
		System.out.println("FH-emergency services:: common");
		
	}
	
	//parent class override
	@Override
	public void medicalRD() {
		System.out.println("fortis-medicalR&D");
		
	}

	@Override///----from common Super parent interface of all interfaces
	public void pandemicPolices() {
		System.out.println("Fortis------pandemic polices");
		
	}

	@Override//--->from a super parent interfaces only for us medicals
	public void childCareSevices() {
		
		System.out.println("fh--implemented childcare of USHG");
		
	}
	
		
	
}
