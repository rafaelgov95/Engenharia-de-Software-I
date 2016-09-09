/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.exercicioCpf;

/**
 *
 * @author rafael
 */
public class GeradorDeCPF {

    static int resultado;

    public static int geraprimeiroDigito(int numeroCom9) {
        int mult = 2;
        while (mult < 11) {
            int numero = numeroCom9 % 10;
            resultado += numero * mult;
            numeroCom9 = (numeroCom9 / 10);
            mult += 1;
        }
        if ((resultado % 11) < 2) {
            return 0;
        }
        return 11 - (resultado % 11);

    }

    public static int gerarSegundoDigito(int  primeirodigito) {

        int mult = 2;
        while (mult < 12) {
           float numero = (primeirodigito % 10);
            resultado += numero * mult;
            primeirodigito = (primeirodigito / 10);
            mult += 1;
        }

        if ((Math.ceil(resultado) % 11) <2) {
            return 0;
        }
        return (int)(11 - (Math.ceil(resultado) % 11));

    }
}
