package com.orgHrm.TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_2  extends Base{

	//TC_006
	@Test
	public void Testcase06() {
		String saveBtn = loc.SaveBtn.getTagName();
		Reporter.log("User should be verifed Save is a "+saveBtn,true);
	}

	//TC_007
	@Test
	public void Testcase07() {

		List<WebElement> Req = loc.ReqOpt;
		int count=Req.size();

		List<WebElement> Req1 = loc.ReqoOpt1;
		int count1=Req1.size();

		int Total=count+count1;
		Reporter.log("User is get "+Total+" required options.",true);
	}

	//TC_008
	@Test
	public void Testcase08() {

		int subTitles = loc.SubTitles.size();
		Reporter.log("User is get "+subTitles+" SubTitles in This page",true);
	}

	//TC_009
	@Test
	public void Testcase09() throws IOException {
		String Ac_res = loc.MainTitle.getText();
		String Ex_res="LDAP Configuration";
		Assert.assertEquals(Ac_res, Ex_res,"The Main Title is not same");
		sShot.getScreenshot();
		Reporter.log("User is verifed Main title is '"+Ac_res+"'",true);
	}

	//TC_010
	@Test
	public void Testcase10() {

		int dropdownBtn=loc.DropDownBtn.size();
		Reporter.log("User is get "+dropdownBtn+" Drop Down Button",true);
	}

}
