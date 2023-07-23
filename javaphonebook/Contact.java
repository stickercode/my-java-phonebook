package javaphonebook;

//import java.io.*;

import java.io.Serializable;



public class Contact implements Comparable<Contact>, Serializable {
    private static final long serialVersionUID = 123456789L;
    
    
    
    // add instance variable declarations
	private String name;
	private String contactNumber;
	
	
	public Contact(String name, String contactNumber){
		this.name = name;
		this.contactNumber = contactNumber;
	}
	
        @Override
	public String toString(){
		return "Name: " + name + ", Contact No: " + contactNumber;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getNumber(){
		return contactNumber;
	}
        
        public void setName(String newName){
            this.name = newName;
        }
        
        public void setNumber(String newNumber){
		this.contactNumber = newNumber;
	}
        
        @Override
        public int compareTo(Contact other) {
            return this.name.compareTo(other.getName());
        }
        
}
