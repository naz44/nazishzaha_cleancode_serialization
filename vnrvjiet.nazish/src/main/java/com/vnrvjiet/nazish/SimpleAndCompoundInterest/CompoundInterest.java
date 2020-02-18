package com.vnrvjiet.nazish.SimpleAndCompoundInterest;

public class CompoundInterest {
	double CalculateCompoundInterest(double principalAmount,double timeInYears,double rateOfInterest)
	{
		return(principalAmount*Math.pow(1.0+rateOfInterest/100.0,timeInYears)-principalAmount);
	}
}
