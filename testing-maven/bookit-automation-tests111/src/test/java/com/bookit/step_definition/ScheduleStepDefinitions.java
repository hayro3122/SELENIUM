package com.bookit.step_definition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScheduleStepDefinitions {
	
	@When("go to my schedule")
	public void go_to_my_schedule() {
	    System.out.println("I am going to my schedule");
	}

	@Then("I should able to see the reservations for my team")
	public void i_should_able_to_see_the_reservations_for_my_team() {
	    System.out.println("I can see the reservation for my team");
	}

}
