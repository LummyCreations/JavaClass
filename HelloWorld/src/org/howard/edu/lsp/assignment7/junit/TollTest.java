package org.howard.edu.lsp.assignment7.junit;

public class TestTollBooth {
public static void main(String [] args){
	TollBooth booth = new AlleghenyTollBooth();

	Truck ford = new Ford(5, 12000);
	Truck daewoo = new DaewooTruck(6, 17000); 

	booth.calculateToll(ford);
	booth.displayData();
	booth.reset();
	booth.calculateToll(daewoo);
	booth.displayData();	
}
