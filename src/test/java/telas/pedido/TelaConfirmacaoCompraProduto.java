package telas.pedido;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaConfirmacaoCompraProduto extends TelaApp {

	public TelaConfirmacaoCompraProduto(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "number-products")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelQtdProdutos;
	
	@AndroidFindBy(accessibility = "total-price-products")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelTotalProdutos;
	
	@AndroidFindBy(accessibility = "place-an-order")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoVerSacola;

}
