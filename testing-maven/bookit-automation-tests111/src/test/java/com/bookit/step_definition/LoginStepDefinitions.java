package com.bookit.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.out.println("Opening Login Page");
	}

	@When("the user logs in as a teacher")
	public void the_user_logs_in_as_a_teacher() {
		System.out.println("I am logging in now");
	}

	@Then("the user should be logged in")
	public void the_user_should_be_logged_in() {
		System.out.println("I am logged in!!");
	}

	@Then("They is now doing whatever he wants")
	public void they_is_now_doing_whatever_he_wants() {
		System.out.println("I am doing everthing!!");
	}

	@Then("no one stopping him")
	public void no_one_stopping_him() {
		System.out.println("I am going everwhere!!");
	}

	@When("the user logs in as a team lead")
	public void the_user_logs_in_as_a_team_lead() {
		System.out.println("I am Leader!!");
	}
}
