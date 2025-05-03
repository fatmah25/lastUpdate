/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */

import java.io.Serializable;

	public class Node implements Serializable{

		private Client data; 
		private Node next ;
		
		
		public Node( Client obj ) {
			data = obj ;
			next = null;
		}
		
		
		
		public void setNext (Node nextptr) {
		next = nextptr;
		}
		
		
		public Node getNext () {
		return next;
		}
		
		public void setdata(Client obj ) {
		data = obj ;
		}
	
		public Client getData() {
		return data ;
		}
	

	
	
	
}//end Node