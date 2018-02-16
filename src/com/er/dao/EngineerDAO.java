package com.er.dao;

import com.er.model.Engineer;

public interface EngineerDAO
{   
    long save(Engineer engineer);
    Engineer getEngineerById(int id);
    void update(int id, Engineer engineer);
}
