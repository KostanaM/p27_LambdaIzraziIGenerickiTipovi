package P;

public class M  {
	static <T, N>void niz(T[] nizN, N[] nizN1 ){
		for( T t : nizN)
			System.out.printf("%8s ", t);
		
			for( N t1 : nizN1)
			System.out.printf("%8s ", t1);
			
	}
	
	public static void main(String[] args) {


String [] s = {"mama", "tata"	};

niz();
		
	}

}
