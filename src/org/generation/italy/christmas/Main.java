package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> wishList = new ArrayList <>();
		
		while(true) {
			System.out.print("Vuoi inserire un desiderio? [si/no]: ");
			String res = sc.nextLine();
			
			if(res.toLowerCase().equals("si")) {
				System.out.println("Scrivi il tuo desiderio: ");
				String wish = sc.nextLine();
				wishList.add(wish);
				
				
				System.out.println("Lunghezza della lista: " + wishList.size());
				continue;
				
			}
			break;
		}
		
		Collections.sort(wishList);
		System.out.println("La lista dei tuoi desideri: " + wishList);
		
	}
}