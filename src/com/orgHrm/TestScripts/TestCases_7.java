package com.orgHrm.TestScripts;

import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_7 extends Base{

	//TC_038
	@Test											
	public void Testcase038() throws Exception {
		String name = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField1.sendKeys(name);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible.",true);
			Assert.fail();
		}
	}

	//TC_039
	@Test  												
	public void Testcase039() throws Exception {
		Thread.sleep(2000);
		String name = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField1.sendKeys(name);
		try {
			loc.TestConn.click();
			boolean txt = loc.ConnPopUpTxt.isDisplayed();
			if (txt==true) {
				loc.ConnPopUpTxt.getText();
				loc.ConnCloseBtn.click();
				Reporter.log("The Connection status popup is appeared",true);
			}
		}
		catch (Exception e) {
			Reporter.log("The Connection status popup is not appeared",true);
			Assert.fail();
		}	
	}

	//TC_040
	@Test
	public void Testcase040() throws Exception {
		String name = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(name);
		String password = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(password);
		String Bname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(Bname);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible. ",true);
			Assert.fail();
		}
	}

	//TC_041
	@Test
	public void Testcase041() {
		String name = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(name);
		String password = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(password);
		String Bname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(Bname);
		try {
			loc.TestConn.click();
			boolean txt = loc.ConnPopUpTxt.isDisplayed();
			if (txt==true) {
				String title = loc.ConnPopUpTxt.getText();
				loc.ConnCloseBtn.click();
				Reporter.log("The "+title+" popup is appeared",true);
			}
		}
		catch (Exception e) {
			Reporter.log("The Test Connection button is not working",true);
			Assert.fail();
		}
	}

	//TC_042
	@Test
	public void Testcase042() throws Exception {
		String name = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField1.sendKeys(name);
		loc.SearchScopeDD.click();
		Thread.sleep(3000);	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute.sendKeys(UniqueID);
		loc.UUIDAttribute.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID.sendKeys(empId);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible.",true);
			Assert.fail();
		}
	}

	//TC_043
	@Test
	public void Testcase043() throws Exception {
		String name = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField1.sendKeys(name);
		WebElement SearchDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
		action.moveToElement(SearchDD).click().perform();
		Thread.sleep(3000);	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute.sendKeys(UniqueID);
	
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName.sendKeys(MidName);
	
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus.sendKeys(userStatus);
		
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail.sendKeys(workEmail);
		
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID.sendKeys(empId);
		try {
			loc.TestConn.click();
			boolean txt = loc.ConnPopUpTxt.isDisplayed();
			if (txt==true) {
				String title = loc.ConnPopUpTxt.getText();
				loc.ConnCloseBtn.click();
				Reporter.log("The "+title+" popup is appeared",true);
			}
		}
		catch (Exception e) {
			Reporter.log("The Test Connection button is not working",true);
			Assert.fail();
		}
	}

	//TC_044
	@Test(priority = 7)
	public void Testcase044() throws Exception {
		WebElement EncrypDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		action.moveToElement(EncrypDD).click().perform();
		Thread.sleep(3000);	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String name = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField1.sendKeys(name);
		WebElement SearchDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
		action.moveToElement(SearchDD).click().perform();
		Thread.sleep(3000);	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		loc.UUIDAttribute1.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID.sendKeys(empId);
		try {
			loc.TestConn.click();
			boolean txt = loc.ConnPopUpTxt.isDisplayed();
			if (txt==true) {
				String title = loc.ConnPopUpTxt.getText();
				loc.ConnCloseBtn.click();
				Reporter.log("The "+title+" popup is appeared",true);
			}
		}
		catch (Exception e) {
			Reporter.log("The Test Connection button is not working",true);
			Assert.fail();
		}
	}

	//TC_045
	@Test(priority = 8)
	public void Testcase045() throws Exception {
		WebElement EncrypDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		action.moveToElement(EncrypDD).click().perform();
		Thread.sleep(3000);	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String name = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField1.sendKeys(name);
		WebElement SearchDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
		action.moveToElement(SearchDD).click().perform();
		Thread.sleep(3000);	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID.sendKeys(empId);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible",true);
			Assert.fail();
		}
	}
}
