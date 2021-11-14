package animale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class animale {

	Scanner nume = new Scanner(System.in);
	Scanner varsta = new Scanner(System.in);
	Scanner special = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		int alegere = 0;
		List<Object> animale = new ArrayList();
		
		
		
		while (alegere != 4) {
			List atribute = new ArrayList();
			
			
			System.out.println("1.Add new pet");
			System.out.println("2.List pets");
			System.out.println("3.Rremove pet");
			System.out.println("4.Quit");
			System.out.println("");
			System.out.println("Alegeti o optiune:");
			
			Scanner optiune = new Scanner(System.in);
			alegere = optiune.nextInt();
			
			if (alegere == 1) {
				animale animal = new animale();
				
				System.out.println("1.Caine");
				System.out.println("1.Pisica");
				System.out.println("3.Cameleon");
				System.out.println("");
				System.out.println("Alegeti o optiune:");
				
				Scanner optiune_2 = new Scanner(System.in);
				int alegere_2 = optiune_2.nextInt();
				
				if (alegere_2 == 1) {
					atribute.add("Caine");}
					
				if (alegere_2 == 2) {
					atribute.add("Pisica");}
				
				if (alegere_2 == 3) {
					atribute.add("Cameleon");}
				
				System.out.println("Alegeti nume:");
				String denumire = animal.nume.nextLine();
				atribute.add(denumire);
				
						
				System.out.println("Alegeti varsta:");
				int ani = animal.varsta.nextInt();
				atribute.add(ani);
				
				if (alegere_2 == 1) {
				
					System.out.println("Ce rasa este?");
					String atribut = animal.special.nextLine();
					atribute.add(atribut);
				
							}
				
				if (alegere_2 == 2) {
					
					System.out.println("Are blana lunga sau scurta?");
					String atribut = animal.special.nextLine();
					atribute.add(atribut);
				
			}
				
				if (alegere_2 == 3) {
					
					System.out.println("Ce culoare este?");
					String atribut = animal.special.nextLine();
					atribute.add(atribut);
				
			
				}
				
				animale.add(atribute);
				

			}
			
			
			if (alegere == 2) {
				System.out.println(animale);
			}
			
			if (alegere == 3) {
				System.out.println(animale);
				Scanner eliminare = new Scanner(System.in);
				System.out.println("Ce animal vreti sa stergeti?");
				int eliminare_2 = eliminare.nextInt();
				animale.remove(animale.get(eliminare_2 - 1));
				System.out.println(animale);
			}
		
		}
		
		
		
		
		
		
		
		System.out.println("La revedere!");
}}
