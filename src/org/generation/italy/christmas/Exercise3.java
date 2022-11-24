package org.generation.italy.christmas;

//import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise3 {
	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				

				Map<Character, Integer> character = new TreeMap<>();
				
				
				
				System.out.println("Inserisci una parola");
				String word = sc.nextLine();
			
				for (Character letter : word.toCharArray()) {
					int counter = 0;
					
					if (!character.containsKey(letter)) {
						counter = 1;
						character.put(letter, counter);
					} else {
						counter = character.get(letter) + 1;
						character.put(letter, counter);
					}
					
				}
				System.out.println(character);
				sc.close();
	}

}
