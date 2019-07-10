package Simple;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class dataTable 
{
	int i;
	@Given("^I open Facebook URL$")
	public void i_open_Facebook_URL() throws Throwable 
	{
	 System.out.println("Open the application URL");
	}

	@Given("^fill up the new account form with the following data$")
	public void fill_up_the_new_account_form_with_the_following_data(DataTable dt) throws Throwable 
	{
		List<Map<String,String>> list=dt.asMaps(String.class, String.class);
		for(i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).get("First Name")+" "+(list.get(i).get("Last Name"))
					+" "+(list.get(i).get("Password"))+" "+(list.get(i).get("Gender")));
			System.out.println("\n");
		}
	}
}
