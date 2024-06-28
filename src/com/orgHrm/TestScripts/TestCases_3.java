package com.orgHrm.TestScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_3  extends Base{

	//TC_011
	@Test(groups = "Failed")										
	public void Testcase011() throws IOException {	
		String AC_res = loc.Heading.getText();
		String Ex_res="Admin/Configuration";
		try {
			if (Ex_res.equals(AC_res)) 
				Reporter.log("Expected & Actual Heading is "+Ex_res,true);
		}catch (Exception e) {
			Reporter.log("Actual Heading is "+AC_res,true);
			sShot.getScreenshot();
			Assert.fail();
		}
	}

	//TC_012
	@Test											
	public void Testcase012() throws InterruptedException, IOException {
		String Ac_Res = loc.OrgLink.getAttribute("href");
		Thread.sleep(2000);
		String Ex_Res="http://www.orangehrm.com/";
		try {
		if (Ex_Res.equals(Ac_Res)) 
			Reporter.log("The link is same",true);
		} catch (Exception e) {
			Reporter.log("The link is not same",true);
			sShot.getScreenshot();
			Assert.fail();

		}	
	}

	//TC_013
	@Test
	public void Testcase013() {
		String title = driver.getTitle();
		Reporter.log("User get the title is "+title,true);
	}

	//TC_014
	@Test
	public void Testcase014() throws Exception {
		loc.HRSoftawre.click();
		String AC_Res = driver.getTitle();
		String EX_Res="OrangeHRM";
		try {
		if (EX_Res.equals(AC_Res)) 
			Reporter.log("The Title is same",true);
		} catch (Exception e) {
			Reporter.log("The Title is not same",true);
			sShot.getScreenshot();
			Assert.fail();
		}
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(wh);
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		Reporter.log("The link is redirecting to "+AC_Res,true);

	}

	//TC_015
	@Test
	public void Testcase015() throws Exception {
		Thread.sleep(2000);
		loc.TestConn.click();
		Reporter.log("The Test Connection Button is not working",true);

	}
}
