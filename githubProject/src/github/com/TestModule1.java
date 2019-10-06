package github.com;

import org.testng.annotations.Test;



public class TestModule1 {
  
	@Test(priority=1)
	public void testone(){
		System.out.println("test one method");
		
	}
	
	@Test(priority=2)
	public void testtwo(){
		System.out.println("test two method");
		
	}
	
}
