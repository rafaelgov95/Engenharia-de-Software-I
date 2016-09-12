/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CPF;

import java.util.Scanner;

/**
 *
 * @author Rafael - PC
 */
public class ValidacaoCPF {

    public static String vetorMaisUm(String cpf, int dig) {
        cpf += dig;
        return cpf;

    }

    public static int multiplicador_parte1(String cpf) {
        int multiplicador[] = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        String cpf_dividido[] = cpf.split("");
        int result[] = new int[multiplicador.length];
        int soma = 0;

        for (int i = 0; i < cpf_dividido.length; i++) {
            result[i] = Integer.parseInt(cpf_dividido[i]) * multiplicador[i];
            soma += result[i];
        }

        int dig;

        if ((soma % 11) < 2) {
            dig = 0;
        } else {
            dig = Math.abs(11 - (soma % 11));
        }

        return dig;
    }

    public static int multipliocador_parte2(String cpf) {

        int multiplicador[] = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        String cpf_dividido[] = cpf.split("");
        int result[] = new int[multiplicador.length];
        int soma = 0;

        for (int i = 0; i < cpf_dividido.length; i++) {
            result[i] = Integer.parseInt(cpf_dividido[i]) * multiplicador[i];
            soma += result[i];
        }

        int dig;

        if ((soma % 11) < 2) {
            dig = 0;
        } else {
            dig = Math.abs(11 - (soma % 11));
        }
        return dig;
    }

    public static void main(String[] args) {
        //      33312498740
        Scanner ler = new Scanner(System.in);
        String cpf = ler.nextLine();
        validar(cpf);
        
        
    }

    public  static String validar(String cpf) {
        String cpf_aux = cpf.substring(0, cpf.length() - 2);

        int dig_1 = multiplicador_parte1(cpf_aux);
        cpf_aux = vetorMaisUm(cpf_aux, dig_1);
        int dig_2 = multipliocador_parte2(cpf_aux);
        cpf_aux = vetorMaisUm(cpf_aux, dig_2);

        if (cpf.equals(cpf_aux)) {
            System.out.println("DIGITO VERIFICADOR VALIDO");
        } else {
            System.out.println("DIGITO VERIFICADOR INVALIDO");
        }
        
        return cpf_aux;

    }

}
