package com.wipro.bank.acc;

abstract public class Account {
	int tenure;
	float principal;
	float rateofinterest;

public void setInterest(int age,String gender){
	this.rateofinterest=rateofinterest;
	
	if (gender.equals("Male")&& age<60) {
		rateofinterest=9.8f;
		System.out.println("Rate Of Interest:"+rateofinterest);	
	}
	else if(gender.equals("Male")&& age>=60) {
		rateofinterest=10.5f;
		System.out.println("Rate Of Interest:"+rateofinterest);	
	}
	if (gender.equals("Female")&& age<58) {
		rateofinterest=10.2f;
		System.out.println("Rate Of Interest:"+rateofinterest);	
	}
	else if(gender.equals("Female")&& age>=58) {
		rateofinterest=10.8f;
		System.out.println("Rate Of Interest:"+rateofinterest);	
	}
}
public float CalculateMaturityAmount(float totalprincipaldeposit,float maturityinterest) {
	return totalprincipaldeposit + maturityinterest;
}
public abstract float calculateinterest();

public abstract float calculateamountdeposited();
}

