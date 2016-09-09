package br.com.militar.test;

import java.util.List;

import org.junit.Test;

import br.com.militar.model.Militar;
import br.com.militar.model.dao.MilitarDao;
import junit.framework.Assert;

public class MilitarDaoTest extends AbstractDbUnitJpaTest{
	MilitarDao uDao = new MilitarDao();

	@Test
	public void testFind() {		
		Militar user = uDao.getUsuarioById(1);
		Assert.assertNotNull(user);
		Assert.assertEquals("Peter", user.getNome());
	}	
	
	
	@Test
	public void testFindAll() {
		
		List<Militar> allUsers = uDao.getUsers();
		Assert.assertEquals(50, allUsers.size());
	}

}
