package asia.twentyci.steps.serenity;

import asia.twentyci.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

	HomePage onHomepage;
	
	@Step
	public void openApplication() {
		onHomepage.open();
		onHomepage.clickOnLogin();
	}
}
