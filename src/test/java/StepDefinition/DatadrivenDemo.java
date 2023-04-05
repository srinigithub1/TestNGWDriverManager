package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatadrivenDemo {
	
	@Given("I want to write a step with {string}")
//	@Given("^I want to write a step with (.*)$")
	public void i_want_to_write_a_step_with_name1(String name) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(name);
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(int1);
	}

	@Then("I verify the {string} in step")
	//@Then("^I verify the (.*) in step$")
	public void i_verify_the_success_in_step(String status) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(status);
	}




}
