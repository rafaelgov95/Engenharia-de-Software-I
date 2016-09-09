/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.execercicioCriptografia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Informe Uma Frase: ");
        System.out.println(Criptografia.criptografia(br.readLine(), Integer.parseInt(br.readLine())));
         System.out.println("Informe Uma Frase para descri:  ");
        System.out.println(Criptografia.descriptografia(br.readLine(), Integer.parseInt(br.readLine())));

    }

}
