package com.wipro.bank.service;
import com.wipro.bank.acc .RDaccount;
import com.wipro.bank.exception.BankValidationException;
public class BankService {
	public boolean validateData(float principal,int tenure,int age,String gender) {
		try {
		if (principal<500 &&
			( tenure==5 || tenure==10) 
			&& age>=1 && age<=100 && 
			(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
			return true;
		}
		else {
			throw new BankValidationException();
		}
	}
		catch(BankValidationException e){
			System.out.println(e);
			return false;
		}
	}
public void calculate(float principal,int tenure,int age,String gender) {
	boolean answer = validateData(principal,tenure,age, gender);
	if (answer) {
		RDaccount rda = new RDaccount(tenure,principal);
		rda.setInterest(age, gender);
       
        System.out.println("Interest : " + rda.calculateinterest());
        System.out.println("Amount Deposited : " + rda.calculateamountdeposited());
        System.out.println("Maturity Amount : " + rda.CalculateMaturityAmount(principal, age));
		}
	else {
        System.out.println("Validation Failed");
    }
	}
}











