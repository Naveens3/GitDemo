package Simple;

import cucumber.api.java.en.Given;

public class TagStepDefination {
	@Given("^This test case must be executed in regression phase$")
	public void regression_Phase() throws Throwable {
		System.out.println("this is Regression test case");
		
	}
	@Given("^This test case must be executed in smoke testing phase$")
	public void smokeTesting_phase() throws Throwable {
		System.out.println("This is a smoke test case");
	}

	@Given("^This test case is executed in both regression and smoke testing$")
	public void common_Phase() throws Throwable {
		System.out.println("Common test case for both");
	}
}
 
