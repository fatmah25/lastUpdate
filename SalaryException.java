/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectf2;

/**
 *
 * @author fatmahfaisal
 */

public class SalaryException extends Exception {

public SalaryException (){

super("the salary can't be zero or less ");
}
public SalaryException (String strMessage){

super(strMessage);
}

}//end of class