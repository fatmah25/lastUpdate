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

public class Client implements Serializable {

	
	
	private String ClientName;
	private String ClientEmail;
	
	
	
	public Client(String clientName, String clientEmail) {
		
		ClientName = clientName;
		ClientEmail = clientEmail;
	}



	public String getClientName() {
		return ClientName;
	}



	public void setClientName(String clientName) {
		ClientName = clientName;
	}



	public String getClientEmail() {
		return ClientEmail;
	}



	public void setClientEmail(String clientEmail) {
		ClientEmail = clientEmail;
	}



	@Override
	public String toString() {
		return "Client :" + "\n " +"ClientName: " +ClientName + "\n " + "ClientEmail=" + ClientEmail + " ";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end Client