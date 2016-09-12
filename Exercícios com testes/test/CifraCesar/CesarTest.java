/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CifraCesar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael - PC
 */
public class CesarTest {

    Cesar cesar = new Cesar();

    @Test
    public void testSomeMethod() {
        String frase = "frase aqui o";
        int chave = 3;
        String frase_cifrada = cesar.cifrar(frase, chave);
        assertEquals("iudvh#dtxl#r", frase_cifrada);
        String frase_decifrada = cesar.decifrar(frase_cifrada, chave);
        assertEquals(frase, frase_decifrada);
        
    }

}
