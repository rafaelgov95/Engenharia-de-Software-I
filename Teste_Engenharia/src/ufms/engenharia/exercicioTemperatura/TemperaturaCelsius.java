/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.exercicioTemperatura;

/**
 *
 * @author rafael
 */
public class TemperaturaCelsius {

    private double celsius;

    public TemperaturaCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double converteCelsiusParaFahrenheit() {
        double fahrenheit = 1.8 * celsius + 32; // f =1,8*c+32
        return fahrenheit;
    }
}
