package com.yoon.model;

import java.util.HashMap;
import java.util.Set;

public class Aliens {
    
	private HashMap<Integer, Alien> alienMap;

	public Aliens() {

		alienMap = new HashMap<Integer, Alien>();
	}
	
	public HashMap<Integer, Alien> getAlienMap() {
		return alienMap;
	}

	public void setAlienMap(HashMap<Integer, Alien> alienMap) {
		this.alienMap = alienMap;
	}
	
	public void addAliens(Alien alien){
		
		if(!alienMap.containsKey(alien.getId()))
			alienMap.put(alien.getId(), alien); 
	}
	
}
