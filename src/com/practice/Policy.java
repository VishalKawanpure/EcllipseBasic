package com.practice;

public class Policy {
	
	int policyId= 1234;
	String policyName="LIC";
	String policyType="healthpolicy";
	int policyAmount=5000;
	
	
   @Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", policyAmount=" + policyAmount + "]";
	}

public Policy getPolicyDetails() {
	   
	   Policy policy= new Policy();
	   System.out.println(policy);
	   return policy;
	
	   
	   
   }
   
   public static void main(String[] args) {
	   
	   Policy p= new Policy();
	   
	   p.getPolicyDetails();
}
	   
   }
