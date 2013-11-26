
public class Heater {
	
	private boolean isOn;
	private double heaterFactor;
	
	Thermostat heaterThermostat;
	
	public Heater(boolean state, double heaterFactor, Thermostat heaterThermostat){
		this.isOn = state;
		this.heaterFactor = heaterFactor;
		this.heaterThermostat = heaterThermostat;
	}
	
	public boolean isOn (){
		return this.isOn;
	}
	
	public double getFactor(){
		return this.heaterFactor;
	}
	
	public void checkUpper(double roomTemperature){
		if(heaterThermostat.checkUpperLimit(roomTemperature)){
			this.isOn = false;
			System.out.println("Switching off Heater");
		}
	}
	
	public void checkLower(double roomTemperature){
		if(heaterThermostat.checkLowerLimit(roomTemperature)){
			this.isOn = true;
			System.out.println("Switching on Heater");
		}
	}

}
