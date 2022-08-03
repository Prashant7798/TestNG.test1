package DemoTest.Test1;
import org.testng.ITestContext;
import org.testng.annotations.*;
public class InvocationCountDemo 
{
	@Test(invocationCount=5)
	public void testmethodOne(ITestContext context) {
		int current=context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing:" + current);
		System.out.println("Test method 1......");
	}
	@Test(invocationCount=2)
	public void testmethodTwo(ITestContext context)
	{
		int current=context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing:" + current);
		System.out.println("Test method 2......");
	}

}
