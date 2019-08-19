import java.util.HashMap;

public class HashMapDemo 
{
	
    private HashMap<String,String> contacts;
    public HashMapDemo()
    {
    	this.contacts=new HashMap<String,String>();
    }
	
    public void addContact(String name,String mobNo)
    {
    	contacts.put( mobNo,name);
    }
    
    public String findContactNameByMobileNumber(String mobNo)
    {
    	String name=contacts.get(mobNo);
    	if(name==null)
    		return "number is not saved";
    	else
    		return name;
    }
    public static void main(String[] args) {
		
    	HashMapDemo contact=new HashMapDemo();
    	contact.addContact("Parth","9977060099");
    	System.out.println(contact.findContactNameByMobileNumber("9977068899"));
	}
    
}
