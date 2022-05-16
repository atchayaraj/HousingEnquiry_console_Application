
public class setownerasset {
	private String ownername,Name_of_the_contact_person;
	private String location;
	private String contact_no;
	private int rent,No_of_home,room;
	private int unique_id;
	
	setownerasset(String name, String location, int room,int rent,int No_of_home,String contact_no,int unique_id,String  Name_of_the_contact_person) 
    {
		
		this.ownername = name;
		this.location = location;
		this.room = room;
		this.rent = rent;
		this.No_of_home = No_of_home;
		this.contact_no = contact_no;
		this.unique_id = unique_id;
		this.Name_of_the_contact_person = Name_of_the_contact_person;
	}
	String getownername()
	{
		return this.ownername;
	}
	String getlocation()
	{
		return this.location;
	}
	int getroom()
	{
		return this.room;
	}
	String getcontactnumber()
	{
		return this.contact_no;
	}
	int getrent()
	{
		return this.rent;
	}
	int getNo_of_home()
	{
		return this.No_of_home;
	}
	int getuniqueid()
	{
		return this.unique_id;
	}
	String getNameofthecontactperson()
	{
		return this.Name_of_the_contact_person;
	}
}
