package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
		okreniString os = (str) -> {
			String rezultat= " ";
			for(int i=str.length()-1; i>=0; i--) 
			rezultat += str.charAt(i);
			return rezultat;
			};
			
		System.out.println("12345 " + os.okreniString("12345"));
		System.out.println("Java obrnuto " + os.okreniString("java"));
	}

}
