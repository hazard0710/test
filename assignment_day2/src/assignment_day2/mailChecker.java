package assignment_day2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class mailChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the email");
		String email=sc.nextLine();
		
		
        if (isValid(email)) 
            System.out.print("Given input is a valid email input"); 
        else
            System.out.print("Given input is an invalid email input"); 

	}
	
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern p= Pattern.compile(emailRegex); 
        if (p.matcher(email).matches()) 
            return true;
        else
        	return false;
               
        
    } 
}
