package telas.pedido;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaCompraProduto extends TelaApp {

	public TelaCompraProduto(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "product-title")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelNomeProduto;
	
	@AndroidFindBy(accessibility = "product-price")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelPrecoProduto;
	
	@AndroidFindBy(accessibility = "6-unit-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoSeisUnidades;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"add-to-checkout\"]/android.widget.TextView[2]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelTotalCompraProduto;
	
	@AndroidFindBy(accessibility = "add-to-checkout")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoAdicionar;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"plus-button\"]/android.widget.TextView")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoIncrementarUnidade;
	
	

	
	
	

}
