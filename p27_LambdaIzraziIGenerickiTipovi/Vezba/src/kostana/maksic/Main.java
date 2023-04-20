package kostana.maksic;

import java.util.Scanner;

public class Main {
	static <T, C> void stapajNiz(T[]niz, C[]niz1){
	for(T element : niz)
		System.out.printf("%s ", element);
		for(C element1 : niz1)
		System.out.printf("%s ", element1);
	}
	public static void main(String[] args) {
		
		Integer [] ar = {1,2,3,4,5};
		Double [] ar1 = {1.0,2.0,3.0,4.0,5.0};
		stapajNiz(ar, ar1);
		
	}

}
