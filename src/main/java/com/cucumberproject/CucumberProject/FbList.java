package com.cucumberproject.CucumberProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbList {
	WebDriver driver;

	@Given("^User launch the fbook url$")
	public void user_launch_the_fbook_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-\\KaviK\\CucumberProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enter name$")
	public void user_enter_name(DataTable us)  {
		List<String> ue = us.asList(String.class);
		driver.findElement(By.id("email")).sendKeys(ue.get(0));
	}

	@When("^User enter pword$")
	public void user_enter_pword(DataTable ps) {
		List<String> pd = ps.asList(String.class);
		driver.findElement(By.id("pass")).sendKeys(pd.get(1));

	}

	@When("^User click the log button$")
	public void user_click_the_log_button() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^User check navigate to crct url or not$")
	public void user_check_navigate_to_crct_url_or_not() {
		String url = driver.getCurrentUrl();
		if (url.contains("attempt")) {
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}

	}

	@Then("^User close the brows$")
	public void user_close_the_brows() {
		driver.quit();

	}

}
