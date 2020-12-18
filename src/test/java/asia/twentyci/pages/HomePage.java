package asia.twentyci.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ma2.twentyci.asia/")
public class HomePage extends PageObject{
	
	@FindBy(xpath = "//a[@href='/login']")
	WebElementFacade loginlink;
	
	public void clickOnLogin() {
		loginlink.click();
	}
}
