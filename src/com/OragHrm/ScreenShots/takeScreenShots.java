package com.OragHrm.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.OragHrm.generic.Base;

public class takeScreenShots extends Base {

	public void getScreenshot() throws IOException {

		Calendar cal=Calendar.getInstance();
		Date time=cal.getTime();
		String fileName=time.toString().replace(" ", "-").replace(":","");
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile,new File("./ScreenShots/"+fileName+".png"));
	}
}
