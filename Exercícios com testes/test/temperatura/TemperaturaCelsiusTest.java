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
public class TemperaturaCelsiusTest {   
    
    @Test
    public void tempEmCelsius() {       
        TemperaturaCelsius temp = new TemperaturaCelsius(0); 
        double resultadoEsperado = 32;
        double result = temp.converteCelsiusParaFahrenheit();
        assertEquals(resultadoEsperado, result, 0.00);
    }
    
}
