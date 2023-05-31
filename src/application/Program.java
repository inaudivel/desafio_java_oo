package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill account = new Bill();
		
		System.out.print("Sexo: ");
		account.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		account.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		account.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		account.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", account.feeding());
		if (account.cover() == 0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Consumo = R$ %.2f%n", account.cover());
		}
		System.out.printf("Ingresso = R$ %.2f%n", account.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", account.total());
		
		
		
		sc.close();

	}

}
