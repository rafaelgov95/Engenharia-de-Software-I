/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_JUnit;

import CPF.ValidacaoCPF;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael - PC
 */
public class ValidacaoCPFTest {
    ValidacaoCPF vCPF = new ValidacaoCPF();

    @Test
    public void testeValidacao() {
        String cpf = "39032566172";
        String resultadoValidacao = vCPF.validar(cpf);
        assertEquals(cpf, resultadoValidacao);
    }
}
