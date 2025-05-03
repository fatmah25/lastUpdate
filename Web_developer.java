/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */

public class Web_developer extends Developer  {

public String PlatformType;		
public double WebPerformanceScore;
public boolean DarkModeSupport ;

public Web_developer(String name, int id, double salary, int dRank, String platformType, double webPerformanceScore, boolean darkModeSupport) {
	super(name, id, salary, dRank);
	PlatformType = platformType;
	WebPerformanceScore = webPerformanceScore;
	DarkModeSupport = darkModeSupport;
}

//Copy Constructor
public Web_developer (Web_developer WebDev) {

	super(WebDev.getName(), WebDev.getId(), WebDev.getSalary(),  WebDev.dRank);
	  this.PlatformType = WebDev.PlatformType;
	  this.WebPerformanceScore = WebDev.WebPerformanceScore;
      this.DarkModeSupport = WebDev.DarkModeSupport;	
}



// sub method
public void platformType(String P) {
	
	
	if(P.equals("I")) 
	System.out.println("\n IOS Platform is Supported !");

	else	
	if(P.equals("W")) 
	System.out.println("\n Windows Platform is Supported !");

	else 
		System.out.println("\n invaild platform !! !"); 

	
}

public String getPerformanceReport() {
    if (WebPerformanceScore >= 90) {
        return "\n Excellent Performance! the website is running optimally.";
    } else if (WebPerformanceScore >= 70) {
        return "\n Good Performance. Some optimizations may be needed.";
    } else if (WebPerformanceScore >= 50) {
        return "\n Average Performance. Consider improving speed and optimizations.";
    } else {
        return "\n Poor Performance! Critical optimizations are required. \n";
    }
}	


public String isDarkModeSupported() {
    if (DarkModeSupport) {
        return " \n Dark Mode is SUPPORTED ";
    } else {
        return " \n Dark Mode is NOT supported ";
    }
}

@Override
public String toString() {
	return "Web Developer " +"\n"+ super.toString() + " PlatformType: " + PlatformType + " WebPerformanceScore: " + WebPerformanceScore
			+ " DarkModeSupport: " + DarkModeSupport  ;
}

String getPlatformType() {
	return PlatformType;
}

void setPlatformType(String platformType) {
	PlatformType = platformType;
}

double getWebPerformanceScore() {
	return WebPerformanceScore;
}

void setWebPerformanceScore(double webPerformanceScore) {
	WebPerformanceScore = webPerformanceScore;
}

boolean isDarkModeSupport() {
	return DarkModeSupport;
}

void setDarkModeSupport(boolean darkModeSupport) {
	DarkModeSupport = darkModeSupport;
}
	

}