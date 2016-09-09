/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.exercicioCalculadora;

/**
 *
 * @author rafael
 */
public class Calculadora {

    public int soma(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);
        return a + b;
    }

    public int soma(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetor[i];
        }
        return soma;

    }

    public int sub(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            return -1;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            return a / b;
        }
    }

    public int mult(int a, int b) {
        if (b == 0) {
            return -1;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            return a * b;
        }
    }

}
