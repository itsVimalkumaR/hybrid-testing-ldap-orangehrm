package com.OragHrm.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.OragHrm.ScreenShots.takeScreenShots;

public class Base{

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	}
	public static WebDriver driver;
	public FileInputStream fis;
	public Properties p;
	public FileInputStream fin;
	public Workbook wb;
	public SoftAssert s;
	public BaseOfPOM loc;
	public takeScreenShots sShot;
	public Robot r;
	public Actions action;

	@BeforeClass
	public void OpenBrowser() throws IOException, AWTException {

		fis=new FileInputStream("./data/OrangeHRM.txt");
		p=new Properties();
		p.load(fis);

		fin=new FileInputStream("./data/OrgHrmData.xlsx");
		wb = WorkbookFactory.create(fin);
		
		driver=new ChromeDriver();
//		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(10));
		driver.manage().window().maximize();
		String Url=p.getProperty("url");
		driver.get(Url); 	//driver.get(p.getProperty("url"));
		s=new SoftAssert();
		sShot=new takeScreenShots();
		r = new Robot();
		action = new Actions(driver);
		
	}

	@BeforeMethod
	public void Login() {

		String Un=p.getProperty("un");
		String Pwd=p.getProperty("pwd");

		loc = new BaseOfPOM();
		PageFactory.initElements(driver,loc);

		loc.UnBox.sendKeys(Un);
		loc.PwdBox.sendKeys(Pwd);
		loc.LoginBtn.click();

		loc.AdminLink.click();
		loc.ConfigLink.click();
		loc.LdapConfigLink.click();
	}
	@AfterMethod
	public void Logout() {
		loc.Profile.click();
		loc.LogoutBtn.click();
	}
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		s.assertAll();
	}

}
