/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarrinhoDeCompras;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael - PC
 */
public class carrinhoDeCompraTest {
    carrinhoDeCompra cC = new carrinhoDeCompra();
    Item arroz = new Item("Arroz", 2, 5.5);
    Item feijao = new Item("Feijao", 4, 10);
    Item carne = new Item("Carne", 10, 7);
    @Test
    public void testSomeMethod() {
        cC.adiciona(arroz);
        cC.adiciona(feijao);
        cC.adiciona(carne);
        Item maiorValor = cC.geItemMaiorValor();
        System.out.println(maiorValor.getNome());
        
        assertEquals(maiorValor, feijao);
        
    }
    
}
