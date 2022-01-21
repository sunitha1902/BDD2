package com.mindtree.stepDefinitions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.local;
import com.mindtree.reusableComponents.Base;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.GetProperties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class localStepDef extends Base{
	 public WebDriver driver = null;
		local lc = null;
		 public localStepDef() throws UtilityException, Exception {
			super();
		}

			@BeforeMethod
			@Before("@local")
			public void init() throws Exception {
				log = Logger.getLogger(validpageStepDef.class.getName());
				test = report.startTest("local in");
				driver = initialize();
				System.out.println("Valid page");
				lc = new local(driver, log, test);
			}

	    @Given("^URl opened with local$")
	    public void url_opened_with_local() throws Throwable {
	    	driver.get(GetProperties.get.getProperty("url"));
			driver.manage().window().maximize();
			ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	    }

	    @Then("^click on local$")
	    public void click_on_local() throws Throwable {
	       lc.Local();
	    }
	    @Then("click from and enter valid address in {string} on local and click form")
	    public void click_from_and_enter_valid_address_in_on_local_and_form(String fro) throws ReusableComponentException, Exception {
	       lc.Outstation(fro);
	    }

	    @Then("^if booking detail is shown in local redirect to home page$")
	    public void if_booking_detail_is_shown_in_local_redirect_to_home_page() throws Throwable {
	       lc.verify();
	    }

	    @And("^click on select on local$")
	    public void click_on_select_on_local() throws Throwable {
	       lc.selecT();
	    }

	    @And("^click on time on local$")
	    public void click_on_time_on_local() throws Throwable {
	       lc.Time();
	    }

	    @And("^click on Select car on local$")
	    public void click_on_Select_car_on_local() throws Throwable {
	        lc.Seleccar();
	    }
	    @AfterMethod
		@After("@local")
		public void setReport() {
			report.endTest(test);
			report.flush();
			driver.quit();
	}
}
