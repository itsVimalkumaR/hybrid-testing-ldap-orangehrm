package com.orgHrm.TestScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_6 extends Base {

	boolean required;

	//TC_031
	@Test
	public void Testcase031() {
		loc.SaveBtn.click();
		int txt = loc.AllRequiredTxt.size();
		for (int i = 0; i < txt; i++) {
			required = loc.AllRequiredTxt.get(i).isDisplayed();
		}
		try {
			if (required==true) {
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("window.scroll(0,400)");
				Thread.sleep(2000);
				sShot.getScreenshot();
				Reporter.log("Required message is visible",true);
			}
		} catch (Exception e) {
			Reporter.log("Required message is not visible",true);
			Assert.fail();
		}
	}

	//TC_032
	@Test
	public void Testcase032() {
		loc.SaveBtn.click();
		int count = loc.AllRequiredTxt.size();
		Reporter.log("We get "+count+" no.of required message",true);
	}

	//TC_033
	@Test(groups = "Failed")											
	public void Testcase033() {
		loc.OrgHrmImage.click();
		String Ex_Res = driver.getCurrentUrl();
		driver.navigate().back();
		String Ac_Res = loc.OrgLink.getAttribute("href");
		if (Ex_Res.equals(Ac_Res)) {
			Reporter.log("Both the links is  same",true);
		} else {
			Reporter.log("Both the links is not same",true);
			Assert.fail();
		}	

	}

	//TC_033_1
	@Test 																
	public void Testcase_033_1() throws InterruptedException {
		loc.OrgHrmImage.click();
		String Ex_Res = driver.getCurrentUrl();
		driver.navigate().back();
		loc.OrgLink.click();
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(wh);
		driver.switchTo().window(al.get(1));
		String Ac_Res = driver.getCurrentUrl();
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		if (Ex_Res.equals(Ac_Res)) {
			Reporter.log("Both the URL is  same",true);
		} else {
			Reporter.log("Both the URL is not same",true);
			Assert.fail();
		}	
	}

	//TC_034
	@Test
	public void Testcase034() {
		loc.TestConn.click();
		int txt = loc.AllRequiredTxt.size();
		for (int i = 0; i < txt; i++) {
			required = loc.AllRequiredTxt.get(i).isDisplayed();
		}
		try {
			if (required==true) {
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("window.scroll(0,400)");
				Thread.sleep(2000);
				sShot.getScreenshot();
				Reporter.log("Required message is visible",true);
			}
		} catch (Exception e) {
			Reporter.log("Required message is not visible",true);
			Assert.fail();
		}
	}

	//TC_035
	@Test
	public void Testcase035() {
		loc.TestConn.click();
		int count = loc.AllRequiredTxt.size();
		Reporter.log("We get "+count+" no.of required message",true);
	}

	//TC_036
	@Test
	public void Testcase036() {
		loc.BindBtn.click();
		loc.SaveBtn.click();
		int count = loc.ReqCount.size();
		Reporter.log("Save Aftre hidded the Bind settings, we get "+count+" required message is Visible",true);
	}

	//TC_037
	@Test
	public void Testcase037() {
		loc.BindBtn.click();
		loc.TestConn.click();
		int count = loc.ReqCount.size();
		Reporter.log("Test Connection Aftre hidded the Bind settings we get "+count+" required message is Visible",true);	
	}

}
