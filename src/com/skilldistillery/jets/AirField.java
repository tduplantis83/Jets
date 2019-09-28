package com.skilldistillery.jets;

//import java.io.*;
import java.util.*;

public class AirField {
	private ArrayList<Jet> jets = new ArrayList<Jet>();

	public AirField() {

	}

	public ArrayList<Jet> getJets() {
		return jets;
	}

	public void setJets(Jet j) {
		jets.add(j);
	}

	public Jet getFastest() {
		Jet fast = null;
		double speed = 0;

		for (Jet j : jets) {
			if (j.getSpeed() > speed) {
				speed = j.getSpeed();
				fast = j;
			}
		}
		return fast;
	}

	public Jet getLongestRange() {
		Jet bestRange = null;
		int distance = 0;

		for (Jet j : jets) {
			if (j.getRange() > distance) {
				distance = j.getRange();
				bestRange = j;
			}
		}

		return bestRange;
	}

	public void loadCargoJets() {
		for (Jet j : jets) {
			if (j instanceof CargoCarrier) {
				((CargoCarrier) j).loadCargo();
			}
		}
	}

	public void dogFight() {
		for (Jet j : jets) {
			if (j instanceof CombatReady) {
				((CombatReady) j).fight();
			}
		}
	}

	public void removeJet(Scanner input) {
		String model;
		input.nextLine();

		System.out.print("Please enter the full *Model name* of the Jet to be removed from the fleet: ");
		model = input.nextLine();
		int index;
		char confirm;
		int matchFound = 0;

		for (index = 0; index < jets.size(); index++) {
			if (jets.get(index).getModel().equalsIgnoreCase(model)) {
				matchFound = 1;
				break;
			}
		}

		if (matchFound > 0) {
			do {
				System.out.println("Match found - Are you sure you'd like to delete the \n" + "following jet? (Y/N)");
				System.out.println(jets.get(index).toString());
				confirm = input.next().toUpperCase().charAt(0);

				if (confirm == 'Y') {
					jets.remove(index);

					System.out.println("Jet removed from the fleet.");
				} else if (confirm == 'N') {
					System.out.println("OK - that jet was NOT removed from the fleet.");
				} else {
					System.err.println("\nERROR - Invalid Input. Try again.\n");
				}
			} while (confirm != 'Y' && confirm != 'N');
		} else {
			System.out.println("No Jet with the exact Model name was found.");
		}

	}

	public void loadPassengerJets() {
		for (Jet j : jets) {
			if (j instanceof PassengerCarrier) {
				((PassengerCarrier) j).loadPassengers();
			}
		}
	}

//	public void saveFleet(PrintWriter pw, FileWriter fw) {
//		try {
//			fw = new FileWriter("jetFleetOutput.txt");
//			pw = new PrintWriter(fw);
//		} catch (IOException err) {
//			System.out.println("Sorry, I can't open 'jetFleetOutput.txt' for writing.");
//			System.out.println("Maybe the file already exists and is read-only?");
//			pw = null;
//			fw = null;
//		}
//		
//		String fileContent = "";
//		for (Jet j : jets) {
//			fileContent += j.getModel() + ", " + j.getSpeed() + ", " + j.getRange() + ", " + j.getPrice() 
//			+ ", " + j.getJetType() + "\n";
//		}
//		
//		pw.print(fileContent);
//		
//		
//	}
}
