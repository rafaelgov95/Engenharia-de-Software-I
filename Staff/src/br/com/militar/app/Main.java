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
        Date data = new Date(100000);

        militar.setNomedeGuerra("Rafael Viana");
        militar.setNome("Rafael");
        militar.setSobreNome("Viana");
        militar.setMatricula("22-07");
        militar.setTelefone("67-99950-7979");
        militar.setPatente("Capitao");
        militar.setDataDeIngresso(data);
        militar.setDataNascimento(data);

        militarDao.addUser(militar);
    }
}
