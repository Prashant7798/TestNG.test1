package BatchTesting;
import org.testng.annotations.*;
public class HomeScreenTest 

{
	//launch application
	//verify Titel
	//VrifyLogo
	
	@Test
	public void LaunchAppkication()
	{
		System.out.println("Application launched");
	}
	
	@Test
	public void VerifyTitle()
	{
		System.out.println("Verifying Title");
	}
	
	@Test
	public void VerifyLogo()
	{
		System.out.println("Verifying Logo");
	}

}
