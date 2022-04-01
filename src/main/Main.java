package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = sc.nextInt();

		System.out.println("Factorial:" + factorial(n));
		System.out.println("Fibbonaci:" + fibonacci(n));

		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Gabriel");
		nombres.add("Jessica");
		nombres.add("Camilo");
		nombres.add("Juan");
		nombres.add("Esteban");
		nombres.add("Luis");
		nombres.add("Carlos");
		nombres.add("Sebastian");
		printArrayRecursive(nombres, 0);

	}

	private static void printArrayRecursive(ArrayList<String> nombres, int n) {

		// Condicion de parada
		if (n >= nombres.size() || n<0) {
			System.out.println("---Fin---");
			return;
		} else {
			System.out.println(nombres.get(n));
		}
		// Llamado recursivo
		printArrayRecursive(nombres, n + 1);
	}

	public static int factorial(int n) {

		// Stop condition
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);

	}

	public static int fibonacci(int n) {

		// Stop condition
		if (n == 0 || n == 1) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}