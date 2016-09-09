/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufms.engenharia.exercicioCarrinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rafael
 */
public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<Item>();
    }

    public void adiciona(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public Item getValorMaior() {
        int maior = 0;
        if (itens.isEmpty()) {
            return null;
        } else if (itens.size() == 1) {
            return itens.get(0);
        }
        for (int i = 0; i < itens.size() - 1; i++) {
            if ((itens.get(i).getValorTotal()) > (itens.get(i + 1).getValorTotal())) {
                maior = i;

            } else {
                maior = i+1;
            }
        }
        return itens.get(maior);
    }
}
