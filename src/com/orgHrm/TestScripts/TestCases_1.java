package com.orgHrm.TestScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OragHrm.generic.Base;

public class TestCases_1 extends Base{

	//TC_001
		@Test
		public void TestCase01() {
			String txt=loc.LdapTxt.getText();
			Reporter.log("User is able to navigate to "+txt+" Page",true);
		}

		//TC_002
		@Test
		public void TestCase02() {
			int count = loc.TxtFields.size();
			Reporter.log(" User is get "+count+" text fields in this page",true);
		}

		//TC_003
		@Test
		public void TestCase03() {
			int TogBtn = loc.ToggleBtn.size();
			Reporter.log("User is find "+TogBtn+" no.of toggle in this Page",true);
		}

		//TC_004
		@Test
		public void TestCase04() {
			int Btn = loc.Btns.size();
			Reporter.log("User is get "+Btn+" no.of buttons",true);
		}

		//TC_005
		@Test
		public void Testcase05() {
			String TCBtn = loc.TestConn.getTagName();
			Reporter.log("User should be verifed Test Connection is  "+TCBtn,true);

		}
}
