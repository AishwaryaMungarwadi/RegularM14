package Listeneres;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeneres.StartListeners.class)
public class Skipped {

	@Test(timeOut=1000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("executing m1");
	}
	
	@Test(dependsOnMethods = "m1")
	public void m2()
	{
		System.out.println("executing m2");
	}
}
