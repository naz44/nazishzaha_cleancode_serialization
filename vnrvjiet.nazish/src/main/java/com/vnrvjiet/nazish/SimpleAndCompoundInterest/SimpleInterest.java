package com.vnrvjiet.nazish.SimpleAndCompoundInterest;

public class SimpleInterest {
	
	double CalculateSimpleInterest(double principalAmount,double timeInYears,double rateOfInterest)
	{
		return((principalAmount*timeInYears*rateOfInterest)/100);
	}
}
