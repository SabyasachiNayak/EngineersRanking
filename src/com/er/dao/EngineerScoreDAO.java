package com.er.dao;

import com.er.model.EngineerScore;

public interface EngineerScoreDAO
{
	long save(EngineerScore ePoint);
    EngineerScore get(int id);
    void update(int id, EngineerScore ePoint);
    void delete(int id);
}
