package com.cjc.app.twl.cibilcheck.main.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.twl.cibilcheck.main.model.Cibil;
import com.cjc.app.twl.cibilcheck.main.model.Score;
import com.cjc.app.twl.cibilcheck.main.service.ServiceI;
@CrossOrigin("*")
@RestController
public class HomeController 
{  
	@Autowired
	ServiceI hs;
	
	@GetMapping("/checkcibil/{customerPanNo}")
	public Score checkScore(@PathVariable("customerPanNo")String customerPanNo) 
	{
		
		Score getScore = new Score();
		
		Random r = new Random();
		
		int score=r.nextInt(600)+300;
		
		hs.saveEnquiry(score, customerPanNo);
		
		if(score >= 700)
		{
			getScore.setScore("score is good : "+score);
			return getScore;
		}
        else 
		{
			getScore.setScore("score is poor : "+score);
		   return getScore;
	   }
	}		
}
