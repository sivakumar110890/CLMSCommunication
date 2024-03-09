package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class communicationSearchObjects {
	
	@FindBy(xpath="//ul[@id=\"sidebarMenu\"]/li/a[contains(text(),'Campaign Management')]")
	@CacheLookup
	public static WebElement ConfigurationManagerButton;
	
	@FindBy(xpath="(//a[contains(text(),'Communications')])[2]")
	@CacheLookup
	public static WebElement CommunicationButton;
	
	
	@FindBy(xpath="//a[contains(text(),'Communication Details')]")
	@CacheLookup
	public static WebElement CommunicationDetailsButton;
	
	
	@FindBy(id="Search_Communications_search1_val")
	@CacheLookup
	public static WebElement CommunicationIdInputField;
	
	
	@FindBy(id="search1")
	@CacheLookup
	public static WebElement CommunicationSelect;
	
	
	@FindBy(id="available")
	@CacheLookup
	public static WebElement StatusSelect;
	
	
	@FindBy(id="typeowner")
	@CacheLookup
	public static WebElement OwnerSelect;
	
	
	@FindBy(id="m_type")
	@CacheLookup
	public static WebElement TemplateTypeSelect;
	
	
	@FindBy(id="Search_Communications_search")
	@CacheLookup
	public static WebElement SearchButtonClick;
	
	
	@FindBy(xpath="(//table[@id=\"yui-dt0-bodytable\"]/tbody/tr/td)[1]")
	@CacheLookup
	public static WebElement SearchResultsFirstOutput;
	

}
