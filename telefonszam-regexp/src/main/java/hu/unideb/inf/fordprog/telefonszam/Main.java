package hu.unideb.inf.fordprog.telefonszam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final PhoneNumberMatcher matcher = new PhoneNumberMatcher(); 
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			
			if (matcher.match(line)){
				System.out.println("elfogadva");				
			}else{
				System.out.println("elutasitva");
			}
			
		}
		
		sc.close();
	}

}
