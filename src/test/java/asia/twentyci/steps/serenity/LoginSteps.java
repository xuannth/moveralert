package asia.twentyci.steps.serenity;

import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginpage;
	
	@Step
	public void login_steps() {
		onLoginpage.enterTextIntoUserEmail("admin@twentyea.co.uk");
	}
}
