package com.er.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineer")
public class Engineer {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="emailId")
    private String emailId;
	
	@Column(name="highestEducation")
    private String highestEducation;
	
	@Column(name="college")
    private String college;
	
	@Column(name="companyName")
    private String companyName;
	
	@Column(name="location")
    private String location;
	
	@Column(name="role")
    private String role;
	
	@Column(name="totalExperience")
    private int totalExperience;
	
	@Column(name="primarySkill")
    private String primarySkill;
	
	@Column(name="secondarySkill")
    private String secondarySkill;
	
	@Column(name="primarySkillExperience")
    private int primarySkillExperience;
	
	@Column(name="secondarySkillExperience")
    private int secondarySkillExperience;
	
	@Column(name="patentsFiled")
    private String patentsFiled;
	
	@Column(name="noOfPatents")
    private Integer noOfPatents;
	
	@Column(name="patentsNumber")
    private String patentsNumber;
	
	@Column(name="linkedInUrl")
    private String linkedInUrl;
	
	@Column(name="stackOverflowUserid")
    private String stackOverflowUserid;
	
	@Column(name="githubLink")
    private String githubLink;
	
	@Column(name="openSourceContribution")
    private String openSourceContribution;
	
	@Column(name="openSourceCommitLink")
    private String openSourceCommitLink;
	
	@Column(name="hackathonParticipation")
    private String hackathonParticipation;
	
	@Column(name="hackathonLink")
    private String hackathonLink;
	
	@Column(name="certification")
    private String certification;
	
	@Column(name="certificationType")
    private String certificationType;
	
	@Column(name="certificationDetails")
    private String certificationDetails;
	
	@Column(name="openSourceToolDeveloped")
    private String openSourceToolDeveloped;
	
	@Column(name="toolDetails")
    private String toolDetails;

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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public int getPrimarySkillExperience() {
		return primarySkillExperience;
	}

	public void setPrimarySkillExperience(int primarySkillExperience) {
		this.primarySkillExperience = primarySkillExperience;
	}

	public int getSecondarySkillExperience() {
		return secondarySkillExperience;
	}

	public void setSecondarySkillExperience(int secondarySkillExperience) {
		this.secondarySkillExperience = secondarySkillExperience;
	}

	public String getPatentsFiled() {
		return patentsFiled;
	}

	public void setPatentsFiled(String patentsFiled) {
		this.patentsFiled = patentsFiled;
	}

	public Integer getNoOfPatents() {
		return noOfPatents;
	}

	public void setNoOfPatents(Integer noOfPatents) {
		this.noOfPatents = noOfPatents;
	}

	public String getPatentsNumber() {
		return patentsNumber;
	}

	public void setPatentsNumber(String patentsNumber) {
		this.patentsNumber = patentsNumber;
	}

	public String getLinkedInUrl() {
		return linkedInUrl;
	}

	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}

	public String getStackOverflowUserid() {
		return stackOverflowUserid;
	}

	public void setStackOverflowUserid(String stackOverflowUserid) {
		this.stackOverflowUserid = stackOverflowUserid;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getOpenSourceContribution() {
		return openSourceContribution;
	}

	public void setOpenSourceContribution(String openSourceContribution) {
		this.openSourceContribution = openSourceContribution;
	}

	public String getOpenSourceCommitLink() {
		return openSourceCommitLink;
	}

	public void setOpenSourceCommitLink(String openSourceCommitLink) {
		this.openSourceCommitLink = openSourceCommitLink;
	}

	public String getHackathonParticipation() {
		return hackathonParticipation;
	}

	public void setHackathonParticipation(String hackathonParticipation) {
		this.hackathonParticipation = hackathonParticipation;
	}

	public String getHackathonLink() {
		return hackathonLink;
	}

	public void setHackathonLink(String hackathonLink) {
		this.hackathonLink = hackathonLink;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}

	public String getCertificationDetails() {
		return certificationDetails;
	}

	public void setCertificationDetails(String certificationDetails) {
		this.certificationDetails = certificationDetails;
	}

	public String getOpenSourceToolDeveloped() {
		return openSourceToolDeveloped;
	}

	public void setOpenSourceToolDeveloped(String openSourceToolDeveloped) {
		this.openSourceToolDeveloped = openSourceToolDeveloped;
	}

	public String getToolDetails() {
		return toolDetails;
	}

	public void setToolDetails(String toolDetails) {
		this.toolDetails = toolDetails;
	}
	
}
