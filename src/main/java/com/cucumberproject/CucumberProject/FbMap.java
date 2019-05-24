package com.cucumberproject.CucumberProject;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbMap {
	WebDriver driver;

	@Given("^User launch the fb app$")
	public void user_launch_the_fb_app() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-\\KaviK\\CucumberProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enter usname$")
	public void user_enter_usname(DataTable username) {
		Map<String, String> us = username.asMap(String.class, String.class);
		driver.findElement(By.id("email")).sendKeys(us.get("username"));

	}

	@When("^User enter uspwd$")
	public void user_enter_uspwd(DataTable password) {
		Map<String, String> ps = password.asMap(String.class, String.class);
		driver.findElement(By.id("pass")).sendKeys(ps.get("password"));

	}

	@When("^User click log btn$")
	public void user_click_log_btn() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^User chect navigate crt url or nt$")
	public void user_chect_navigate_crt_url_or_nt() {
		String url = driver.getCurrentUrl();
		if (url.contains("attempt")) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}
	}

	@Then("^User clse the brwser$")
	public void user_clse_the_brwser() {
		driver.quit();

	}

}
