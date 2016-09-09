/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.execercicioCriptografia;

/**
 *
 * @author rafael
 */
public class Criptografia {

    public static String criptografia(String frase, int valor) {
        String resultado = "";
        char[] cript = frase.toCharArray();
        for (char c : cript) {
            resultado += ((char) (c + valor));
        }
        return resultado;
    }

    public static String descriptografia(String frase, int valor) {
        String resultado = "";
        char[] cript = frase.toCharArray();
        for (char c : cript) {
           resultado += ((char) (c - valor));
            
        }
        return resultado;
    }
}
