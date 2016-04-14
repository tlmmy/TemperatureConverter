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
public class FarenheitToCelciusTemperatureConverter implements TemperatureConverterStrategy{

    @Override
    public double convertTemp(double temp) {
        double convertedTemp = (temp-32) * 5/9;
        return convertedTemp;
    }

    @Override
    public String toString() {
        return "Farenheit To Celcius";
    }
    
}
