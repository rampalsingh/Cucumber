package stepDefinations;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforeValidatin() {
		System.out.println("Mobile test Before Hooks");
	}
	
	@After("@MobileTest")
	public void afterValidatin() {
		System.out.println("Mobile test After Hooks");
	}
	
	@Before("@WebTest")
	public void beforeWebValidatin() {
		System.out.println("Web test Before Hooks");
	}
	
	@After("@WebTest")
	public void afterWebValidatin() {
		System.out.println("Web test After Hooks");
	}
	
}
