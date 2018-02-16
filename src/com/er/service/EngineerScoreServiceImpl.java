package com.er.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.er.dao.EngineerScoreDAO;
import com.er.model.EngineerScore;

@Service
@Transactional(readOnly = true)
public class EngineerScoreServiceImpl implements EngineerScoreService {
 
    @Autowired
    EngineerScoreDAO engineerPointDAO;
     
    @Transactional
    @Override
    public long save(EngineerScore ePoint) {
       return engineerPointDAO.save(ePoint);
    }

    @Override
    public EngineerScore get(int id) {
       return engineerPointDAO.get(id);
    }
    
    @Transactional
    @Override
    public void update(int id, EngineerScore ePoint) {
    	engineerPointDAO.update(id, ePoint);
    }

    @Transactional
    @Override
    public void delete(int id) {
    	engineerPointDAO.delete(id);
    }
}
