package com.er.algorithm;

import java.util.Arrays;

import com.er.model.Engineer;

//Get total point and rank for an engineer
public class RankingAlgorithm {

	public static int getScore(int id,Engineer engineer)
	   {
		   int point = 0;
		  
		   //Company : Tier1->7, Tier2->5,Tier3->4,Others->3
		   String[] tier1 = {"Facebook", "Amzon", "Google","Apple","Walmart","Intuit"};
		   String[] tier2 = {"HP","SAP LAB", "IBM","Siemens","GE","ABB","Harman","Philips","JPMorgan","CapitalOne","Bank of America","Cloudera","Hortonworks","Qubole"};
		   String[] tier3 = {"TCS","Wipro","Infosys","Tech Mahindra","Accenture","IGate","Capgemini"};
		   
		   for(String s1: tier1){
			if(s1.equalsIgnoreCase(engineer.getCompanyName()) || engineer.getCompanyName().contains(s1))
			{
				point = point + 7;	
			}
		   }
		   if(point == 0)
		   {
			   for(String s2: tier2){
				if(s2.equalsIgnoreCase(engineer.getCompanyName()) || engineer.getCompanyName().contains(s2))
				{
					point = point + 5;	
				}
			   }
		   }
		
		   if(point == 0)
		   {
			   for(String s3: tier3){
				if(s3.equalsIgnoreCase(engineer.getCompanyName()) || engineer.getCompanyName().contains(s3))
				{
					point = point + 4;	
				}
			   }
		   }
		   if(point == 0)
		   {
			   point = point + 3;
		   }
		   
		   //Hot Skills - 7 points and Hot Skill Experience >= 5 ->5 more points , Exp >=3 & <5 -> 3 points
		   String[] hotSkills = {"Big Data","Hadoop","Cloud","Machine Learning","AI","DevOps"};
		   for(String skill: hotSkills)
		   {
			   if(skill.equalsIgnoreCase(engineer.getPrimarySkill()) && engineer.getPrimarySkillExperience() >= 5)
			   {
				   point = point + 7;
			   }
			   else if(skill.equalsIgnoreCase(engineer.getPrimarySkill()) && engineer.getPrimarySkillExperience() >=3 
					   && engineer.getPrimarySkillExperience() <5)
			   {
				   point = point + 5;
			   }
			   else if(skill.equalsIgnoreCase(engineer.getPrimarySkill()))
			   {
				   point = point + 3;
			   }
		   }
		   
		   //Patent/IP/Publication point : 5
		   if(engineer.getNoOfPatents()> 0 && engineer.getNoOfPatents() <= 2)
		   {
			   point = point + 5;
		   }
		   else if(engineer.getNoOfPatents()> 2 && engineer.getNoOfPatents() <= 5)
		   {
			   point = point + 11; //5 + 3*2
		   }
		   else if(engineer.getNoOfPatents()> 5)
		   {
			   point = point + 15;
		   }
		   
		   //Education and Institute: 8->2
		   String[] premierInstitutes = {"IIT","IISC","IIM"};
		   String[] secondPremInst = {"NIT","BITS"};
		   String[] thirdPremInst = {"KIIT","CET","IGIT","UCE","ITER"};
		   
		   if(engineer.getHighestEducation().equalsIgnoreCase("PhD") 
				   && Arrays.asList(premierInstitutes).contains(engineer.getCollege().toUpperCase()))
		   {
			   point = point + 8;
		   }
		   else if(engineer.getHighestEducation().equalsIgnoreCase("BTech") 
				   && Arrays.asList(premierInstitutes).contains(engineer.getCollege().toUpperCase()))
		   {
			   point = point + 7;
		   }
		   else if(engineer.getHighestEducation().equalsIgnoreCase("MTech") 
				   && Arrays.asList(premierInstitutes).contains(engineer.getCollege().toUpperCase()))
		   {
			   point = point + 6;
		   }
		   else if((engineer.getHighestEducation().equalsIgnoreCase("BTech") || engineer.getHighestEducation().equalsIgnoreCase("MCA"))
				   && Arrays.asList(secondPremInst).contains(engineer.getCollege().toUpperCase()))
		   {
			   point = point + 5;
		   }
		   else if(engineer.getHighestEducation().equalsIgnoreCase("MTech") 
				   && Arrays.asList(secondPremInst).contains(engineer.getCollege().toUpperCase()))
		   {
			   point = point + 4;
		   }
		   else if((engineer.getHighestEducation().equalsIgnoreCase("BTech") || engineer.getHighestEducation().equalsIgnoreCase("MCA"))
				   && Arrays.asList(thirdPremInst).contains(engineer.getCollege().toUpperCase()))
		   {
			   point = point + 3;
		   }
		   else
		   {
			   point = point + 2;
		   }
			   
		   //StackOverflow : 5
		   if(engineer.getStackOverflowUserid() != null || engineer.getStackOverflowUserid() != "")
		   {
			   point = point + 5;
		   }
		   
		   //Open Source Contribution : 5
		   if(engineer.getOpenSourceContribution().equalsIgnoreCase("yes") && (engineer.getOpenSourceCommitLink() != null || engineer.getOpenSourceCommitLink() != ""))
		   {
			   point = point + 5;
		   }
		   
		   //Github link and commit : 6
		   if(engineer.getGithubLink() != null || engineer.getGithubLink() != "")
		   {
			   point = point + 4;
		   }
		   
		   //Coding Challenge: 6
		   if(engineer.getHackathonParticipation().equalsIgnoreCase("yes") && (engineer.getHackathonLink() != null || engineer.getHackathonLink() != ""))
		   {
			   point = point + 4;
		   }
		  
		   //Certifications (Points: No of hot skill certification *2 :: No of regular skill certification * 1)
		   if(engineer.getCertification().equalsIgnoreCase("yes"))
		   {
			   if(engineer.getCertificationType().equalsIgnoreCase("Cloud") || engineer.getCertificationType().equalsIgnoreCase("Hadoop"))
			   {
				   if(engineer.getCertificationDetails() != null || engineer.getCertificationDetails() != "")
				   {
					   point = point + 5;
				   }
			   }
			   else
			   {
				   if(engineer.getCertificationDetails() != null || engineer.getCertificationDetails() != "")
				   {
					   point = point + 3;
				   }
			   }
		   }
		   
		   //Open Source Tool Development : 8
		   if(engineer.getOpenSourceToolDeveloped().equalsIgnoreCase("yes") && (engineer.getToolDetails() != null || engineer.getToolDetails() != ""))
		   {
			   point = point + 8;
		   }
		   
		   //Linkedin : 3
		   if(engineer.getLinkedInUrl() != null || engineer.getLinkedInUrl() != "")
		   {
			   point = point + 2;
		   }
		   
		   return point;
	   }
}
