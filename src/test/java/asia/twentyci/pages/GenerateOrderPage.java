package asia.twentyci.pages;

import net.serenitybdd.core.pages.PageObject;

public class GenerateOrderPage extends PageObject{

	public  static final String LOCATION = "//select[@id='postcode']";
	public  static final String DISTANCE = "//select[@id='distance']";
	public  static final String INDUSTY_TYPE = "//select[@id='industry_type_id']";
	public  static final String MOVERALERTS_TYPE = "//select[@id='listing_status']";
	public  static final String BUTTON_PURCHASE = "//button[@class='btn-success']";
	
}
