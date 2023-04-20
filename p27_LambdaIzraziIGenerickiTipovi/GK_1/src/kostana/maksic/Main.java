package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		//Pravi A objekat za
		A<Integer> intObjekat =new A<Integer>(100);
		
		intObjekat.prikaziTip();
		int vrednostIntObjekat = intObjekat.getOb();
		System.out.println("Vrednost: " + vrednostIntObjekat);
	
		//Pravi A objekat za tip String
		A <String> stringObjekat =new A<String>("tekst");
		
		stringObjekat.prikaziTip();
		String str = stringObjekat.getOb();
		System.out.println("Vrednost: " + str);
		
	}

} 
//Zakljucak: T je zamena za stvarni tip koji ce biti zadat u trenutku 
//kreiranja objekta klase A.
