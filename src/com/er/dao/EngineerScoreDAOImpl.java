package com.er.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.er.model.EngineerScore;

@Repository
public class EngineerScoreDAOImpl implements EngineerScoreDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
     
    @Override
    public long save(EngineerScore engPoint) {
       sessionFactory.getCurrentSession().save(engPoint);
       return engPoint.getId();
    }

    @Override
    public EngineerScore get(int id) {
       return (EngineerScore) sessionFactory.getCurrentSession().get(EngineerScore.class, id);
    }
    
    @Override
    public void update(int id, EngineerScore engPoint) {
       Session session = sessionFactory.getCurrentSession();
       EngineerScore ePoint = (EngineerScore) session.byId(EngineerScore.class).load(id);
       ePoint.setScore(engPoint.getScore());
       ePoint.setLastModified(engPoint.getLastModified());
       session.flush();
    }

    @Override
    public void delete(int id) {
       Session session = sessionFactory.getCurrentSession();
       EngineerScore engPoint = (EngineerScore) session.byId(EngineerScore.class).load(id);
       session.delete(engPoint);
    }
    
}
