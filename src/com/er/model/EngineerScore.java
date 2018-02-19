package com.er.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineer_score")
public class EngineerScore {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="score")
    private int score;
	
	@Column(name="company")
    private String companyName;
	
	@Column(name="skill")
    private String skill;
	
	@Column(name="lastModified")
    private Date lastModified;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
}