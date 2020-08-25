package telas.pedido;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaFormaPagamento extends TelaApp {

	public TelaFormaPagamento(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "payment-method-CREDIT_CARD")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  opcaoCartaoCredito;
	
	@AndroidFindBy(accessibility = "checkout-payment-action-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoFinalizarCompra;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Go Back\"]/android.widget.TextView")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoVoltar;
	
	@AndroidFindBy(accessibility = "checkout-payment-confirmation-modal-close")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoFechar;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"delivery-DELIVERY\"]/android.widget.TextView[3]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelCep;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"payment-method-card-CREDIT_CARD\"]/android.widget.TextView[2]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelCartao;
	
	@AndroidFindBy(accessibility = "subtotal")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelSubtotal;
	
	@AndroidFindBy(accessibility = "shipping-price")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelFrete;
	
	@AndroidFindBy(accessibility = "total-price")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelTotal;
	
	@AndroidFindBy(accessibility = "checkout-payment-confirmation-modal-action-button")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoConfirmarFinalizarCompra;
	

}
