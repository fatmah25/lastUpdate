/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */

public class Applications_developer extends Developer {

	//System.out.println("");
	public String PlatformType;
	public String SecurityLevel;
	

	public Applications_developer(String name, int id, double salary, int dRank, String platformType, String securityLevel) {
		super(name, id , salary ,dRank);
		PlatformType = platformType;
		SecurityLevel = securityLevel;
		
			}



	// Copy Constructor
    public Applications_developer(Applications_developer AppDev) {

    	
    	super(AppDev.getName(), AppDev.getId(), AppDev.getSalary(), AppDev.dRank  );

        this.PlatformType = AppDev.PlatformType;
        this.SecurityLevel = AppDev.SecurityLevel;
            }

//sub method
	public void checkSecurityLevel() {
	    switch (SecurityLevel.toLowerCase()) {
	        case "high":
	            System.out.println("\n the program is well-protected.");
	            break;
	        case "medium":
	            System.out.println("\n the program has restricted access.");
	            break;
	        case "low":
	            System.out.println("\n the program is exposed. Consider improving security!");
	            break;
	        default:
	            System.out.println("\n the Unknown security level. Please verify.");
	    }
	}

//sub method
	public void platformType(String P) {
		
	if(P.equals("I")) 
	System.out.println("\n IOS Platform is Supported !");

	else	
	if(P.equals("W")) 
	System.out.println("\n Windows Platform is Supported !");

	else 
		System.out.println("\n invaild platform !! !"); 

		
	}



	@Override
	public String toString() {
		return "Applications developer " +"\n"+ super.toString() +  "\nPlatformType : " + PlatformType + "\nSecurityLevel : " + SecurityLevel  ;
	}



	String getPlatformType() {
		return PlatformType;
	}



	void setPlatformType(String platformType) {
		PlatformType = platformType;
	}



	String getSecurityLevel() {
		return SecurityLevel;
	}



	void setSecurityLevel(String securityLevel) {
		SecurityLevel = securityLevel;
	}



	










}