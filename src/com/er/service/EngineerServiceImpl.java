package com.er.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.er.dao.EngineerDAO;
import com.er.model.Engineer;

@Service
public class EngineerServiceImpl implements EngineerService {
 
    @Autowired
    EngineerDAO engineerDAO;
         
 	@Override
	@Transactional
	public Engineer getEngineerById(int id) {
		return engineerDAO.getEngineerById(id);
	}
 	
 	@Transactional
    @Override
    public long save(Engineer engineer) {
       return engineerDAO.save(engineer);
    }
 	
 	@Transactional
    @Override
    public void update(int id, Engineer engineer) {
     	engineerDAO.update(id, engineer);
    }
}
