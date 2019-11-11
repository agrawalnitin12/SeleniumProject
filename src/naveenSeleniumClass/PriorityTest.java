package naveenSeleniumClass;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test (priority=0)
	public void a_method() {
		System.out.println("i am in A Method");
	}
	
	@Test 
	public void b_method() {
		System.out.println("i am in B method");
	}
	
	@Test 
	public void c_method() {
		System.out.println("i am in C Method");
	}
	
	@Test (priority=0)
	public void d_method() {
		System.out.println("i am in D method");
	}

	@Test
	public void e_method() {
		System.out.println("i am in E method");
	}
}
