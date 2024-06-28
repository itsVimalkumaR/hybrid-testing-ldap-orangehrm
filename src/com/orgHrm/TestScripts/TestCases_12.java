package com.orgHrm.TestScripts;

import java.awt.event.KeyEvent;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_12 extends Base{

	//TC_057
	@Test
	public void Testcase057() throws Exception {
		String Host = wb.getSheet("Data").getRow(1).getCell(0).toString();
		loc.HostTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.HostTxtFields.sendKeys(Host);

		String Port = wb.getSheet("Data").getRow(1).getCell(1).toString();
		loc.portTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.portTxtFields.sendKeys(Port);
		loc.portTxtFields.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);

		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		loc.LdapImplemenDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);

		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);

		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);

		loc.SearchScopeDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String UserNameAtt=wb.getSheet("Data").getRow(1).getCell(5).toString();
		loc.UNAttribute.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UNAttribute.sendKeys(UserNameAtt);

		String UserSFilter=wb.getSheet("Data").getRow(1).getCell(7).toString();
		loc.USearchFilter.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.USearchFilter.sendKeys(UserSFilter);

		String UniqueID = wb.getSheet("Data").getRow(2).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);

		String f_name=wb.getSheet("Data").getRow(1).getCell(8).toString();
		loc.FNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.FNameTxtFields.sendKeys(f_name);

		String MidName = wb.getSheet("Data").getRow(2).getCell(9).toString();
		loc.midName1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);

		String l_name=wb.getSheet("Data").getRow(1).getCell(10).toString();
		loc.LNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.LNameTxtFields.sendKeys(l_name);

		String userStatus = wb.getSheet("Data").getRow(2).getCell(11).toString();
		loc.UserStatus1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);

		String workEmail = wb.getSheet("Data").getRow(2).getCell(12).toString();
		loc.WorkEmail1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);

		loc.EmpIdTogBtn.click();
		String empId = wb.getSheet("Data").getRow(2).getCell(13).toString();
		loc.EmpID1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);

		String Interval=wb.getSheet("Data").getRow(1).getCell(14).toString();
		loc.SyncInterval.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.SyncInterval.sendKeys(Interval);
		loc.SyncInterval.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
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
	
	//TC_058
	@Test
	public void Testcase055() throws Exception {
		String Host = wb.getSheet("Data").getRow(1).getCell(0).toString();
		loc.HostTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.HostTxtFields.sendKeys(Host);

		String Port = wb.getSheet("Data").getRow(1).getCell(1).toString();
		loc.portTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.portTxtFields.sendKeys(Port);
		loc.portTxtFields.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);

		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		loc.LdapImplemenDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);

		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);

		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);

		loc.SearchScopeDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String UserNameAtt=wb.getSheet("Data").getRow(1).getCell(5).toString();
		loc.UNAttribute.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UNAttribute.sendKeys(UserNameAtt);

		String UserSFilter=wb.getSheet("Data").getRow(1).getCell(7).toString();
		loc.USearchFilter.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.USearchFilter.sendKeys(UserSFilter);

		String UniqueID = wb.getSheet("Data").getRow(2).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);

		String f_name=wb.getSheet("Data").getRow(1).getCell(8).toString();
		loc.FNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.FNameTxtFields.sendKeys(f_name);

		String MidName = wb.getSheet("Data").getRow(2).getCell(9).toString();
		loc.midName1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);

		String l_name=wb.getSheet("Data").getRow(1).getCell(10).toString();
		loc.LNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.LNameTxtFields.sendKeys(l_name);

		String userStatus = wb.getSheet("Data").getRow(2).getCell(11).toString();
		loc.UserStatus1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);

		loc.WorkmailTogBtn.click();
		String workEmail = wb.getSheet("Data").getRow(2).getCell(12).toString();
		loc.WorkEmail1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);

		loc.EmpIdTogBtn.click();
		String empId = wb.getSheet("Data").getRow(2).getCell(13).toString();
		loc.EmpID1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);

		String Interval=wb.getSheet("Data").getRow(1).getCell(14).toString();
		loc.SyncInterval.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.SyncInterval.sendKeys(Interval);
		loc.SyncInterval.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
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
	
	//TC_059
	@Test
	public void Testcase056() throws Exception {
		String Host = wb.getSheet("Data").getRow(1).getCell(0).toString();
		loc.HostTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.HostTxtFields.sendKeys(Host);

		String Port = wb.getSheet("Data").getRow(1).getCell(1).toString();
		loc.portTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.portTxtFields.sendKeys(Port);
		loc.portTxtFields.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		
		loc.EncrypDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		loc.LdapImplemenDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String Dname = wb.getSheet("Data").getRow(1).getCell(2).toString();
		loc.DistingNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.DistingNameTxtFields.sendKeys(Dname);

		String PassWord = wb.getSheet("Data").getRow(1).getCell(3).toString();
		loc.PasswordTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.PasswordTxtFields.sendKeys(PassWord);

		String BDname = wb.getSheet("Data").getRow(1).getCell(4).toString();
		loc.BdNameTxtField.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.BdNameTxtField.sendKeys(BDname);

		loc.SearchScopeDD.click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String UserNameAtt=wb.getSheet("Data").getRow(1).getCell(5).toString();
		loc.UNAttribute.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UNAttribute.sendKeys(UserNameAtt);

		String UserSFilter=wb.getSheet("Data").getRow(1).getCell(7).toString();
		loc.USearchFilter.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.USearchFilter.sendKeys(UserSFilter);

		String UniqueID = wb.getSheet("Data").getRow(2).getCell(6).toString();
		loc.UUIDAttribute1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UUIDAttribute1.sendKeys(UniqueID);
		
		String f_name=wb.getSheet("Data").getRow(1).getCell(8).toString();
		loc.FNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.FNameTxtFields.sendKeys(f_name);
		
		String MidName = wb.getSheet("Data").getRow(2).getCell(9).toString();
		loc.midName1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.midName1.sendKeys(MidName);

		String l_name=wb.getSheet("Data").getRow(1).getCell(10).toString();
		loc.LNameTxtFields.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.LNameTxtFields.sendKeys(l_name);
		
		String userStatus = wb.getSheet("Data").getRow(2).getCell(11).toString();
		loc.UserStatus1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.UserStatus1.sendKeys(userStatus);

		loc.WorkmailTogBtn.click();
		String workEmail = wb.getSheet("Data").getRow(2).getCell(12).toString();
		loc.WorkEmail1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.WorkEmail1.sendKeys(workEmail);

		loc.EmpIdTogBtn.click();
		String empId = wb.getSheet("Data").getRow(2).getCell(13).toString();
		loc.EmpID1.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		loc.EmpID1.sendKeys(empId);

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
