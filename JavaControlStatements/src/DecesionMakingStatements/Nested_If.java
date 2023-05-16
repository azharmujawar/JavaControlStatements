package DecesionMakingStatements;

public class Nested_If {

	public static void main(String[] args) {
		
		
		String address="Delhi, India";
		
		
		if(address.endsWith("India"))
		{
			if (address.contains("Meerut"))
			{
				System.out.println("your city is Merut");
			} else if(address.contains("Noida"))
			{
				System.out.println("your city is Noida");
			}else 
				
			{
				System.out.println(address.split(",")[1]);
			}
			
			
		}
		else
		{
			System.out.println("Your living in India");	
		}

	}

}
