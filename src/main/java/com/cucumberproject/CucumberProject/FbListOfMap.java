package com.cucumberproject.CucumberProject;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbListOfMap {
	WebDriver driver;

	@Given("^User launch the fb url$")
	public void user_launch_the_fb_url() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-\\KaviK\\CucumberProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enter userid$")
	public void user_enter_userid(DataTable username) {
		List<Map<String, String>> us = username.asMaps(String.class, String.class);
		driver.findElement(By.id("email")).sendKeys(us.get(2).get("password"));

	}

	@When("^User enter passid$")
	public void user_enter_passid(DataTable password) {
		List<Map<String, String>> ps = password.asMaps(String.class, String.class);
		driver.findElement(By.id("pass")).sendKeys(ps.get(1).get("username"));

	}

	@When("^User click login btn$")
	public void user_click_login_btn() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^User check to navigate crct url or not$")
	public void user_check_to_navigate_crct_url_or_not() {
		String url = driver.getCurrentUrl();
		if (url.contains("attempt")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	@Then("^User close the browse$")
	public void user_close_the_browse() {
		driver.quit();

	}

}
