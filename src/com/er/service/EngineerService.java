package com.er.service;

import com.er.model.Engineer;

public interface EngineerService
{
	Engineer getEngineerById(int id);
    long save(Engineer engineer);
    void update(int id, Engineer engineer);
}
