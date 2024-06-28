package com.OragHrm.generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseOfPOM {
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement UnBox;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement PwdBox;

	@FindBy(xpath = "//button[.=' Login ']")
	public WebElement LoginBtn;

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	public WebElement Profile;

	@FindBy(xpath = "//a[.='Logout']")
	public WebElement LogoutBtn;

	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]") 
	public WebElement AdminLink;

	@FindBy(xpath = "//span[.='Configuration ']")
	public WebElement ConfigLink;

	@FindBy(xpath = "//a[.='LDAP Configuration']")
	public WebElement LdapConfigLink;

	@FindBy(xpath = "//h6[.='LDAP Configuration']")
	public WebElement LdapTxt;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
	public List<WebElement> TxtFields;

	//Buttons
	
	@FindBy(xpath="//input[@type='checkbox']")
	public List<WebElement> ToggleBtn;
	
	@FindBy(xpath = "//button")
	public List<WebElement> Btns;
	
	@FindBy(xpath = "//button[.=' Test Connection ']")
	public WebElement TestConn;
	
	@FindBy(xpath = "//button[.=' Save ']")
	public WebElement SaveBtn;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	public List<WebElement> DropDownBtn;
	
	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	public WebElement BindBtn;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
	public WebElement LdapTogBtn;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public List<WebElement> AllTogBtn;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
	public WebElement WorkmailTogBtn;

	@FindBy(xpath = "(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[3]")
	public WebElement EmpIdTogBtn;
	
	@FindBy(xpath = "(//span[contains(@class,'active --label-right')])[4]")
	public WebElement AddSettingsBtn;
	
	@FindBy(xpath = "//button[.='×']")
	public WebElement ConnCloseBtn;
	
	//After click bind toggle button
	
	@FindBy(xpath = "(//input)[6]")
	public WebElement BdNameTxtField1;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	public WebElement UserNameAttribue;
	
	@FindBy(xpath = "(//input)[8]")
	public WebElement USearchFilter;
	
	@FindBy(xpath = "(//input)[9]")
	public WebElement UUIDAttribute;
	
	@FindBy(xpath = "(//input)[11]	")
	public WebElement midName;
	
	@FindBy(xpath = "(//input)[13]")
	public WebElement UserStatus;
	
	@FindBy(xpath = "(//input)[14]")
	public WebElement WorkEmail;
	
	@FindBy(xpath = "(//input)[16]")
	public WebElement EmpID;

	
	//Before click bind toggle button
	
	@FindBy(xpath = "(//input)[3]")
	public WebElement HostTxtFields;
	
	@FindBy(xpath = "(//input)[4]")
	public WebElement portTxtFields;
	
	@FindBy(xpath = "(//input)[6]")
	public WebElement DistingNameTxtFields;

	@FindBy(xpath = "(//input)[7]")
	public WebElement PasswordTxtFields;
	
	@FindBy(xpath = "(//input)[8]")
	public WebElement BdNameTxtField;
	
	@FindBy(xpath = "(//input)[9]")
	public WebElement UNAttribute;
	
	@FindBy(xpath = "(//input)[10]")
	public WebElement USFilter;
	
	@FindBy(xpath = "(//input)[11]")	
	public WebElement UUIDAttribute1;
	
	@FindBy(xpath = "(//input)[12]")
	public WebElement FNameTxtFields;
	
	@FindBy(xpath = "(//input)[13]")
	public WebElement midName1;
	
	@FindBy(xpath = "(//input)[14]")
	public WebElement LNameTxtFields;
	
	@FindBy(xpath = "(//input)[15]")
	public WebElement UserStatus1;
	
	@FindBy(xpath = "(//input)[16]")
	public WebElement WorkEmail1;
	
	@FindBy(xpath = "(//input)[18]")
	public WebElement EmpID1;
	
	@FindBy(xpath = "(//input)[21]")
	public WebElement SyncInterval;
	
	// DropDown

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	public WebElement EncrypDD;
	
	@FindBy(xpath = "//div[text()='TLS']")
	public WebElement TLSOpt;

	@FindBy(xpath = "(//div[.='SSL'])[4]")
	public WebElement SSLOpt;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	public WebElement LdapImplemenDD;
	
	@FindBy(xpath = "(//div[.='Open LDAP v3'])[4]")
	public WebElement OpenLdapOpt;
	
	@FindBy(xpath = "(//div[.='MS Active Directory'])[4]")
	public WebElement MSADirectoryOpt;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")
	public WebElement SearchScopeDD;
	
	@FindBy(xpath = "(//div[.='Subtree'])[4]")
	public WebElement SubtreeOpt;
	
	@FindBy(xpath = "(//div[.='One level'])[4]")
	public WebElement OneLevelOpt;
		
	/******************************************************************************************************/
	
	@FindBy(xpath = "//p[contains(@class,'oxd-input-field-required')]")
	public List<WebElement> ReqOpt;
	
	@FindBy(xpath = "//label[contains(@class,'oxd-input-field-required')]")
	public List<WebElement> ReqoOpt1;
	
	@FindBy(xpath = "//p[contains(@class,'orangehrm-subtitle')]")
	public List<WebElement> SubTitles;
	
	@FindBy(xpath = "//h6[contains(@class,'orangehrm-main-title')]")
	public WebElement MainTitle;
		
	@FindBy(xpath = "//h6[.='Configuration']")
	public WebElement Heading;
	
	@FindBy(xpath = "//a[.='OrangeHRM, Inc']")
	public WebElement OrgLink;
	
	@FindBy(xpath = "//a[.='OrangeHRM, Inc']")
	public WebElement HRSoftawre;
	
	@FindBy(xpath = "//span[text()='Required']")
	public WebElement RequiredTxt;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement DisclaimMessage;
	
	@FindBy(xpath = "(//span[contains(@class,'oxd-input-group__message')])[4]")
	public WebElement WorkEmailReqTxt;
	
	@FindBy(xpath = "(//span[contains(@class,'oxd-input-group__message')])[4]")
	public WebElement EmpIdReqTxt;
	
	@FindBy(xpath = "//span[contains(@class,'oxd-input-group__message')]")
	public List<WebElement> AllRequiredTxt;
	
	@FindBy(xpath = "//span[contains(@class,'oxd-input-group__message')]")
	public List<WebElement> ReqCount;
	
	@FindBy(xpath = "//img[@alt='client brand banner']")
	public WebElement OrgHrmImage;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
	public WebElement SuccessSMS;

	@FindBy(xpath = "//p[.='Connection Status']")
	public WebElement ConnPopUpTxt;
	
}
