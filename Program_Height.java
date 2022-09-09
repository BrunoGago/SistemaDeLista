package application;

import java.util.Locale;
import java.util.Scanner;
import entities.People;

public class Program_Height {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas: ");
		int numberPeople = sc.nextInt();
		
		People[] list = new People[numberPeople];
				
		for(int i=0; i<list.length; i++) {
			System.out.printf("Dados da %dª pessoa: ", i+1);
			sc.nextLine();
			System.out.println("\nNome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int age= sc.nextInt();
			System.out.println("Altura: ");
			double height = sc.nextDouble();
			list[i]= new People(name, age, height);
		}

		double sum = 0.0;
		
		for(int i=0; i<list.length; i++) {
			sum += list[i].getHeight();
		}
		
		double avg = sum/list.length;
		
		System.out.printf("Altura média: %.2f%n", avg);
				
		int numberYoung;
	    double youngPercentual;
		
	    numberYoung = 0;
				
	    for (int i=0; i<list.length; i++) {
	        if (list[i].getAge() < 16) {
	        	numberYoung++;
	        }
	    }

	    youngPercentual = ((double)numberYoung / numberPeople) * 100.0;

	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", youngPercentual);

	    for(int i=0; i<list.length; i++) {
	        if (list[i].getAge() < 16) {
	        	System.out.printf("%s\n", list[i].getName());
	        }
	    }
		
		sc.close();
	}
}