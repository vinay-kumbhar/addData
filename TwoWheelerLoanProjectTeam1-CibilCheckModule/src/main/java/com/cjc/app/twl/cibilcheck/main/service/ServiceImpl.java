package com.cjc.app.twl.cibilcheck.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.twl.cibilcheck.main.model.Cibil;
import com.cjc.app.twl.cibilcheck.main.model.Score;
import com.cjc.app.twl.cibilcheck.main.repository.CibilRepository;

@Service
public class ServiceImpl implements ServiceI
{  
	@Autowired
	CibilRepository cr;

	@Override
	public void saveEnquiry(int score, String pan) 
	{
      Cibil cb=new Cibil();
		cb.setScore(score);
		cb.setCustomerPanNo(pan);
		
		
		if(score >=700)
		{
			cb.setStatus("good");
			cb.setRemark("approve");
		}
	
		else 
		{
			cb.setStatus("poor");
			cb.setRemark("reject");
		}
		
		cr.save(cb);
		
		
	}

	

}
