/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.exercicioCpf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        int numero = Integer.parseInt(leia.readLine());
        int primeiroDigito = GeradorDeCPF.geraprimeiroDigito(numero);
        int segundoDigito = GeradorDeCPF.gerarSegundoDigito((int) (numero + primeiroDigito));
        System.out.print((numero) + "-" + primeiroDigito + segundoDigito);
//        double segundoDigito = GeradorDeCPF.gerarSegundoDigito(primeiroDigitof);
//        System.out.print(segundoDigito);

    }
}
