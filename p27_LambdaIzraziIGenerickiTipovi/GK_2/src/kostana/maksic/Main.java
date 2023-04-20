package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
		A<Integer, String> objekat1 = new A<Integer, String> (100, "Java");

		objekat1.prikaziTip();
		int intVrednost1 = objekat1.getObj1();
		System.out.println("Vrednost: " + intVrednost1);
		
		String stringVrednost1 = objekat1.getObj2();
		System.out.println("Vrednost: " + stringVrednost1);
	
		A<String, Double> objekat2 = new A<String, Double> ("tekst123", 123.45);
	
		objekat2.prikaziTip();
		String stringVrednost2 = objekat2.getObj1();
		System.out.println("Vrednost: " + stringVrednost2);
		
		double doubleVrednost2 = objekat2.getObj2();
		System.out.println("Vrednost: " + doubleVrednost2);
	
		
		A<Boolean, Integer> objekat3 = new A<Boolean, Integer> (true, 101);
		objekat3.prikaziTip();
		
		boolean boolenVrednost3 = objekat3.getObj1();
		System.out.println("Vrednost: " + boolenVrednost3);
		
		int intVrednost3 = objekat3.getObj2();
		System.out.println("Vrednost: " + intVrednost3);
		
			
	
	}

}
