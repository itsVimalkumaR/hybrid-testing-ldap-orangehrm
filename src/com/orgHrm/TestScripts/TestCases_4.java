package com.orgHrm.TestScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_4 extends Base{

	//TC_016
	@Test
	public void Testcase016() {
		loc.SaveBtn.click();
		Reporter.log("The Save Button is not working",true);
	}

	//TC_018
	@Test
	public void Testcase018() {
		loc.BindBtn.click();
		Reporter.log("The Bind Settings is Hided",true);
	}

	//TC_020
	@Test
	public void Testcase020() {
		loc.LdapTogBtn.click();
		loc.SaveBtn.click();
		Reporter.log("User is click on Save button",true);
	}

	//TC_021
	@Test
	public void Testcase021() {
		loc.LdapTogBtn.click();
		loc.TestConn.click();
		Reporter.log("Test Connection button is not working",true);
	}

	//TC_022
	@Test													
	public void Testcase022() throws Exception {
		loc.LdapTogBtn.click();
		int Toggle = loc.AllTogBtn.size();
		try {
			for (int i = 0; i <=Toggle; i++) {
				loc.AllTogBtn.get(i).click();
			}
		} catch (Exception e) {	
			loc.TestConn.click();			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scroll(0,400)");
			Thread.sleep(2000);
			sShot.getScreenshot();
			Reporter.log("the button of Test Connection is not working",true);
		}
	}
}
