package BatchTesting;
import org.testng.annotations.*;
public class LoginTest 
{
	@Test
	public void LoginByMobileNumber()
	{
		System.out.println("Successfully login by mobile number");
	}
	
	@Test
	public void LoginByEmail()
	{
		System.out.println("Succesful ligin by email");
	}

}
