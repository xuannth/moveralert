package asia.twentyci.features.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import asia.twentyci.steps.serenity.AccountSteps;
import asia.twentyci.steps.serenity.GenerateOrderSteps;
import asia.twentyci.steps.serenity.HomeSteps;
import asia.twentyci.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenOpeningTheWeb {

	@Managed
	WebDriver driver;

	@Steps
	HomeSteps atHomeSteps;

	@Steps
	LoginSteps atLoginSteps;
	
	@Steps
	AccountSteps atAccountSteps;
	
	@Steps
	GenerateOrderSteps atGenerateOrder;

	@Test
	public void open_web() {
		
		String useremail = "admin@twentyea.co.uk";
		String password = "Password123!";

		atHomeSteps.openApplication();
		atLoginSteps.loginSystemWith(useremail, password);
		atAccountSteps.openGenerate();
		atGenerateOrder.selectToGenerateOrder();
	}
}
