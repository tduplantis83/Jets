package com.skilldistillery.jets;

import java.util.*;

public class JetsApplication {
	private AirField airField = new AirField();
	private Scanner input = new Scanner(System.in);
	
	public JetsApplication () {
		
	}

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		
		ja.launch();
		
	}

	private void launch() {
		
		do {
			displayUserMenu();
		} while(getUserMenuChoice());
	}

	private void displayUserMenu() {
		System.out.println("*********************************************");
		System.out.println("\tJETS APPLICATION MENU:");
		System.out.println("\t1. List Fleet");
		System.out.println("\t2. Fly all Jets");
		System.out.println("\t3. View Fastest Jet");
		System.out.println("\t4. View Jet with Longest Range");
		System.out.println("\t5. Load all Cargo Jets");
		System.out.println("\t6. Dogfight!!!!");
		System.out.println("\t7. Add a Jet to the Fleet");
		System.out.println("\t8. Remove a Jet from the Fleet");
		System.out.println("\t9. Quit");
		System.out.println("*********************************************");

	}
	
	private boolean getUserMenuChoice() {
		char choice = input.next().charAt(0);
		switch(choice) {
		case '1': 
			System.out.println("Listing Fleet...");
			return true;
		case '2': 
			System.out.println("Flying Jets...");
			return true;
		case '3': 
			System.out.println("Listing Fastest Jet..");
			return true;
		case '4': 
			System.out.println("Listing Jet with Longest Range...");
			return true;
		case '5': 
			System.out.println("Loading Cargo Jets...");
			return true;
		case '6': 
			System.out.println("Too close for missles. Switching to Guns!");
			return true;
		case '7': 
			System.out.println("Adding Jet...");
			return true;
		case '8': 
			System.out.println("Removing Jet from Fleet...");
			return true;
		case '9': 
			System.out.println("Quitting Application - Fly Safe!");
			return false;
		default: 
			System.err.println("\nERROR - Invalid selection. Please try again.\n");
			return false;
		}
		
	}

}
