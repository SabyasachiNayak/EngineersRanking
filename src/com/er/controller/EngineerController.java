package com.er.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.er.algorithm.RankingAlgorithm;
import com.er.model.Engineer;
import com.er.model.EngineerScore;
import com.er.model.User;
import com.er.service.EngineerScoreService;
import com.er.service.EngineerService;
import com.er.service.UserService;
import com.er.utility.StatusMessage;

@Controller
@RequestMapping("/engineer")
public class EngineerController {
	
   @Autowired
   EngineerService engineerService;
   
   @Autowired
   UserService userService;
	
   @Autowired
   EngineerScoreService engScoreService;
   
   @RequestMapping(value = "/welcome", method = RequestMethod.GET)
   public String welcome(ModelMap model) {
	      return "welcome";
   }
   
   @RequestMapping(value = "/rankboard", method = RequestMethod.GET)
   public String rankingDashboard(ModelMap model) {
	      return "rankboard";
   }
   
   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public String user(ModelMap model) {
	      return "user";
   }
   
   @RequestMapping(value = "/register", method = RequestMethod.POST,produces="application/json")
   public ResponseEntity<User> register(@RequestBody User user)
   {
	   userService.register(user);
	   return new ResponseEntity<User>(user, HttpStatus.OK);
   }
   
   @RequestMapping(value = "/getId", method = RequestMethod.GET,produces="application/json")
   public ResponseEntity<Integer> getId(String email)
   {
	   int id = userService.getIdByEmail(email);
	   return new ResponseEntity<Integer>(id, HttpStatus.OK);
   }
   
   @RequestMapping(value = "/getEngineer/{id}", method = RequestMethod.GET,produces="application/json")
   public @ResponseBody Engineer getEngineer(@PathVariable("id") int id)
   {
	   Engineer engineer = engineerService.getEngineerById(id);
       return engineer;
   }
   
   @RequestMapping(value = "/addEngineer", method = RequestMethod.POST,produces="application/json")
   public ResponseEntity<Engineer> addEngineer(@RequestBody Engineer engineer)
   {
	   int id = userService.getIdByEmail(engineer.getEmailId());
	   engineer.setId(id);
	   engineerService.save(engineer);
	   return new ResponseEntity<Engineer>(engineer, HttpStatus.OK);
   }
   
   //Update a Engineer Point by id
   @RequestMapping(value = "/updateEngineer/{id}", method = RequestMethod.PUT,produces="application/json")
   public ResponseEntity<?> updatEngineer(@PathVariable("id") int id, @RequestBody Engineer engineer) {
	  engineerService.update(id, engineer);
      return new ResponseEntity<Engineer>(engineer, HttpStatus.OK);
   }

   
   @RequestMapping(value = "/getEngineerScore/{id}", method = RequestMethod.GET,produces="application/json")
   public @ResponseBody EngineerScore getTotalScore(@PathVariable("id") int id)
   {   
	   EngineerScore engScore = engScoreService.get(id);
       return engScore;
   }
   
   @RequestMapping(value = "/addEngineerScore/{id}", method = RequestMethod.POST,produces="application/json")
	public ResponseEntity<StatusMessage> addEngineerScore(@PathVariable("id") int id) {
	   StatusMessage sm = new StatusMessage();
	   Engineer engineer = engineerService.getEngineerById(id);
	   if(engineer != null)
	   {
		   int score = RankingAlgorithm.getScore(id,engineer);
		   	   
		   EngineerScore eScore = engScoreService.get(id);
		   if(eScore == null)
		   {
			   eScore = new EngineerScore();
			   eScore.setId(id);
			   eScore.setName(engineer.getName());
			   eScore.setScore(score);
			   eScore.setCompanyName(engineer.getCompanyName());
			   eScore.setSkill(engineer.getPrimarySkill());
			   engScoreService.save(eScore);
			   
			   sm.setStatus("Success");
			   sm.setMessage("Record inserted Successfully");
		   }
		   else
		   {
			   sm.setStatus("Failed");
			   sm.setMessage("Record already exists.");
		   }
	   }
	   else
	   {
		   sm.setStatus("Failed");
		   sm.setMessage("Record does not exist.");
	   }
	  	          
	   return new ResponseEntity<StatusMessage>(sm, HttpStatus.OK);
	}
   
   @RequestMapping(value = "/listEngineerScore", method = RequestMethod.GET,produces="application/json")
   public @ResponseBody List<EngineerScore> listTotalScore()
   {   
	   List<EngineerScore> scoreList = engScoreService.list();
       return scoreList;
   }
   
   //Update a Engineer Point by id
   @RequestMapping(value = "/updateEngineerScore/{id}", method = RequestMethod.PUT,produces="application/json")
   public ResponseEntity<?> update(@PathVariable("id") int id) {
	   Engineer engineer = engineerService.getEngineerById(id);
	   EngineerScore eScore = new EngineerScore();
	   if(engineer != null)
	   {
		   int score = RankingAlgorithm.getScore(id,engineer);   
		   eScore = engScoreService.get(id);
		   eScore.setScore(score);
		   eScore.setCompanyName(engineer.getCompanyName());
		   eScore.setSkill(engineer.getPrimarySkill());
		   engScoreService.update(id, eScore);
	   }
       return new ResponseEntity<EngineerScore>(eScore,HttpStatus.OK);
   }

   //Delete a Engineer Point by id
   @RequestMapping(value = "/deleteEngineerPoint/{id}", method = RequestMethod.DELETE,produces="application/json")
   public ResponseEntity<?> delete(@PathVariable("id") int id) {
	  engScoreService.delete(id);
      return ResponseEntity.ok().body("Score has been deleted successfully.");
   }
}
