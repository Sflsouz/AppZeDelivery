package telas.onboarding;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaEndereco extends TelaApp {

	public TelaEndereco(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(accessibility = "address input")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  campoPesquisaEndereco;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"address-card-auto-complete\"]/android.widget.TextView[2]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  primeiroEnderecoLista;
	
	@AndroidFindBy(accessibility = "work-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  iconeTrabalho;
	
	@AndroidFindBy(accessibility = "continue")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoContinuar;
	
	@AndroidFindBy(accessibility = "complement-input")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  campoComplemento;
	
}
