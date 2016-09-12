/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarrinhoDeCompras;

/**
 *
 * @author Rafael - PC
 */
public class Item {

    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public Item(String descricao, int quantidade, double valorUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return this.valorUnitario * this.quantidade;
    }
    
    public double getValor(){
        return this.valorUnitario;
    }
    
    public String getNome(){
            return this.descricao;
    }
    //geters para 
}
