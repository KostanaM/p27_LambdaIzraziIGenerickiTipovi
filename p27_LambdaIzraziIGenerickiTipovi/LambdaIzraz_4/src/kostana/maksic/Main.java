package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
    TestirajBroj negativanBroj = (n) -> (n <= 0 ); 
		
		if (negativanBroj.test(7)) {
			System.out.println("Broj je negativan.");
		}
		else {
			System.out.println("Broj nije negativan.");
		}
	}
}