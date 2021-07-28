package com.cjc.app.twl.cibilcheck.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cibil
{  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int cibilId;
	private int score;
	private String customerPanNo;
	private String status;
	private String remark;
	
	@Override
	public String toString() {
		return "Cibil [cibilId=" + cibilId + ", score=" + score + ", customerPanNo=" + customerPanNo + ", status="
				+ status + ", remark=" + remark + "]";
	}
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCustomerPanNo() {
		return customerPanNo;
	}
	public void setCustomerPanNo(String customerPanNo) {
		this.customerPanNo = customerPanNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	
	
	

}
