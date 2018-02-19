package com.er.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.er.model.Engineer;
import com.er.model.EngineerScore;

@Repository
public class EngineerDAOImpl implements EngineerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
       
	@Override
    public long save(Engineer engineer) {
       sessionFactory.getCurrentSession().save(engineer);
       return engineer.getId();
    }

    @Override
    public Engineer getEngineerById(int id) {
       return (Engineer) sessionFactory.getCurrentSession().get(Engineer.class, id);
    }
    
    @Override
    public void update(int id, Engineer engineer) {
       Session session = sessionFactory.getCurrentSession();
       Engineer engr = (Engineer) session.byId(Engineer.class).load(id);
       engr.setCertification(engineer.getCertification());
       engr.setCertificationDetails(engineer.getCertificationDetails());
       engr.setCertificationType(engineer.getCertificationType());
       engr.setCollege(engineer.getCollege());
       engr.setCompanyName(engineer.getCompanyName());
       engr.setHackathonLink(engineer.getHackathonLink());
       engr.setGithubLink(engineer.getGithubLink());
       engr.setHighestEducation(engineer.getHighestEducation());
       engr.setLinkedInUrl(engineer.getLinkedInUrl());
       engr.setLocation(engineer.getLocation());
       engr.setNoOfPatents(engineer.getNoOfPatents());
       engr.setOpenSourceCommitLink(engineer.getOpenSourceCommitLink());
       engr.setOpenSourceContribution(engineer.getOpenSourceContribution());
       engr.setOpenSourceToolDeveloped(engineer.getOpenSourceToolDeveloped());
       engr.setPatentsFiled(engineer.getPatentsFiled());
       engr.setPatentsNumber(engineer.getPatentsNumber());
       engr.setPrimarySkill(engineer.getPrimarySkill());
       engr.setPrimarySkillExperience(engineer.getPrimarySkillExperience());
       engr.setHackathonParticipation(engineer.getHackathonParticipation());
       engr.setRole(engineer.getRole());
       engr.setSecondarySkill(engineer.getSecondarySkill());
       engr.setSecondarySkillExperience(engineer.getSecondarySkillExperience());
       engr.setStackOverflowUserid(engineer.getStackOverflowUserid());
       engr.setToolDetails(engineer.getToolDetails());
       engr.setTotalExperience(engineer.getTotalExperience());
       
       session.flush();
    }
}
