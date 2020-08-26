package telas.onboarding;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaDetalhesPedido extends TelaApp {

	public TelaDetalhesPedido(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "see-products")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoVerProdutos;
	
	
	

}
