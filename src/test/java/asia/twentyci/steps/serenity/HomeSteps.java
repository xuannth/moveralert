package asia.twentyci.steps.serenity;

import asia.twentyci.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

	HomePage onHomepage;
	
	@Step
	public void home_steps() {
		onHomepage.open();
		onHomepage.clickOnLogin();
	}
}
