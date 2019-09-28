package com.skilldistillery.jets;

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
			if(j.getSpeed() > speed) {
				speed = j.getSpeed();
				fast = j;
			}
		}
		return fast;
	}
	
	public Jet getLongestRange() {
		Jet bestRange = null;
		int distance = 0;
		
		for(Jet j : jets) {
			if(j.getRange() > distance) {
				distance = j.getRange();
				bestRange = j;
			}
		}
		
		return bestRange;
	}
	
	public void loadCargoJets() {
		for(Jet j : jets) {
			if( j instanceof CargoCarrier) {
				((CargoCarrier) j).loadCargo();
			}
		}
	}
	
	public void dogFight() {
		for(Jet j : jets) {
			if( j instanceof CombatReady) {
				((CombatReady) j).fight();
			}
		}
	}
}
