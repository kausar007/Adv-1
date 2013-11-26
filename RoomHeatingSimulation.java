
public class RoomHeatingSimulation {

	public static void main(String[] args) {
		
		//Environment
		double outsideTemperature = 18;
		double environmentFactor = 0.1;
		
		//Room
		double roomTemperature = 20;
		double roomFactor = 0.05;
		double roomAreaFactor = 50;
		
		//Heater
		boolean heaterState = false;
		double heaterFactor = 30;
		
		//Thermostat
		double upperLimit = 22;
		double lowerLimit = 18;
		double overHeat = 2;
		
		//Simulation Units
		int simulations = 100;
		
		//Initialize Objects
		Environment myEnvironment = new Environment(outsideTemperature, environmentFactor);
		Thermostat myThermostat = new Thermostat(upperLimit, lowerLimit, overHeat);
		Heater myHeater = new Heater(heaterState, heaterFactor, myThermostat);
		Room myRoom = new Room(roomFactor, roomAreaFactor, roomTemperature, myHeater);
		
		for(int i = 1; i <= simulations; i++){
			
			myEnvironment.outsideTemperatureLoos();
			myRoom.roomTemperatureLoss(myEnvironment.getOutsideTemperature());
			
			if(myHeater.isOn()){
				myRoom.roomTemperatureGain();
				myHeater.checkUpper(myRoom.getRoomTemperature());
			}
			else{
				myHeater.checkLower(myRoom.getRoomTemperature());
			}
			display(i,myRoom.getRoomTemperature(),myHeater.isOn());
		}
		
	}
	
	private static void display(int unit, double roomTemperature, boolean heaterState){
		
		System.out.print(unit + "\t\t");
		System.out.printf("%.2f\t\t", roomTemperature);
		System.out.print("Heater is " + (heaterState ? "ON\n" : "OFF\n"));
	}

}
