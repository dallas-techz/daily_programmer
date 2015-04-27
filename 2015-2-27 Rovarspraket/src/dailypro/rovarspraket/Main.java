package dailypro.rovarspraket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		System.out.println(toRovarspraket(input));
		
		in.close();
		
	}

	private static String toRovarspraket(String input) {
		
		String toReturn = "";
		
		for(char c : input.toCharArray()) {
			if(isConsonant(c + "")) {
				toReturn += c + "o" + (c+"").toLowerCase();
			} else {
				toReturn += c;
			}
		}
		
		return toReturn;
	}

	private static boolean isConsonant(String singleChar) {
		
		return !"AEIOUYÅÄÖ!.,?\"\'! ".contains(singleChar.toUpperCase());
		
	}
}
