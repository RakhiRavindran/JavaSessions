package oop_Interfaces;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		
		fh.gynicServices();
		fh.ongologyServices();
		
		fh.dentalServices();
		fh.orthoServies();
		fh.entServices();
		
		fh.emergencyServices();
		
		fh.medicalTraining();
		
		//UsMedicals us=new UsMedicals();---Object of interface can't be created bcz in interface its not defined
		
		System.out.println("---------Top casting in interfaces -------");
		UsMedicals us=new FortisHospital();
		
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();//only "us" can access parent interface method(means overridden method) 
		
		System.out.println();
		
		IndianMedicals in=new FortisHospital();
		
		in.dentalServices();
		in.entServices();
		in.orthoServies();
		in.emergencyServices();
		
		//FortisHospital f= new UsMedicals();-----NA in the case of interfaces(object of interfaces cannot be created
		
		System.out.println();
		System.out.println("---parent class methods by using child obj.--");
		
		fh.medicalRD();//overridden
		fh.medicalNews();//inherit
		
		System.out.println();
		
		System.out.println("-----Parent class object------");
		Hospitals h=new Hospitals();
		h.medicalRD();
		h.medicalNews();
		
		System.out.println();
		
		System.out.println("---Superparent interface method defined by fortis ---");
		
		fh.pandemicPolices();//only connected methods can access means..implemented and extended
		
		System.out.println("-----ushg----");
		fh.childCareSevices();
		
		System.out.println();
		
		System.out.println("-----variables in interfaces----");
		System.out.println(FortisHospital.min_fee);
		System.out.println(UsMedicals.min_fee);
		
		System.out.println();
		
		UsMedicals.taxCalculation();//static method with body declare in the Usmedicals-interface
		
		}
		


	

}
