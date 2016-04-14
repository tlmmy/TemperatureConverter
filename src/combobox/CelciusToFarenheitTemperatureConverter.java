/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

/**
 *
 * @author trogers8
 */
public class CelciusToFarenheitTemperatureConverter implements TemperatureConverterStrategy{

    @Override
    public double convertTemp(double temp) {
        double convertedTemp = (temp*9/5) + 32;
        return convertedTemp;
    }

    @Override
    public String toString() {
        return "Celcius To Farenheit";
    }
    
}
