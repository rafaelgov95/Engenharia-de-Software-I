/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_engenharia;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void testmult() {
        Calculadora c = new Calculadora();
        int a = 2;
        int b = 2;
        int resultadoEsperado = 4;
        int resultado = c.mult(a, b);
        int resultadoEsperadoMultopor0 = -1;
        if (resultado == -1) {
            assertEquals(resultadoEsperadoMultopor0, resultado);
        } else {
            assertEquals(resultadoEsperado, resultado);
        }
    }
    @Test
    public void testSoma_int_int() {
        Calculadora c = new Calculadora();
        int a = 2;
        int b = 2;
        int resultadoEsperado = 4;
        int resultado = c.soma(a, b);
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testsub() {
        Calculadora c = new Calculadora();
        int a = 2;
        int b = 2;
        int resultadoEsperado = 0;
        int resultado = c.sub(a, b);
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testdiv() {
        Calculadora c = new Calculadora();
        int a = 2;
        int b = 0;
        int resultadoEsperado = 1;
        int resultado = c.div(a, b);
        int resultadoEsperadodividopor0 = -1;
        if (resultadoEsperadodividopor0 == -1) {
            assertEquals(resultadoEsperadodividopor0, resultado);
        } else {
            assertEquals(resultadoEsperado, resultado);
        }

    }

    @Test
    public void testSoma_int_int_negativo_vira_positivo() {
        Calculadora c = new Calculadora();
        int a = 2;
        int b = 2;
        int resultadoEsperado = 4;
        int resultado = c.mult(a, b);
        assertEquals(resultadoEsperado, resultado);

    }

    @Test
    public void testSoma_intArr() {
        Calculadora c = new Calculadora();
        int[] vetor = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int resulEsperado = 100;
        int resultado = c.soma(vetor);
        assertEquals(resulEsperado, resultado);

    }

}
