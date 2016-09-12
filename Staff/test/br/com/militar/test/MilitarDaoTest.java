package br.com.militar.test;

import java.util.List;

import org.junit.Test;

import br.com.militar.model.Militar;
import br.com.militar.model.dao.MilitarDao;
import junit.framework.Assert;

import javax.persistence.Query;

public class MilitarDaoTest extends AbstractDbUnitJpaTest {
    MilitarDao uDao = new MilitarDao();

    //
    @Test
    public void testFind() {
        Militar militar = uDao.getUsuarioById(1);
        Assert.assertNotNull(militar);
        Assert.assertEquals("Rafael", militar.getNome());
    }

    @Test
    public void add() {
        Militar militar2 = uDao.getUsuarioById(1);
        Assert.assertNotNull(militar2);
        Assert.assertEquals("Rafael", militar2.getNome());
    }


    public void getUsers() {
        List<Militar> userss = uDao.getUsers();
        List<Militar> users = uDao.getUsers();

        Assert.assertEquals(users, userss);
    }


    public void updateUser() {

        MilitarDao md1 = new MilitarDao();
        Militar militar = new Militar();
        militar.setNomedeGuerra("Rafael");
        militar.setNome("Rafael");
        militar.setSobreNome("Oliveira");
        militar.setMatricula("22-07");
        militar.setTelefone("67-99950-7979");
        militar.setPatente("Capitao");
        militar.setDataDeIngresso("dfad");
        militar.setDataNascimento("dadadfa");
        md1.updateUser(militar);
        Assert.assertEquals("Oliveira", militar.getSobreNome());

    }

    public void delUsuario(Militar u) {
        Militar militar1 = new Militar();
        MilitarDao md = new MilitarDao();

        militar1.setNomedeGuerra("Rafael");
        militar1.setNome("Rafael");
        militar1.setSobreNome("Oliveira");
        militar1.setMatricula("22-07");
        militar1.setTelefone("67-99950-7979");
        militar1.setPatente("Capitao");
        militar1.setDataDeIngresso("dfad");
        militar1.setDataNascimento("dadadfa");

        md.delUsuario(militar1);
        Assert.assertEquals(null, militar1.getNome());

    }

}
