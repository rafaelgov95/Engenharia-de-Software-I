/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CifraCesar;

import java.util.Arrays;

/**
 *
 * @author Rafael - PC
 */
public class Cesar {

//    public static void main(String[] args) {
//        String cifrado = cifrar("frase aqui o", 3);
//        System.out.println(cifrado);
//        System.out.println(decifrar(cifrado, 3));
//    }
    public String cifrar(String frase, int chave) {
        String resultado = "";

        char vetor[] = frase.toCharArray();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (char) (vetor[i] + chave);
            resultado += vetor[i];
        }
        return resultado;
    }

    public String decifrar(String frase, int chave) {
        String resultado = "";
        char vetor[] = frase.toCharArray();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (char) (vetor[i] - chave);
            resultado += vetor[i];
        }
        return resultado;
    }

}
