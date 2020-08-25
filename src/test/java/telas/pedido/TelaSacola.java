package telas.pedido;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaSacola extends TelaApp {

	public TelaSacola(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "product-card-title")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelNomeProduto;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"product-card-price\"]/android.widget.TextView[2]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelPrecoProduto;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@content-desc,\"amount\")]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelQtdProduto;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"delivery-DELIVERY\"]/android.widget.TextView[3]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelCep;
	
	@AndroidFindBy(accessibility = "subtotal")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelSubtotal;
	
	@AndroidFindBy(accessibility = "shipping-price")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelFrete;
	
	@AndroidFindBy(accessibility = "total-price")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelTotal;
	
	@AndroidFindBy(accessibility = "checkout-action-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoFormaPagamento;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"delete-product\"]/android.widget.TextView")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoLimparSacola;
	
	@AndroidFindBy(accessibility = "primary-modal-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoConfirmacaoLimparSacola;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelSacolaVazia;
	
}
