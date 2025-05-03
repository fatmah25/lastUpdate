/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */
import java.util.*;
import java.io.File;
public class MainClass {


	static Scanner scanner = new Scanner (System.in);
	static Company company = new Company ( "TechNova " , "Riyadh" );
	
        
        
	public static void main(String[] args) {
		
		
		
	File f = new File("Clients.dat");
	File f2 = new File("Employees.dat");
        if( f.exists() && f2.exists() ){
        company.readAllData();
         }
		
        else{
		//Employee E1 = new Manager ("Amal", 1, 9000 , 3, 10);
		//Employee E2 = new Applications_developer("Fatmah", 2 , 70000 , 9 , "I", "high");
		//Employee E3 = new Web_developer("Sarah", 3 , 9999  , 20 , "W", 70 , true);
              // Client CC = new Client("nora","nnor3");
		
	//	company.addEmployee(E1);
		//company.addEmployee(E2);
		//company.addEmployee(E3);
             //   company.addClient(CC);
	}//end else

		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                
                 Frame1 frame = new Frame1() ;
                 frame.setVisible(true);
                 
                
                //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2
		int choice;
	      do {
	          System.out.println("\n--- Main Menu ---");
	          System.out.println("1. Employee Management");
	          System.out.println("2. Client Management");
	          System.out.println("3. Company Information");
	          System.out.println("4. Exit");
	          System.out.print("Enter your choice: ");
	          choice = scanner.nextInt();
	          scanner.nextLine(); // Consume newline

	          switch (choice) {
	              case 1:
	                  employeeMenu();
	                  break;
	              case 2:
	                  clientMenu();
	                  break;
	              case 3:
	                  displayCompanyInfo();
	                  break;
	              case 4:
	                  System.out.println("Exiting...");
	                  break;
	              default:
	                  System.out.println("Invalid choice! Please try again.");
	          }
	      } while (choice != 4);
	  }

	  // Employee Management Menu
	  public static void employeeMenu() {
	      int choice;
	      do {
	          System.out.println("\n--- Employee Management ---");
	          System.out.println("1. Add Employee");
	          System.out.println("2. Remove Employee");
	          System.out.println("3. Find Employee");
	          System.out.println("4. View All Employees");
	          System.out.println("5. Back to Main Menu");
	          System.out.print("Enter your choice: ");
	          choice = scanner.nextInt();
	          scanner.nextLine();

	          switch (choice) {
	              case 1:
	                  addEmployee();
	                  break;
	              case 2:
	                  removeEmployee(); //done
	                  break;
	              case 3:
	            	  display1EmployeeInfo(); 
	                  break;
	              case 4:
	                  viewAllEmployees();
	                  break;
	              case 5:
	                  System.out.println("Returning to Main Menu...");
	                  break;
	              default:
	                  System.out.println("Invalid choice! Please try again.");
	          }
	      } while (choice != 5);
	  }

	  // Client Management Menu
	  public static void clientMenu() {
	      int choice;
	      do {
	          System.out.println("\n--- Client Management ---");
	          System.out.println("1. Add Client");
	          System.out.println("2. Remove Client");
	          System.out.println("3. Find Client");
	          System.out.println("4. View All Clients");
	          System.out.println("5. Back to Main Menu");
	          System.out.print("Enter your choice: ");
	          choice = scanner.nextInt();
	          scanner.nextLine();

	          switch (choice) {
	              case 1:
	                  addClient();
	                  break;
	              case 2:
	         
    System.out.print("Enter Client Email to remove: ");
    String email = scanner.nextLine();
    removeClient(email);
   
	                  break;
	              case 3:
	            	  display1ClientInfo();
	                  break;
	              case 4:
	                  viewAllClients();
	                  break;
	              case 5:
	                  System.out.println("Returning to Main Menu...");
	                  break;
	              default:
	                  System.out.println("Invalid choice! Please try again.");
	          }
	      } while (choice != 5);
	  }

	  // Display Company Information
	  public static void displayCompanyInfo() {
	      System.out.println("\n--- Company Information ---");
	      System.out.println(company);
	  }

