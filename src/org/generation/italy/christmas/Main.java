package org.generation.italy.christmas;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static class VowelsComparator implements Comparator<String>{

 		@Override
 		public int compare(String o1, String o2) {
 
 			int v1 = 0 ;
 			int v2 = 0 ;
 			
 			for (int i = 0; i < o1.length(); i++) {
 
 				if(o1.charAt(i) == 'a' || o1.charAt(i) == 'e' || o1.charAt(i) == 'i' || o1.charAt(i) == 'o' 
 						|| o1.charAt(i) == 'u' ) {
 		
 					v1++;
 				}
 			}
 
 			for (int i = 0; i < o2.length(); i++) {

 				if(o2.charAt(i) == 'a' || o2.charAt(i) == 'e' || o2.charAt(i) == 'i' || o2.charAt(i) == 'o' 
 						|| o2.charAt(i) == 'u' ) {
 					v2++;
 				}
 			}
 			// TODO Auto-generated method stub
 			return v2- v1;
 		}
 	}
	
	

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
		
		//Collections.sort(wishList);
		System.out.println("La lista dei tuoi desideri: " + wishList);
		
 		
		System.out.println("- - Comparator - -");
 		VowelsComparator vowelsComparator = new VowelsComparator();
 		wishList.sort(vowelsComparator);
 		System.out.println(wishList);
 		
 		
 		sc.close();
		
	}
	
	
}