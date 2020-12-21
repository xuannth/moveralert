package asia.twentyci.steps.serenity;

import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginpage;
	
	@Step
	public void loginSystemWith() {	
		String useremail = "admin@twentyea.co.uk";
		String password = "Password123!";
		onLoginpage.enterTextIntoUserEmail(useremail);
		onLoginpage.enterTextIntoUserPassword(password);
		onLoginpage.clickOnSubmit();
	}
}
