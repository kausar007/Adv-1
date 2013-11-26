
public class Thermostat {
	
	private double upperLimit;
	private double lowerLimit;
	
	public Thermostat(double upperLimit, double lowerLimit, double overHeat){
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit + overHeat;
	}
	
	public boolean checkUpperLimit(double temperature){
		return temperature >= this.upperLimit;
	}
	
	public boolean checkLowerLimit(double temperature){
		return temperature < this.lowerLimit;
	}

}
