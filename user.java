import java.util.*;

public class user extends dataWarehouse implements Status{
	
    Scanner scan = new Scanner(System.in);
	
    String status;
    int flag;
    String username,password;
    String identification = Main.who;
    
    public void getstatus()
    {
        System.out.println("Enter that you're going to signup or login\n\n");
        status = scan.nextLine();
        
        if(status.equals("signup"))
        {
        	if(identification.equals("Owner"))
        	{
        		addowner(new loginsignup());
        	}
        	else if(identification.equals("Tenant"))
        	{
        		addtenant(new loginsignup());
        	}
            
        }
        
        else if(status.equals("login"))
        {
        	login();
        }
    }
    
    public void login() {
    	
    	String owneranswer,tenantanswer;
    	System.out.println("Enter the username: ");
        username=scan.nextLine();
        System.out.println();
        
        System.out.println("Enter the password: \n");
   
        password = scan.next();
        scan.nextLine();
        
        flag=checkusercredentials(username,password);
        
        if(flag==1)
        {
            System.out.println("Dear "+username+"! you logged in successfully\n\n");
            
            if(identification.equals("Owner"))
        	{
            	System.out.println("Do you want to add you rental home's details");
                System.out.println("Enter yes or no\n");
                
                owneranswer=scan.nextLine();
                System.out.println();
                
                if(owneranswer.equals("yes"))
                {
                	new getassetdata();
                	showownerassetdata(username);
                }
                else if(owneranswer.equals("no"))
                {
                	
                	showownerassetdata(username);
                }
        	}
            
        	else if(identification.equals("Tenant"))
        	{
        		System.out.println("Do you want to search for rental house details");
                System.out.println("Enter yes or no\n");
                
                tenantanswer=scan.nextLine();
                System.out.println();
                
                if(tenantanswer.equals("yes"))
                {
                	showdatafortenant();
                }
        	}
        }
        
        else
        {
            System.out.println("Invalid username or password\n");
            
        }
    }

}
