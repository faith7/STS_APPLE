package com.yoon;

public class Radio {

	private float station;

	public float getStation() {
		return station;
	}

	public void setStation(float station) {
		this.station = station;
	} 
	
	public void play(){
		System.out.println("Listening to the radio " + station + " station");
	}
}
