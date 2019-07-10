package Simple;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination {
	String str;
	@Given("^when the prints hello world$")
	public void preCondition() throws Throwable {
	    str="Hello World";
	}

	@Then("^hello world displays in console$")
	public void print() throws Throwable 
	{ 
		System.out.println(str);  
	}
}
