package asia.twentyci.steps.serenity;

import static asia.twentyci.pages.GenerateOrderPage.LOCATION;
//import static org.junit.Assert.assertThat;

import asia.twentyci.pages.GenerateOrderPage;
import net.thucydides.core.annotations.Step;

public class GenerateOrderSteps {

	GenerateOrderPage onGenerateorder;

	@Step
	public void selectToGenerateOrder() {
		onGenerateorder.find(LOCATION).selectByValue("G41");
		//assertThat(onGenerateorder.find(LOCATION).getSelectedValue(), is("G41"));
	}
}