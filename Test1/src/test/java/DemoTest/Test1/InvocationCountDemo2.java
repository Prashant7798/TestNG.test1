package DemoTest.Test1;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCountDemo2 
{
	@Test(invocationCount=2)
	public void TEST1(ITestContext context)
	{
		int current=context.getAllTestMethods()[0].getCurrentInvocationCount();
				System.out.println("executing:" + current);
		System.out.println("Test 1 Method..");
	}
	
	@Test(invocationCount=4)
	public void TEST2(ITestContext context)
	{
		int current=context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Execution:" + current);
		System.out.println("Test 2 Method..");
	}

}
