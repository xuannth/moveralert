package asia.twentyci.steps.serenity;

import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage onLoginpage;
	
	@Step
	public void open_application() {
		onLoginpage.enterTextIntoUserEmail("admin@twentyea.co.uk");
	}
}
