
public class Room {
	
	private double roomFactor;
	private double areaFactor;
	private double roomTemperature;
	
	Heater roomHeater;
	
	public Room(double roomFactor, double areaFactor, double roomTemperature, Heater roomHeater){
		this.roomFactor = roomFactor;
		this.areaFactor = areaFactor;
		this.roomTemperature = roomTemperature;
		this.roomHeater = roomHeater;
	}
	
	public void roomTemperatureLoss(double outsideTemperature){
		this.roomTemperature -= (this.roomTemperature - outsideTemperature)*this.roomFactor;
	}
	
	public void roomTemperatureGain()
	{
		this.roomTemperature += roomHeater.getFactor()/this.areaFactor;
	}
	
	public double getRoomTemperature(){
		return this.roomTemperature;
	}

}
