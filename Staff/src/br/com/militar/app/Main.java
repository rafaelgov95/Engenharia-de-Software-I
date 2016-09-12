package br.com.militar.app;

import br.com.militar.model.Militar;
import br.com.militar.model.dao.MilitarDao;

import java.sql.Date;

/**
 * Created by rafael on 08/09/16.
 */
public class Main {
    public static void main(String args[]) {
        MilitarDao militarDao = new MilitarDao();
        Militar militar = new Militar();


        militar.setNomedeGuerra("Higor");
        militar.setNome("Rafael");
        militar.setSobreNome("Viana");
        militar.setMatricula("22-07");
        militar.setTelefone("67-99950-7979");
        militar.setPatente("Capitao");
        militar.setDataDeIngresso("Hoje");
        militar.setDataNascimento("Ontem");

        militarDao.addUser(militar);


    }
}
