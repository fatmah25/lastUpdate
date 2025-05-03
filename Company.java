/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */

import java.io.*;

public class Company  {
	

	
	
	
	protected String companyName;
	protected String location;
	protected Employee[] employeesList;
	protected Client[] clientsList; 
	protected int noE;
         protected int noC;
        public Node headClient;
        public int maxC = 200;

    
    
    
    
    
    
    
	public Company( String name , String loc  ){
    noE = 0 ;
	companyName=name;
	location=loc;
	headClient = null;
	employeesList =new Employee[50];

	//clientsList =new Client[200];

	}//end constructor

	
	public int CountClient () {
		if( headClient == null )
		return 0 ;
		
		int count = 0 ;
		Node current = headClient ;
		while (current != null ) {
		count++ ;
		current = current.getNext () ;
		}
		return count ;
	}
	

	
	
	
	
	public boolean addClient( Client c){

	if( CountClient() < maxC)
	{
		Node n= new Node(c) ;
		n.setNext(headClient) ;
		headClient = n ;
		return true;
	}

	else return false;


	}//end method addClient



	public boolean addEmployee( Employee e){

	   if( noE < employeesList.length ){
		   
	      	if(e instanceof Manager ){
	      		employeesList[noE++]  = new Manager ((Manager)e); //Composition
	 //Composition
	   }
	      	
	      	if(e instanceof Applications_developer ){
	 		employeesList[noE++]  = new Applications_developer ((Applications_developer)e); //Composition
	   } 	
	      	
	     
	      	if(e instanceof Web_developer ){
	 		employeesList[noE++]  = new Web_developer ((Web_developer)e);} //Composition
	   
	      	return true; 	
	      	
	   }//end if (size of Array

	   else return false;

	   }//end method addEmployee
		
	public  Client findClient(String email) {
		
		if ( headClient == null)
			return null ;
		
		Node current = headClient;

		while(current != null ){
			
			if( current.getData().getClientEmail().equals(email) ) //find node 
			{
			return current.getData() ; }
			
			else {
			current = current.getNext() ;
			}
				}//end while loop
				
			 return null; //if not found  
				
		}// end method findClient
		
		
	public Employee findEmployee(int id) {
	    for (int i = 0; i < noE; i++) {
	        if ( employeesList[i].getId() == id) {
	        	return employeesList[i];
	        }
	    }
	    return null;
	}


	
	
	
	
	public boolean removeClient(String email) {
		
		if( headClient == null)
		return false;
		
		if (headClient.getData().getClientEmail().equals(email) ) {
		headClient = headClient.getNext();
		return true ;
		}
		
		
		Node priv = headClient ;
		Node current = headClient.getNext() ;
		
		
		while(current != null ){
			
		if( current.getData().getClientEmail().equals(email) ) //find node want to remove
		{
		priv.setNext( current.getNext()); //next of priv is next of current (chang prive next not prive index)
		return true ; }
		
		else {
		priv = priv.getNext() ;
		current = current.getNext() ;
		}
		}
		return false ;
		
	}// end method removeClient
		
	
	
	
		                     
		public boolean removeEmployee (int id) {
			
			Employee Remployee = findEmployee(id);
			
			if(  Remployee != null)
			{ int index = -1;
			
		    for (int i = 0; i < noE; i++) {
		        if (employeesList[i] == Remployee) { //find Client index
		            index = i;
		            break;
		        }
		    }//end for

		    if (index != -1) { 
		    	employeesList[index] = employeesList[--noE]; 
		    	employeesList[noE] = null; 
		    	  System.out.print("Employee removed ");

		        return true;
		    }//replace remove if index found	
			
			}//end if found
			
			
			
			else //Remployee = null - not found
				System.out.print("Employee not found ");
			return false;
			
		}// end method removeEmployee

		
		
		 public String toString() {
		        String str = "Company name: " + companyName + "\nLocation: " + location +
		                "\nNumber of employees: " + noE + "\nNumber of clients: " + CountClient();

				Node current = headClient;

		        // Display client information
		        for (int i = 0; i < CountClient(); i++) {
		            str += ((Client)(current.getData())).toString() + "\n";
		        }

		        
		        // Display employee information
		        for (int i = 0; i < noE; i++) {
		            str += employeesList[i].toString() + "\n";
		        }

		        return str;
		 }
		//end toString
		
		 
		 
		 
		 
		 public void saveAllInfo() {
		 try {
		 File out = new File ("Cliens.dat") ;
		 FileOutputStream fos = new FileOutputStream (out) ;
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 oos.writeObject( headClient ) ; // write list all at once
		 oos. close () ;
		 
		 File out2 = new File ("Employees.dat") ;
		 FileOutputStream fos2 = new FileOutputStream (out2) ;
		 ObjectOutputStream oos2 = new 		 ObjectOutputStream (fos2);
		 oos2.writeObject ( employeesList ) ; // write array all at once 
		 oos2.close ();
		 }catch ( IOException e) {
		 System.out. println (e.toString()) ;
}
		 }//end savaAllInfo()
		 
		 
		 
		 
		 
		 public void readAllData(){
			 try{
			 File f = new File("Cliens.dat"); //////////////////////
			 FileInputStream ff = new FileInputStream( f);
			 ObjectInputStream in= new ObjectInputStream(ff) ;
			 headClient = (Node ) in.readObject();
			 in.close() ;
			 
			 
			 File f2 = new File("Reservations.dat");
			 FileInputStream ff2 = new FileInputStream( f2);
			 ObjectInputStream in2= new ObjectInputStream(ff2) ;
			 noE = in2.readInt() ;
			 employeesList = (Employee[]) in2.readObject();
			 in2.close() ;
			 
			  
			 ///GUI//////////////////////////////////////////////////JOptionPane.showMessageDialog(null , "All data in files are Saved.");
			 } catch( ClassNotFoundException e) {
				 System.out.println(e.toString()); }
			 
			 catch( IOException e){
				 System.out.println(e.toString());
			 }
			 }//end readAllData()
		 
		 
		 
		 
		 
		 
		 //setters&getters
		public String getCompanyName() {
			return companyName;
		}



		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}



		public String getLocation() {
			return location;
		}



		public void setLocation(String location) {
			this.location = location;
		}
		

	
	
	
	
	

}//end company