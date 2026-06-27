package com.wipro.bank.acc;
public class RDaccount extends Account {

    public RDaccount(int tenure, float principal) {
        this.tenure = tenure;
        this.principal = principal;
    }

    @Override
	public float calculateinterest() {
    	float p=principal;//principle
		float r=rateofinterest/100;//rate of interest/100
    	float n=4;//4(no of quarter years)
    	float t=60/12;//no of months remaining
    	return (float)(p*(Math.pow((1+r/n), n*t)-1));
    	
    }

    @Override
    public float calculateamountdeposited() {
        return principal * 12 * tenure; 
    }
}
