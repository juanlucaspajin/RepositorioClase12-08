package testgit;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
	
		boolean rta = false;	
		
		int i = 34;
		
		String mark = sc.nextLine();
		
		rta = mark.equalsIgnoreCase("Martin");
		
		i = i/0;

		sc.close();
	}

}
