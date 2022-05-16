import java.util.*;

public class getassetdata extends dataWarehouse {
	
	Scanner scan = new Scanner(System.in);
	
	String name,location,contact_no,ownername;
	int rent,No_of_home,unique_id = 0,room;
	
	getassetdata() {
		
		System.out.println("Enter the number of rental homes do you have \n");
		
		No_of_home = scan.nextInt();
		scan.nextLine();
		unique_id = checkuniqueid(uniqueid_identification);
		
		if(unique_id==0)
		{
			unique_id=getunique_id(uniqueid_identification);
	    }
		
		for(int i=1;i<=No_of_home;++i)
		{
			System.out.println("Name and username should be same\n");
			System.out.println("Enter your Name: \n");
			
			ownername=scan.nextLine();
			
			while(!ownername.equals(uniqueid_identification))
			{
					System.out.println("Enter your name: \n");
					ownername=scan.nextLine();
					System.out.println();
				
			}

			System.out.println();
			System.out.println("Enter the name of contact person for this home : \n");
			
			
			name=scan.nextLine();
			
			System.out.println();
			System.out.println("Enter the location of the rental home "+i+" : \n");
			
			
			location=scan.nextLine();
			location=location.toLowerCase();
			
			System.out.println();
			System.out.println("Enter the number of rooms in your home "+i+" less than or equal to 4 : \n");
			
			room=scan.nextInt();
			
			while(room>4)
			{
			    System.out.println("Enter the number of room less than or equal to 4\n");
			    room=scan.nextInt();
			}
			scan.nextLine();
			
			System.out.println();
			System.out.println("Enter the rent of your home "+i+" : \n");
			
			rent=scan.nextInt();
			scan.nextLine();
			
			System.out.println();
			System.out.println("Enter the Contact No: \n");
			
			contact_no=scan.nextLine();
	        System.out.println();
	        addownerasset(new setownerasset(ownername,location,room,rent,No_of_home,contact_no,unique_id,name));
			
		}
		
	}

}
