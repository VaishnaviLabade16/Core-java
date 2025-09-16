
public class Customer {

	public int customerId;
	public String name;
	public String email;
	public int phone;
	public String address;
	public int balance;
	
	public Customer()
	{
		customerId=123;
		name="karina";
		email="karina@gmail.com";
		phone=1234567890;
		address="pune";
		balance=20000;
	}
	public Customer(int customerId,String name,String email,int phone,String address,int balance)
	{
		this.customerId=customerId;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.address=address;
		this.balance=balance;
	}
	
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;		
	}
	
	public int getPhone()
	{
		return phone;
	}
	public void setPhone(int phone)
	{
		this.phone=phone;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
				;
	}
	
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
				;
	}
}
