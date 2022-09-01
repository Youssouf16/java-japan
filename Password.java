package question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Password {
	 
	  @SuppressWarnings("null")
	public static void main(String[] args) {
	        String password = null;
	        int valid = 0;
	        int count = 0;
	        int lower=0;
	        int integer=0;
	        Scanner sc= new Scanner(System.in);	 
	  
			
	
	        
	        while(valid == 0) {
	        	 System.out.println(" enter a password");
	        	password = sc.nextLine();
	        	 for(int i=0;i<password.length();i++) {
					 if(Character.isUpperCase(password.charAt(i))) {
						 count++;
						  }
					 
				 }
	        	 
	        	 for (char dig : password.toCharArray())
	             {
	                 
	                 if (Character.isDigit(dig)) 
	                 {
	                     integer++;
	                 }


	        	 
				 for(int i=0;i<password.length();i++) {
					 if(Character.isLowerCase(password.charAt(i))) {
						 lower++;}
				 }
	        	 if(password.length()<6) {
	        		 System.out.println(" enter a password with atleast 6 characters");
	        		 valid=0;
	        	 }		 
	 	        }
	        	 
	        	 Pattern p = Pattern.compile("[$#@]");
	    	     Matcher m = p.matcher(password);
	    	    // boolean b = m.matches();
	    	     boolean b = m.find();
	        	 
	        	  if(password.length()>12) {
	        		 System.out.println(" enter a password with max 12 characters");
	        	 }
	        	 else if(count == 0)  {
	        		 System.out.println(" enter a password with at least one capital letter");
		        	 
	        	 }   
	        	 else if(lower == 0)  {
	        		 System.out.println(" enter a password with at least one lower case letter");   		 
	        			        	
	        	 }
	        	 else if(integer == 0)  {
	        		 System.out.println(" enter a password with at least one numerical number");
	        	 }
	        	 else if(b == false)  {
	        		 System.out.println(" enter a password with at least one special character from these $#@");
	        	 }
	        	 else {
	        		 System.out.println("This password is valid");
	        		 valid++;
	        		 
	        	 }
	        	    
	       
}
}
}
				