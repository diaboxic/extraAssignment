package abcFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter your Name: ");
		String name = scn.nextLine();
		System.out.print("Enter your Customer ID: ");
		int id = scn.nextInt();

		RegisteredClient rgstrdclnt = new RegisteredClient(name, id);

		System.out.print("Enter your amount of Shirts: ");
		int orderAmount = scn.nextInt();

		Order order = new Order(orderAmount);

		scn.close();
	}

}
