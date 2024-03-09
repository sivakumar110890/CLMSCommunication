package testSuite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Objects.LoginTestObjects;
import commonfunctions.commonFunctions;

public class loginTest extends commonFunctions{
	@Test
	public void loginTest() throws IOException {
		PageFactory.initElements(driver, LoginTestObjects.class);
		LoginTestObjects.username.sendKeys(prop.getProperty("username"));
		LoginTestObjects.password.sendKeys(prop.getProperty("password"));
		LoginTestObjects.submitButton.click();
		
		TakesScreenshot screnshot = (TakesScreenshot) driver ;
		File Source =screnshot.getScreenshotAs(OutputType.FILE);
		File Destination=new File(System.getProperty("user.dir")+"//screenshot//login.png");
		FileHandler.copy(Source, Destination);
	}

}
