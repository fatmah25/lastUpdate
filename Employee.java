/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */

public abstract class Employee { 
	/////attribute 
protected String name ;
protected int id ;
protected double salary ;

public Employee (String name , int id , double salary ) {
	this.name = name ;
	this.id = id ;
	this.salary = salary ;
	
}
public abstract void position() ; ////abstract method

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "name: " + name + "  id: " + id + " salary " + salary +" "  ;
}


}