/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.exercicioCarrinho;

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

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        while (true) {
            System.out.println("Escolha uma das opçoes:\n 1 - criar item\n 2 - Get All\n 3 - Get Valor Maior");
            String escolha = br.readLine();
            switch (escolha) {
                case "1":
                    System.out.println("Descricao do Item");
                    String Desc = br.readLine();

                    System.out.println("Quantidade do Item");
                    int quantidade = Integer.parseInt(br.readLine());

                    System.out.println("Valor do Item");
                    double valor = Double.parseDouble(br.readLine());

                    Item itemCriado = new Item(Desc, quantidade, valor);
                    carrinho.adiciona(itemCriado);
                    break;
                case "2":

                    System.out.println("Item de Maior Valor foi: \n"
                            + "Descrição: " + carrinho.getValorMaior().getDescricao() + "\n"
                            + "Quantidade: " + carrinho.getValorMaior().getDescricao() + "\n"
                            + "Valor Total: " + carrinho.getValorMaior().getValorTotal() + "\n"
                            + "Valor Unitario" + carrinho.getValorMaior().getValorUnitario() + "\n"
                    );
                    break;
                case "3":
                    System.out.println("Lista de Itens \n");
                    for (Item item : carrinho.getItens()) {
                        System.out.println(item.getDescricao());
                    }
                    break;

                
            }
        }
    }
}
