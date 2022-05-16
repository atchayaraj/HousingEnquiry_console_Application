import java.util.*;
public class Main {
	
		static String who;
		static Scanner scan = new Scanner(System.in);
	    
	    public static void main(String[] args)
	    {
	    	System.out.println("Welcome to our Housing Enquiry page!\n\n");
	       
	        while(true)
	        {
	            System.out.println("Enter that you're a Tenant or an Owner\n");
	            
	            who=scan.nextLine();
	            
	            if(who.equals("Owner"))
	            {
	                new user().getstatus();
	                System.out.println();
	               
	            }
	            else if(who.equals("Tenant"))
	            {
	                new user().getstatus();
	                System.out.println();
	            }
	        }
	     }
}
