package Assignment7Practice;

public class Thermometer {
    private double temperature;
    // set in celsius scale, using parameterless constructor if no parameter
    public Thermometer() {
        this.temperature = 37; 
    }
    //get temperature
    public double getTemperature() {
        return temperature;
    }
    //set temperature
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    
    @Override
    public String toString() {
        return "Thermometer [temperature in celsius =" + temperature + 
                            "temperature in fahrenheit =" + getTempInFahrenheit() +  
                            "temperature in kelvin =" + getTempInKelvin() +  "]";
    }
    // setters store the temperature in celsius scale in the BE
    // if set in celsius, store temp in celsius scale
    public void setTempInCelsius(double temperature){
            this.temperature = temperature;
    }
    // if set in fahrenheit, store temp in celsius scale
    public void setTempInFahrenheit(double temperature){
            this.temperature= (temperature - 32) * 5/9;
    }
    // if set in kelvin, store temp in celsius scale
    public void setTempInKelvin(double temperature){
            this.temperature = temperature - 273.15;
    }
    // getters convert the temperature in celsius scale in the BE to the desired scale
    // return temp in celsius scale
    public double getTempInCelsius(){
            return temperature;
    }
    // return temp in fahrenheit scale
    public double getTempInFahrenheit(){
        return (((temperature) * 9/5) + 32);
    }
    // return temp in kelvin scale
    public double getTempInKelvin(){
        return (temperature+ 273.15);
    }    
}
