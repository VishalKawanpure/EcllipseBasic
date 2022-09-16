package com.practice;



public class Policy1 {
	
	int policyId;
	String policyName;
	String policyType;
	int policyAmount;
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}



  public Policy getPolicydetails() {
	  Policy policy= new Policy();
	  System.out.println(policy);
	  return policy; 
  
 
  
}}

