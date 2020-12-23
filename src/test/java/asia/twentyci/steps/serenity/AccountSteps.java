package asia.twentyci.steps.serenity;

import static asia.twentyci.pages.AccountPage.GENERATE_LINK;

import asia.twentyci.pages.AccountPage;
import net.thucydides.core.annotations.Step;

public class AccountSteps {

	AccountPage onAccountpage;
	
	@Step
	public void openGenerate() {
		onAccountpage.find(GENERATE_LINK).click();
	}
}