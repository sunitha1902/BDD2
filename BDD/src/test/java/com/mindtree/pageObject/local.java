package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.exceptions.PageObjectException;
import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponents.WebDriverSupport;
import com.mindtree.uiStore.localUI;
import com.mindtree.utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.ExtentTest;

public class local extends localUI {

	WebDriver driver;
	Logger log;
	ExtentTest test;

	public local(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void Local() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, local , "local", "local", log, test);
	}
	public void Outstation(String fro) throws ReusableComponentException, Exception {

		WebDriverSupport.click(driver, from, "from", "from place", log, test);
		WebDriverSupport.sendKeys(driver, from, "from", "place", log, test, fro);
		
		Thread.sleep(2000);
	//	WebDriverSupport.click(driver, froms, "rom", "froms", log, test);

		}
	public void selecT() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, select, "select", "selected", log, test);
		Thread.sleep(2000);
	}
	public void Time() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, time, "time", "time", log, test);
	}
	
			
			public void Seleccar() throws ReusableComponentException, Exception {
			WebDriverSupport.click(driver, selectcar, "select", "select car", log, test);
			}
			public void verify() throws ReusableComponentException, Exception {
			try {
			
			if (driver.findElement(bookingdetail).isDisplayed()) {
				ExtentLogUtilities.pass(driver, test, "booking detail shown ", log);
				WebDriverSupport.click(driver, home, "home page", "home page", log, test);
			} else {
				ExtentLogUtilities.fail(driver, test, " booking detail not shown", log);
				throw new PageObjectException("verify failed");
			}
			
		}catch (Exception e) {
			throw new PageObjectException(e.getMessage());
		}
	}
	
		
	
}
