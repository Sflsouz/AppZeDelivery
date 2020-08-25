package telas.perfil;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaDadosPerfil extends TelaApp{

	public TelaDadosPerfil(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "orders-card")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  opcaoMeusPedidos;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Go Back\"]/android.widget.TextView")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoVoltar;
	
	@AndroidFindBy(accessibility = "logout-card")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  opcaoSair;
	

}
