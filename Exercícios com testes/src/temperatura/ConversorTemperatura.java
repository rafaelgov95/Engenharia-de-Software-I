/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Rafael - PC
 */
public class ConversorTemperatura {

    public static double converteCelsiusParaFahrenheit(double celsius) {
        Double fahrenheit = 1.8 * celsius + 32;
        NumberFormat formatador = new DecimalFormat("#0.00");
        System.out.println(Double.parseDouble(formatador.format(fahrenheit)));
        return  Double.parseDouble(formatador.format(fahrenheit));
    }

    public static double converteFahrenheitParaCelsius(double fahrenheit) {
        double celsius = (5 / 9) * (fahrenheit - 32); 
        NumberFormat formatador = new DecimalFormat("#0.00");
        return  Double.parseDouble(formatador.format(celsius));
      
    }
}
