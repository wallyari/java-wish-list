package org.generation.italy.christmas;

//import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise2 {
public static void main(String[] args) {		
	
		Scanner sc = new Scanner(System.in);
		Set<Character> character = new TreeSet<>();
		
		System.out.println("Inserisci una parola");
		String word = sc.nextLine();

		for (int x = 0; x < word.length(); x++) {
			char wordChar = word.charAt(x);
			character.add(wordChar);
		}
		
		System.out.println(character);
		System.out.println("----------------");
		
		sc.close();
	}
	}


