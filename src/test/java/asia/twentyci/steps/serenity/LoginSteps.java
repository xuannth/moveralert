package asia.twentyci.steps.serenity;

import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import static asia.twentyci.pages.LoginPage.USER_EMAIL;
import static asia.twentyci.pages.LoginPage.USER_PASSWORD;
import static asia.twentyci.pages.LoginPage.SUBMIT_BUTTON;

public class LoginSteps {

	// LoginPage onLoginpage;

	@Step
	public void loginSystemWith(String user_email, String user_password) {
		$(USER_EMAIL).type(user_email);
		$(USER_PASSWORD).type(user_password);
		element(SUBMIT_BUTTON).click();
	}
}
