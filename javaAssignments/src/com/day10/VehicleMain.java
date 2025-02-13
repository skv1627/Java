package com.day10;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("2018","toyota",2021,"petrol",100,2);
		Cars car = new Cars("2019","audi",2022,"petrol",200,4);
		MotorCycle mc = new MotorCycle("2019","tesla",2025,"electric",300,5);
		System.out.println("Fuel efficiency is"+truck.fuelEfficiency());
		System.out.println("Speed of truck is "+ truck.speed());
		System.out.println("Distance travelled: "+truck.distanceTravelled(200,2));
		truck.printDetails();
	}

}
