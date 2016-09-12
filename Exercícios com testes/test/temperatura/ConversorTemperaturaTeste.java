/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael - PC
 */
public class ConversorTemperaturaTeste {

    ConversorTemperatura conv = new ConversorTemperatura();

    @Test
    public void converterCelsius() {
        double celsius = 26;
        double resultadoEsperado = 78.8;
        double resul = conv.converteCelsiusParaFahrenheit(celsius);
        assertEquals(resultadoEsperado, resul, 0.00);
    }

    @Test
    public void converterFa() {
        double fahrenheit = 78.8;
        double resultadoEsperado = 26;
        double resul = conv.converteFahrenheitParaCelsius(fahrenheit);
        assertEquals(resultadoEsperado, resul, 0.00);
    }
}
