package com.training.array;

import java.util.Scanner;


public class Registration {

public static void main(String[] args) {

	 methodOne();
		
	
}
    
    static void methodOne() { 
      
        String[] usernames = { "samyuktha", "saideep", "kyathi", "bunny" }; 
        
       
        System.out.println("Enter name to register");
        Scanner sc=new Scanner(System.in);
        String searching =sc.next();; 
        
        // initialize boolean variable 
        boolean isExists = false; 
        
        // iterate 
        for (int i = 0; i < usernames.length; i++) { 
         
          String arrayValue = usernames[i]; 
          if (searching.equals(arrayValue)) { 
            isExists = true; 
            break; 
          } 
          
        } 
        
        if (isExists) { 
          System.out.println("You are Registered"); 
        } 
        else { 
          System.out.println("Name is not unique"); 
        } 
    
  sc.close();
  }

}


