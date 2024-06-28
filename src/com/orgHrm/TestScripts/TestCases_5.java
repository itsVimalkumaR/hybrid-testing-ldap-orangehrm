package com.orgHrm.TestScripts;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_5 extends Base {

	//TC_023
	@Test
	public void Testcase023() throws Exception{
		loc.LdapTogBtn.click();
		int count = loc.AllTogBtn.size();
		try {
			for (int i = 0; i < count; i++) {
				loc.AllTogBtn.get(i).click();
			}
		} catch (Exception e) {	
			loc.SaveBtn.click();
			boolean text = loc.RequiredTxt.isDisplayed();
			if (text==true) {
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("window.scroll(0,400)");
				Thread.sleep(2000);
				sShot.getScreenshot();
				Reporter.log("The Button of save is not working",true);
			}
		}
	}

	//TC_024
	@Test												
	public void Testcase024() throws Exception {
		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		loc.SaveBtn.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		boolean text = loc.RequiredTxt.isDisplayed();
		if (text==true) {
			jse.executeScript("window.scroll(0,400)");
			Thread.sleep(2000);
			sShot.getScreenshot();
			Reporter.log("The Button of save is not working",true);
		}	
		else
			Reporter.log("Save button is working",true);
	}

	//TC_025
	@Test(groups = "Failed")								
	public void Testcase025() throws Exception {
		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		loc.TestConn.click();
		try {
			boolean text = loc.RequiredTxt.isDisplayed();
			driver.findElement(By.xpath("//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']")).click();
			if (text==false) {
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("window.scroll(0,400)");
				Thread.sleep(2000);
				sShot.getScreenshot();
				Reporter.log("The Button of Test Connection is not working",true);
			}
		}
		catch (Exception e) {
			Assert.fail();
			Reporter.log("The button is Not working",true);
		}
	}

	//TC_026
	@Test
	public void Testcase026() {
		boolean dis = loc.DisclaimMessage.isDisplayed();
		if (dis==true) {
			Reporter.log("Disclaimer Message is Displayed",true);
		} else {
			Reporter.log("Disclaimer Message is not Displayed",true);
		}
	}

	//TC_028
	@Test
	public void Testcase028() {
		loc.WorkmailTogBtn.click();
		loc.SaveBtn.click();
		boolean ReqText = loc.WorkEmailReqTxt.isDisplayed();
		if (ReqText==true) 
			Reporter.log("Work Email option is changed to required",true);
		else {
			Reporter.log("Work Email option is not changed to required",true);
			Assert.fail();
		}
	}

	//TC_029
	@Test
	public void Testcase029() {
		loc.EmpIdTogBtn.click();
		loc.SaveBtn.click();
		boolean ReqText =loc.EmpIdReqTxt.isDisplayed();
		if (ReqText==true) 
			Reporter.log("Employee Id option is changed to required",true);
		else {
			Reporter.log("Employee Id option is not changed to required",true);
			Assert.fail();
		}
	}

	//TC_030
	@Test
	public void Testcase030() {
		loc.AddSettingsBtn.click();
		Reporter.log("No changes for Additional Settings",true);
	}
}


