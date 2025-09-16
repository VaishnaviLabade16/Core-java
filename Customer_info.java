
public class Customer_info {

	public static void main(String args[])
	{
		System.out.println("\n\n*******Non-Paramiterize constructor*********\n\n");
		
		Customer c = new Customer();
		System.out.println(c.customerId);
		System.out.println(c.name);
		System.out.println(c.email);
		System.out.println(c.phone);
		System.out.println(c.address);
		System.out.println(c.balance);
		
		
       System.out.println("\n\n*******Paramiterize constructor*********\n\n");
		
		Customer c1 = new Customer(1,"vaishnavi","vaishu@gmail.com",1234,"kiwale",120000);
		System.out.println(c1.customerId);
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.address);
		System.out.println(c1.balance);
		
		System.out.println("\n\n******Getter Setter Method********\n\n");
		
		Customer c3 =new Customer();
		
		c3.setCustomerId(21);
        System.out.println(c3.getCustomerId());
       
        c3.setName("sakshi");
        System.out.println(c3.getName());
        
        c3.setEmail("sakshi@gmail.com");
        System.out.println(c3.getEmail());
		
        c3.setPhone(111);
        System.out.println(c3.getPhone());
        
        c3.setAddress("Akurdi");
        System.out.println(c3.getAddress());
        
        c3.setBalance(2000000);
        System.out.println(c3.getBalance());
	}
}
