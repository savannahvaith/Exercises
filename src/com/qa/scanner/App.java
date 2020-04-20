package com.qa.scanner;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter summin: ");
		String input = scan.nextLine(); 
		System.out.println("Input: " + input);
		scan.close(); 
	}
	
}
