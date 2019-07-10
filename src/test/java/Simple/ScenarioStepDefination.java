package Simple;

import cucumber.api.java.en.When;

public class ScenarioStepDefination
{

	@When("^login using user(\\d+) and pass(\\d+)$")
	public void login_using_user_and_pass(String arg1,String arg2) throws Throwable 
	{
		System.out.println("User credential have been entered");
		System.out.println(arg1+""+arg2);
		
		}
}