	  // Methods for Employee Operations
	  public static void addEmployee() {
	      System.out.println("\nSelect Employee Type:");
	      System.out.println("1. Manager");
	      System.out.println("2. Developer");
	      System.out.print("Enter choice: ");
	      int type = scanner.nextInt();
	      scanner.nextLine(); //newline

	      System.out.print("Enter Name: ");
	      String name = scanner.nextLine();
	      System.out.print("Enter ID: ");
	      int id = scanner.nextInt();
	    
	      //نتحقق من الايدي اذا كان مضاف من قبل ام لا
		
		while(company.findEmployee(id)!= null) {
		System.out.print("the empolyee is already exsists ");
	    System.out.print("Enter ID: ");
		id = scanner.nextInt(); 
		scanner.nextLine();} 
		double salary;
	      while(true){
	      try{
	      System.out.print("Enter Salary: ");
	       salary = scanner.nextDouble();
	      scanner.nextLine();
		      
             if(salary<=0){
             throw new SalaryException();
	     }
		break;      
	      }     
             catch(SalaryException e ){
             System.out.println(e.toString());	
	     scanner.next();   
              }
             catch(Exception e ){
             System.out.println(e.toString());	
	     scanner.next();   
		     
              }
	      }//end while
              //////   
              Employee newEmployee = null;
              ///////
	      switch (type) {
	          case 1: // Manager
			      try{
	              System.out.print("Enter Project Count: ");
	              int projectCount = scanner.nextInt();
	              System.out.print("Enter Team Size: ");
	              int teamSize = scanner.nextInt();
	              scanner.nextLine();
	              newEmployee = new Manager(name, id, salary, projectCount, teamSize); //poly
	              break;}
			     catch(InputMismatchException e) {
                           System.out.println("Incorrect input type. Manager not added.");
                           return;  // إضافة return لإيقاف التنفيذ هذا من تشات
                            } 
	          case 2: // Developer
	            
	              System.out.print("Enter Developer Rank: ");
	              int rank = scanner.nextInt();
	              
	              System.out.println("Is this an Application Developer or Web Developer?");
	              System.out.println("1. Application Developer");
	              System.out.println("2. Web Developer");
	              int devType = scanner.nextInt();
	              scanner.nextLine();

	              if (devType == 1) {
	                  System.out.println("Enter Platform Type I/W : ");
	                  System.out.println("1- IOS");
	                  System.out.println  ("2- Windows");

	                  String platformType = scanner.nextLine();
	                                 
	                  /////////
	                  
	                  System.out.print("Enter Security Level: ");
	                  System.out.println ("1- high");
	                  System.out.println ("2- medium");
	                  System.out.println ("3= low");
	                  
	                  String securityLevel = scanner.nextLine();
	                  newEmployee = new Applications_developer(name, id, salary, rank, platformType, securityLevel);
	                  ((Applications_developer) newEmployee).platformType(platformType);
	                  ((Applications_developer) newEmployee).checkSecurityLevel();
		              ((Developer)newEmployee).DeveloperRank(rank);

	                  
	              } else {
	                  System.out.println("Enter Platform Type I/W : ");
	                  System.out.println ("1- IOS");
	                  System.out.println  ("2- Windows");
	                  String platformType = scanner.nextLine();
	                  ///////////
	                  
	                  System.out.print("Enter Web Performance Score: ");
	                  double webPerformanceScore = scanner.nextDouble();
	                  System.out.print("Supports Dark Mode (true/false): ");
	                  boolean darkModeSupport = scanner.nextBoolean();
	                  scanner.nextLine();
	                  newEmployee = new Web_developer(name, id, salary, rank, platformType, webPerformanceScore, darkModeSupport);
	                  ((Web_developer) newEmployee).platformType(platformType);
	                  System.out.print("\n" + ((Web_developer) newEmployee).getPerformanceReport() );
	                  System.out.print("\n" + ((Web_developer) newEmployee).isDarkModeSupported() );
		              ((Developer)newEmployee).DeveloperRank(rank);


	              }
	              break;
	          default:
	              System.out.println("Invalid type selected!");
	              return;
	      }

	      company.addEmployee(newEmployee);
	      System.out.println("Employee added successfully!");
	  }

	  public static void removeEmployee() {
	      System.out.print("Enter Employee ID to remove: ");
	      int id = scanner.nextInt();
	      scanner.nextLine();

	      company.removeEmployee(id);
	  }
	  

	  public static void display1EmployeeInfo() {
	      System.out.print("Enter Employee ID to find: ");
	      int id = scanner.nextInt();
	      scanner.nextLine();

	      Employee emp = company.findEmployee(id);
	      if (emp != null) {
	          System.out.println("Employee Found: " + emp);
	          emp.position();
	      } else {
	          System.out.println("Employee not found.");
	      }
	  }	

		  public static void viewAllEmployees() {
		        System.out.println(" List of Employees ");
		          for (int i = 0; i < company.noE ; i++) {
	                  System.out.println(company.employeesList[i].toString());
	         
		          }
	  }
       
                  
	  // Methods for Client Operations
	  public static void addClient() {
              
	      System.out.println("Enter Client Name: ");
	      String name = scanner.nextLine();
	      System.out.println("Enter Client Email: ");
	      String email = scanner.nextLine();

	      Client newClient = new Client(name, email);
	      company.addClient(newClient);
	      System.out.println("Client added successfully!");
              }             
             
              
  
          
	//  public static void removeClient() {
	 //     System.out.println("Enter Client Email to remove: ");
	 //     String email = scanner.nextLine();

	  //    company.removeClient(email);}
          
          public static void removeClient(String email) {
    if (email != null && !email.trim().isEmpty()) {
        company.removeClient(email.trim());
        System.out.println("Client with email " + email + " has been removed successfully.");
    } else {
        System.out.println("Error: Email cannot be empty.");
    }
}

          
          
	  public static void display1ClientInfo() {
	      System.out.println("Enter Client Email to find: ");
	      String email = scanner.nextLine();

	      Client client = company.findClient(email);
	      if (client != null) {
	          System.out.println( client);
	      } else {
	          System.out.println("Client not found.");
	      }
	  }

	  public static void viewAllClients() {
		   System.out.println(" List of Clients ");
                   Node current = company.headClient;
while (current != null) {
    System.out.println(current.getData().toString());
    current = current.getNext();
}
	       for (int i = 0; i < company.CountClient (); i++) {
	        System.out.println(company.clientsList[i].toString());
	        }	      
		
	company.saveAllInfo();	
          }		
	
 
}//end Class