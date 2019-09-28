package com.skilldistillery.jets;

import java.util.*;
import java.io.*;

public class JetsApplication {
	private AirField airField = new AirField();
	private Scanner input = new Scanner(System.in);
	private PrintWriter pw;
	private FileOutputStream fos;
	
	public JetsApplication() {

	}

	public static void main(String[] args) throws IOException{
		JetsApplication ja = new JetsApplication();

		ja.launch();
	
	}

	private void launch() throws IOException {

		// import jets from file
		// create jets based on type
		// add all jets to airfield
		importJetsFromTxtFile();

//		setupAirField();

		do {
			displayUserMenu();
		} while (getUserMenuChoice());
		
		
		input.close();

	}

	private void displayUserMenu() {
		System.out.println("*********************************************");
		System.out.println("\tJETS APPLICATION MENU:");
		System.out.println("\t1. List Fleet");
		System.out.println("\t2. Fly all Jets");
		System.out.println("\t3. View Fastest Jet");
		System.out.println("\t4. View Jet with Longest Range");
		System.out.println("\t5. Load all Cargo Jets");
		System.out.println("\t6. Load all Passenger Jets");
		System.out.println("\t7. Dogfight!!!!");
		System.out.println("\t8. Add a Jet to the Fleet");
		System.out.println("\t9. Remove a Jet from the Fleet");
		System.out.println("\tS. Save Jet Fleet to a txt file");
		System.out.println("\tQ. Quit");
		System.out.println("*********************************************");

	}

	private boolean getUserMenuChoice() throws FileNotFoundException {
		char choice = input.next().charAt(0);
		switch (choice) {
		case '1':
			printJets();
			return true;
		case '2':
			System.out.println("Flying All Jets...");
			for (Jet j : airField.getJets()) {
				j.fly();
			}
			return true;
		case '3':
			System.out.println("Listing Fastest Jet..");
			System.out.println(airField.getFastest());
			return true;
		case '4':
			System.out.println("Listing Jet with Longest Range...");
			System.out.println(airField.getLongestRange());
			return true;
		case '5':
			System.out.println("Loading Cargo Jets...");
			airField.loadCargoJets();
			return true;
		case '6':
			System.out.println("Loading Passenger Jets...");
			airField.loadPassengerJets();
			return true;
		case '7':
			airField.dogFight();
			return true;
		case '8':
			System.out.println("Adding Jet...");
			addJet();
			return true;
		case '9':
			System.out.println("Remove a Jet from the Fleet...");
			printJets();
			airField.removeJet(input);
			return true;
		case 's':
		case 'S':
			System.out.println("Saving Current Fleet to jetFleet.txt...");
			airField.saveFleet(pw, fos);
			return true;
		case 'q':
		case 'Q':
			System.out.println("Quitting Application - Fly Safe!");
			return false;
		default:
			System.err.println("\nERROR - Invalid selection. Please try again.\n");
			return true;
		}

	}

	private void printJets() {
		System.out.println("Below are all of the jets currently in the fleet:");

		for (Jet j : airField.getJets()) {
			System.out.println(j);
		}
	}

	private void importJetsFromTxtFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("jetFleet.txt"));
			// holds a line of data from the txt file
			String fileInput;
			String[] jet = new String[5];
			while ((fileInput = br.readLine()) != null) {

				// array to hold txt file string without the commas
				// index 0 = model
				// index 1 = speed
				// index 2 = range
				// index 3 = cost
				// index 4 = type flag
				jet = fileInput.split(", ");
				
				//method to create jet based upon type
				createJet(jet);

			}
			br.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private void createJet(String[] jet) {
		// cargo plane
		if (jet[4].charAt(0) == 'C') {
			// create a new jet
			CargoJet j = new CargoJet(jet[0], Double.parseDouble(jet[1]), Integer.parseInt(jet[2]),
					Long.parseLong(jet[3]), (jet[4].charAt(0)));

			// add the jet an ArrayList of jets
			airField.setJets(j);

		}
		// fighter plane
		else if (jet[4].charAt(0) == 'F') {
			FighterJet j = new FighterJet(jet[0], Double.parseDouble(jet[1]), Integer.parseInt(jet[2]),
					Long.parseLong(jet[3]), (jet[4].charAt(0)));

			// add the jet an ArrayList of jets
			airField.setJets(j);
		}
		// passenger plane
		else if (jet[4].charAt(0) == 'P') {
			PassengerJet j = new PassengerJet(jet[0], Double.parseDouble(jet[1]), Integer.parseInt(jet[2]),
					Long.parseLong(jet[3]), (jet[4].charAt(0)));

			// add the jet an ArrayList of jets
			airField.setJets(j);
		} else {
			System.err.println("ERROR - Invalid Jet Type!");
		}
	}

	private void addJet() {
		String [] jet = new String[5];
		
		System.out.println("*********Create a new jet********");
		System.out.println("Which type of Jet: ");
		System.out.println("F = Fighter");
		System.out.println("C = Cargo");
		System.out.println("P = Passenger");
		jet[4] = input.next();
		input.nextLine();

		System.out.print("Enter Model: ");
		jet[0] = input.nextLine();

		System.out.print("Enter Speed: ");
		jet[1]= input.nextLine();

		System.out.print("Enter Range: ");
		jet[2] = input.nextLine();
		
		System.out.print("Enter Price: ");
		jet[3] = input.nextLine();
		
		createJet(jet);

	}

}
