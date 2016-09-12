package br.com.militar.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.militar.model.Militar;
import br.com.militar.util.JPAUtil;



public class MilitarDao {
	
	EntityManager manager;
	
	public MilitarDao(){
		manager = new JPAUtil().getEntityManager();
	}
	
	public void addUser(Militar u){

		manager.getTransaction().begin();
		manager.persist(u);
		
		manager.getTransaction().commit();
		manager.close();//

	}
	
	public List<Militar> getUsers(){
		//manager.getTransaction().begin();
		Query query = manager.createQuery("select u from Militar u");
		
		List<Militar> users = query.getResultList();
		manager.close(); // fechando EntityManager
		return users;

	}
	
	public Militar getUsuarioById(int id){
		manager.getTransaction().begin();
		Militar u = manager.find(Militar.class, id);
		
		return u;
	}
	
	public void updateUser(Militar u){
		manager.merge(u);
		manager.getTransaction().commit();

		manager.close();
	}
	
	public void delUsuario(Militar u){
		Query q = manager.createQuery("delete Militar where id = ?0");
		q.setParameter(0, u.getId());
		q.executeUpdate();
		
		manager.getTransaction().commit();

		manager.close();		
	}	
}
