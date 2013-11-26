
public class Environment {
	
	private double outsideTemperature;
	private double environmentFactor;
	
	public Environment(double outsideTemperature, double environmentFactor){
		this.outsideTemperature = outsideTemperature;
		this.environmentFactor = environmentFactor;
	}
	
	public void outsideTemperatureLoos(){
		this.outsideTemperature = this.outsideTemperature - this.environmentFactor;
	}
	
	public double getOutsideTemperature(){
		return this.outsideTemperature;
	}

}
