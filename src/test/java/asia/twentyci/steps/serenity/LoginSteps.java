package asia.twentyci.steps.serenity;

import static asia.twentyci.pages.LoginPage.USER_EMAIL;
import static asia.twentyci.pages.LoginPage.USER_PASSWORD;
import static asia.twentyci.pages.LoginPage.SUBMIT_BUTTON;

import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginpage;

	@Step
	public void loginSystemWith(String user_email, String user_password) {
		onLoginpage.find(USER_EMAIL).type(user_email);
		onLoginpage.find(USER_PASSWORD).type(user_password);
		onLoginpage.find(SUBMIT_BUTTON).click();
	}
}
