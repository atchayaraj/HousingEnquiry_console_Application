import java.util.*;

public class dataWarehouse {
	
	private static ArrayList<loginsignup> list = new ArrayList<loginsignup> ();
    private static ArrayList<loginsignup> list1 = new ArrayList<loginsignup> ();
    private static ArrayList<setownerasset> list2 = new ArrayList<setownerasset>();
    static String identification,uniqueid_identification;
    static int incrementor=0;
    
    Scanner scan = new Scanner(System.in);
    
    static void addowner(loginsignup data)
    {
        list.add(data);
    }
    
    static void addtenant(loginsignup data)
    {
        list1.add(data);
    }
    
    static void addownerasset(setownerasset data)
    {
    	  list2.add(data);
    }
    
    void showownerassetdata(String username) 
    {
    	
    	for(setownerasset show : dataWarehouse.list2)
    	{
 
    		if(username.equals(show.getownername()))
    		{
    			System.out.println("Name                                : "+show.getownername());
    		    System.out.println("Location of the Rental home         : "+show.getlocation());
    		    System.out.println("Number of rooms in that Home        : "+show.getroom());
    		    System.out.println("Rent for that Home                  : "+show.getrent());
    		    System.out.println("Number of Homes that you've entered : "+show.getNo_of_home());
    		    System.out.println("Name of the contact person          : "+show.getNameofthecontactperson());
    		    System.out.println("Contact number                      : "+show.getcontactnumber());
    		    System.out.println("unquie_id                           : "+show.getuniqueid()+"\n\n");
    		}
    	}
    	
    }
    
    int getunique_id(String username) {
    	
    	for(loginsignup run:dataWarehouse.list)
    	{
    		
    	    if(username.equals(run.getname()))
    	    {
    	    	return (list.size()+ incrementor++);
    	    }
    	}
    	return 0;
    }
    int checkuniqueid(String username)
    {
    	for(setownerasset show:dataWarehouse.list2)
    	{
    		
    		if(username.equals(show.getownername()))
    		{
    			System.out.println("checking Unique id"+show.getuniqueid()+"\n");
    			return show.getuniqueid();
    		}
    	}
    	return 0;
    	
    }
    
    void showdatafortenant()
    {
    	int rent,flag=0;
    	String location,tenantanswer;
    	boolean cur_status=true;
    	
    	while(cur_status)
    		{
    			System.out.println("Enter the prefered location or if you don't want to enter, just enter no\n\n");
    			location=scan.nextLine();
    			location=location.toLowerCase();
    			
    			System.out.println("Enter the rent amount that you want to search or if you don't want to enter, just enter \"0\"\n\n");
    			rent=scan.nextInt();
    			scan.nextLine();
    			
    			for(setownerasset show : dataWarehouse.list2)
    	    	{
    				if(location.equals(show.getlocation()) && rent==0)
    			    {
    					flag=1;
    					System.out.println("Location of that Rental home             :"+show.getlocation());
    	    		    System.out.println("Number of rooms in that Home             :"+show.getroom());
    	    		    System.out.println("Rent for that Home                       :"+show.getrent());
    	    		    System.out.println("Owner Name                               :"+show.getownername());
    	    		    System.out.println("Name of the Contact person for that home :"+show.getNameofthecontactperson());
    	    		    System.out.println("Contact number                           :"+show.getcontactnumber()+"\n\n");
    			    }
    				else if(rent>=show.getrent() && location.equals("no"))
    				{
    					flag=1;
    					System.out.println("Location of that Rental home             :"+show.getlocation());
    	    		    System.out.println("Number of rooms in that Home             :"+show.getroom());
    	    		    System.out.println("Rent for that Home                       :"+show.getrent());
    	    		    System.out.println("Owner Name                               :"+show.getownername());
    	    		    System.out.println("Name of the Contact person for that home :"+show.getNameofthecontactperson());
    	    		    System.out.println("Contact number                           :"+show.getcontactnumber()+"\n\n");
    				}
    				
    				else if(rent>=show.getrent())
    				{
    					if(location.equals(show.getlocation()))
    					{
    						flag=1;
        					System.out.println("Location of that Rental home             :"+show.getlocation());
        	    		    System.out.println("Number of rooms in that Home             :"+show.getroom());
        	    		    System.out.println("Rent for that Home                       :"+show.getrent());
        	    		    System.out.println("Owner Name                               :"+show.getownername());
        	    		    System.out.println("Name of the Contact person for that home :"+show.getNameofthecontactperson());
        	    		    System.out.println("Contact number                           :"+show.getcontactnumber()+"\n\n");
    					}
    					
    				}
    				
    				else if(location.equals("no") && rent==0)
    				{
    					flag=1;
    					System.out.println("Location of that Rental home             :"+show.getlocation());
    	    		    System.out.println("Number of rooms in that Home             :"+show.getroom());
    	    		    System.out.println("Rent for that Home                       :"+show.getrent());
    	    		    System.out.println("Owner Name                               :"+show.getownername());
    	    		    System.out.println("Name of the Contact person for that home :"+show.getNameofthecontactperson());
    	    		    System.out.println("Contact number                           :"+show.getcontactnumber()+"\n\n");
    				}
    		     }
    			
    			if(flag==0)
    			{
    				System.out.println("No Results found\n\n");
				}
				  
    			flag=0;
    		    System.out.println("Do you want to continue this search ?\nEnter yes or no\n\n");
    		    tenantanswer=scan.nextLine();
    			  
    			if(tenantanswer.equals("yes"))
    			{
    				cur_status=true;
    			}
    			
    			else if(tenantanswer.equals("no"))
    			{
    				cur_status=false;
    			}
    	   }
    }
    
    static int checkusercredentials(String username, String password) {
    	
    	identification=(Main.who);
 
    	if(identification.equals("Owner"))
    	{
    		for(loginsignup checking : dataWarehouse.list){
                
                if(username.equals(checking.getname()) && password.equals(checking.getpassword()))
                {
                    uniqueid_identification=checking.getname();
                    return 1;
                }
                
            }
    		return 0;
            
    	}
    	  
    	else if(identification.equals("Tenant"))
    	{
    		for(loginsignup checking : dataWarehouse.list1){
                
                if(username.equals(checking.getname()) && password.equals(checking.getpassword()))
                {
                    return 1;
                }
            }
    	}
    	return 0;
     }
}
