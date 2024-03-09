package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginTestObjects {


	@FindBy(id="uid")
	@CacheLookup
	public static WebElement username;

	@FindBy(id="pwd")
	@CacheLookup
	public static WebElement password;

	@FindBy(id="submit")
	@CacheLookup
	public static WebElement submitButton;
}


