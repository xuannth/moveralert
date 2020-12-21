package asia.twentyci.steps.serenity;

import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginpage;

	@Step
	public void loginSystemWith(String user_email, String user_password) {	
		onLoginpage.enterTextIntoUserEmail(user_email);
		onLoginpage.enterTextIntoUserPassword(user_password);
		onLoginpage.clickOnSubmit();
	}
}
