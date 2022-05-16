import java.util.*;

public class loginsignup {
	
	private String name;
    private String username;
    private int age;
    private String DOB;
    private String address;
    private String password;
    private String Contact_no;
    
    Scanner scan = new Scanner(System.in);
    
    loginsignup() {
        
        System.out.println("Enter the name: ");
        name=scan.nextLine();
        System.out.println();
        
        System.out.println("Enter the Date of Birth in the Format DD/MM/YYYY: ");
        DOB=scan.nextLine();
        System.out.println();
        
        System.out.println("Enter the age and it should be within the range 13 - 80 : ");
        age=scan.nextInt();
        
        while(age<=13 || age>=80)
        {
            System.out.println("Enter the age and it should be within the range 13 - 80 : ");
            age=scan.nextInt();
        }
        scan.nextLine();
        
        System.out.println();
        System.out.println("Enter the Address: ");
        address=scan.nextLine();
        System.out.println();
        
        System.out.println("Enter the Contact No: ");
        Contact_no=scan.nextLine();
        System.out.println();
        
        int len=1;
        
        while(len<8)
        {
        	System.out.println("Create a New password: ");
        	System.out.println("It should contain 8 characters or above: ");
        	password=scan.next();
        	len=password.length();
        }
        scan.nextLine();
        
        System.out.println();
        System.out.println("You signed-up successfully\n");
        
        System.out.println("Your username is "+name+"\n");
    }
    
    String getusername() 
    {
    	return this.username;
    }
    
    String getname()
    {
        return this.name;
    }
    
    String getpassword()
    {
        return this.password;
    }

}
