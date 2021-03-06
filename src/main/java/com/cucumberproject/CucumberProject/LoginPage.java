package com.cucumberproject.CucumberProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	WebDriver driver;

	@Given("^User launch the facebook application$")
	public void user_launch_the_facebook_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-\\KaviK\\CucumberProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enter username$")
	public void user_enter_username() {
		driver.findElement(By.id("email")).sendKeys("kavitha");
	}

	@When("^User enter password$")
	public void user_enter_password() {
		driver.findElement(By.id("pass")).sendKeys("kavi");
	}

	@When("^User click the login button$")
	public void user_click_the_login_button() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^USer check navigate to correct url or not$")
	public void user_check_navigate_to_correct_url_or_not() {
		String url = driver.getCurrentUrl();
		if (url.contains("attempt")) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

	}

	@Then("^User close the browser$")
	public void user_close_the_browser() {
		driver.quit();

	}

}
