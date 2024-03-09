package testSuite;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Objects.communicationSearchObjects;
import commonfunctions.commonFunctions;

public class TC_01_Communication_Search extends commonFunctions{

	static Logger log = Logger.getLogger(TC_01_Communication_Search.class);
	public void communicationSearch() throws IOException {
		log.info("===================================================");
		log.info("==== Communication search test case execution is started ====");
		PageFactory.initElements(driver, communicationSearchObjects.class);
		communicationSearchObjects.ConfigurationManagerButton.click();
		communicationSearchObjects.CommunicationButton.click();
		communicationSearchObjects.CommunicationDetailsButton.click();
		communicationSearchObjects.CommunicationIdInputField.sendKeys(prop.getProperty("CommunicationIdForSearch"));
		log.info("==== communication id is entered  ====");
		Select communicationIdselect = new Select(communicationSearchObjects.CommunicationSelect);
		communicationIdselect.selectByVisibleText("Communication ID");


		Select communicationStatusSelect = new Select(communicationSearchObjects.StatusSelect);
		communicationStatusSelect.selectByVisibleText("Enabled");


		Select communicationTemplateTypeSelect=new Select(communicationSearchObjects.TemplateTypeSelect);
		communicationTemplateTypeSelect.selectByVisibleText("SMS (via SMSC)");


		communicationSearchObjects.SearchButtonClick.click();
		log.info("==== Communication search button is clicked ====");

		String ActualCommunicationId = communicationSearchObjects.SearchResultsFirstOutput.getText();
		Assert.assertEquals(prop.getProperty("CommunicationIdForSearch"), ActualCommunicationId);{
			log.info("==== Communication search results are matching ====");
			

			
		}
	}
	public void ScreenshotforCommunicationSearch() throws IOException {
		TakesScreenshot takescreenshotofCommunication = (TakesScreenshot) driver;
		File Source = takescreenshotofCommunication.getScreenshotAs(OutputType.FILE);
		File Destination=new File(System.getProperty("user.dir")+"//screenshot//TC_01_CommunicationSearch.png");
		FileHandler.copy(Source, Destination);
		log.info("Screenshot is captured");
		log.info("==== Communication search test is completed ====");
		log.info("===================================================");
	}

	@Test
	public void CommunicationSearchTestExecution() throws IOException {
		communicationSearch();
		ScreenshotforCommunicationSearch();
		
	}
}
