package asia.twentyci.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{

	private static final String INPUT_USER_PASSWORD = "//input[@id='user_password']";
	
	@FindBy(xpath = "//input[@id='user_email']")
	WebElementFacade useremailField;
	
	public void enterTextIntoUserEmail() {
		useremailField.type();
	}
	
	public void enterTextIntoUserPassword(String userPassword) {
		$(INPUT_USER_PASSWORD).type(userPassword);
	}
	
	@FindBy(xpath = "//button[@id='btn-pupur']")
	WebElementFacade submitButton;
	
	public void clickOnSubmit() {
		submitButton.click();
	}
	
}
