package kostana.maksic;

public class Main {

	public static void main(String[] args) {
				
		ProveraDeljivosti deljivost = (n, m) -> (n % m ) == 0;
		
		if (deljivost.test(16 , 4)) {
			System.out.println("Prvi broj je deljiv sa drugim brojem.");
		}
		else {
			System.out.println("Prvi broj nije deljiv sa drugim brojem.");
		}
	}
}
