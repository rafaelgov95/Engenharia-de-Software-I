/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Rafael - PC
 */
public class carrinhoDeCompra {

    private List<Item> itens;

    public carrinhoDeCompra() {
        this.itens = new ArrayList<Item>();
    }

    public void adiciona(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public Item geItemMaiorValor() {
        double maior = 0;
        if (itens.isEmpty()) {
            return null;
        } else if (itens.size() == 1) {
            return itens.get(0);
        } else {
            for (int i = 1; i < itens.size(); i++) {
                if (itens.get(i).getValor() > itens.get((int) maior).getValor()) {
                    maior = i;
                }
            }
        }
        return itens.get((int) maior);
    }
}
