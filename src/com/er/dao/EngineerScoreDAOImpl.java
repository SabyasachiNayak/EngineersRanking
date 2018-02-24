package com.er.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
    public List<EngineerScore> list() {
    	String sqlQuery = "select * from engineer_score order by score desc limit 5";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sqlQuery).addEntity(EngineerScore.class);
        List<EngineerScore> esList = new ArrayList<>();
        List scoreList = query.list();
        Iterator it = scoreList.iterator();
        while(it.hasNext())  
        {
        	EngineerScore es = (EngineerScore)it.next();
        	esList.add(es);
        }
       return esList;
    }
    
    @Override
    public void update(int id, EngineerScore engScore) {
       Session session = sessionFactory.getCurrentSession();
       EngineerScore eScore = (EngineerScore) session.byId(EngineerScore.class).load(id);
       eScore.setScore(engScore.getScore());
       eScore.setCompanyName(engScore.getCompanyName());
       eScore.setSkill(engScore.getSkill());
       eScore.setLastModified(engScore.getLastModified());
       session.flush();
    }

    @Override
    public void delete(int id) {
       Session session = sessionFactory.getCurrentSession();
       EngineerScore engPoint = (EngineerScore) session.byId(EngineerScore.class).load(id);
       session.delete(engPoint);
    }
    
}
