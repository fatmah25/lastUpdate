/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */
                         
public class Developer extends Employee {
protected int dRank ;


public Developer(String name, int id, double salary,  int dRank) {
	super(name, id, salary);
	this.dRank = dRank;
	
}

//Copy Constructor
public Developer(Developer developer) {
    super(developer.getName(), developer.getId(), developer.getSalary());
    this.dRank = developer.dRank;
	

}


public void position() {
	System.out.println (" \' Developer\' ");
}



public void DeveloperRank(int ex) {
    
    if (ex > 10) {
        System.out.println("\n Your Rank is Senior Developer");
    }
    else if (ex >= 5) {
        System.out.println("\n Your Rank is Mid-Level Developer");
    }
    else {
        System.out.println("\n Your Rank is Junior Developer");
    }
}

int getRank() {
	return dRank;
}

void setdRank(int dRank) {
	this.dRank = dRank;
}

@Override
public String toString() {
	return "Developer "+"\n"+super.toString() + " Rank :" + dRank;
} 	
	
	



}