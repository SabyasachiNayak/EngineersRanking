package com.er.service;

import com.er.model.EngineerScore;

public interface EngineerScoreService
{
	 long save(EngineerScore ePoint);
	 EngineerScore get(int id);
	 void update(int id, EngineerScore ePoint);
	 void delete(int id);
}
