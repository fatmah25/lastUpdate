/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */


public class Manager extends Employee {

	private int projectCount;  //// count how many project they manage
	private int teamSize ;  ////// number of employee under them
	
	
public Manager (String name, int id, double salary , int projectCount , int teamSize) {
		super(name, id, salary);
		this.projectCount = projectCount ;
		this.teamSize = teamSize ;
		// constructor
	}
public Manager(Manager manager) {
    super(manager.getName(), manager.getId(), manager.getSalary());  // Copy the name, id, and salary using getters
    this.projectCount = manager.getProjectCount();  // Copy the projectCount
    this.teamSize = manager.getTeamSize();          // Copy the teamSize 
}


@Override
public void position() {
	
	System.out.println (" \' Manager \' ");
}
//getter and settter
int getProjectCount() {
	return projectCount;
}

void setProjectCount(int projectCount) {
	this.projectCount = projectCount;
}

int getTeamSize() {
	return teamSize;
}

void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}

@Override
public String toString() {
	return " Manager " +"\n"+ super.toString() + "  projectCount: " + projectCount +"  teamSize: " + teamSize ;
}

}