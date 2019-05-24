package com.cucumberproject.CucumberProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbListOfList {
	WebDriver driver;

	@Given("^User launch the faceb application$")
	public void user_launch_the_faceb_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-\\KaviK\\CucumberProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enter uname$")
	public void user_enter_uname(DataTable username) {
		List<List<String>> us = username.asLists(String.class);
		driver.findElement(By.id("email")).sendKeys(us.get(2).get(1));

	}

	@When("^User enter passwd$")
	public void user_enter_passwd(DataTable password) {
		List<List<String>> ps = password.asLists(String.class);
		driver.findElement(By.id("pass")).sendKeys(ps.get(3).get(0));

	}

	@When("^User click login$")
	public void user_click_login() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^User navigate the correct url$")
	public void user_navigate_the_correct_url() {
		String url = driver.getCurrentUrl();
		if (url.contains("attempt")) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}

	}

	@Then("^User quit the browser$")
	public void user_quit_the_browser() {
		driver.quit();

	}

}
