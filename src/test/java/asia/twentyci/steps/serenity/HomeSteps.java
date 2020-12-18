package asia.twentyci.steps.serenity;

import asia.twentyci.pages.HomePage;
import asia.twentyci.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

	HomePage onHomepage;
	LoginPage onLoginpage;
	
	@Step
	public void open_application() {
		onHomepage.open();
		onHomepage.clickOnLogin();
		onLoginpage.enterTextIntoUserEmail();
	}
}
