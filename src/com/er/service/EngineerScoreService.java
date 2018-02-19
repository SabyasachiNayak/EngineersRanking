package com.er.service;

import java.util.List;

import com.er.model.EngineerScore;

public interface EngineerScoreService
{
	 long save(EngineerScore ePoint);
	 EngineerScore get(int id);
	 List<EngineerScore> list();
	 void update(int id, EngineerScore ePoint);
	 void delete(int id);
}
