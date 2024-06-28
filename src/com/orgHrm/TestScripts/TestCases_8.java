package com.orgHrm.TestScripts;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_8 extends Base{

	//TC_046
	@Test(priority = 1)
	public void Testcase046() throws Exception {
		WebElement EncrypDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		action.moveToElement(EncrypDD).click().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);
		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);
		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible.",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible",true);
			s.assertTrue(false, "Message is not Visible");
		}
	}

	//TC_047
	@Test(priority = 2)														//(dependsOnGroups = "Failed")
	public void Testcase047() throws Exception {
		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		loc.LdapImplemenDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);
		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);
		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);
		loc.SearchScopeDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible.",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible.",true);
		}

	}

	//TC_048
	@Test (priority = 3)
	public void Testcase048() throws Exception {
		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);
		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);
		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		loc.UUIDAttribute1.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);
		try {
			loc.TestConn.click();
			boolean txt = loc.ConnPopUpTxt.isDisplayed();
			loc.ConnPopUpTxt.getText();
			loc.ConnCloseBtn.click();
			if (txt==true) {
				loc.ConnPopUpTxt.getText();
				Reporter.log("The Connection status popup is appeared",true);
			}
			else
				Reporter.log("The Connection status popup is not appeared",true);
		}
		catch (Exception e) {
			Reporter.log("The Test connection button is not working",true);
		}		
	}

	//TC_049
	@Test(priority = 4)
	public void Testcase049() throws Exception {
		WebElement EncrypDD = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		action.moveToElement(EncrypDD).click().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		loc.LdapImplemenDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);
		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);
		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);
		loc.SearchScopeDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String UniqueID = wb.getSheet("Data").getRow(1).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		loc.UUIDAttribute1.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		String MidName = wb.getSheet("Data").getRow(1).getCell(9).toString();
		loc.midName1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);
		String userStatus = wb.getSheet("Data").getRow(1).getCell(11).toString();
		loc.UserStatus1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);
		String workEmail = wb.getSheet("Data").getRow(1).getCell(12).toString();
		loc.WorkEmail1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);
		String empId = wb.getSheet("Data").getRow(1).getCell(13).toString();
		loc.EmpID1.sendKeys((Keys.CONTROL+"a"),Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);
		try {
			loc.TestConn.click();
			boolean txt = loc.ConnPopUpTxt.isDisplayed();
			if (txt==true) {
				loc.ConnPopUpTxt.getText();
				loc.ConnCloseBtn.click();
				Reporter.log("The Connection status popup is appeared",true);
			}
			else
				Reporter.log("The Connection status popup is not appeared",true);
		}
		catch (Exception e) {
			Reporter.log("The Test connection button is not working",true);
		}
	}

	//	TC_050
	@Test(priority = 5)
	public void Testcase050() throws Exception {
		String Host = wb.getSheet("Data").getRow(1).getCell(0).toString();
		loc.HostTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.HostTxtFields.sendKeys(Host);
		String Port = wb.getSheet("Data").getRow(1).getCell(1).toString();
		loc.portTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.portTxtFields.sendKeys(Port);
		loc.portTxtFields.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);
		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);
		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);
		String UserNameAtt=wb.getSheet("Data").getRow(1).getCell(5).toString();
		loc.UNAttribute.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UNAttribute.sendKeys(UserNameAtt);
		String UserSFilter=wb.getSheet("Data").getRow(1).getCell(7).toString();
		loc.USearchFilter.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.USearchFilter.sendKeys(UserSFilter);
		String f_name=wb.getSheet("Data").getRow(1).getCell(8).toString();
		loc.FNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.FNameTxtFields.sendKeys(f_name);
		String l_name=wb.getSheet("Data").getRow(1).getCell(10).toString();
		loc.LNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.LNameTxtFields.sendKeys(l_name);
		Thread.sleep(3000);
		String Interval=wb.getSheet("Data").getRow(1).getCell(14).toString();
		loc.SyncInterval.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.SyncInterval.sendKeys(Interval);
		loc.SyncInterval.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		try {
			loc.SaveBtn.click();
			loc.SuccessSMS.isDisplayed();
			Reporter.log("The Successfully Updated message is visible.",true);
		} catch (Exception e) {
			sShot.getScreenshot();
			Reporter.log("The Successfully Updated message is not visible.",true);
		}
	}
}
