package telas.vitrine;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaVitrineProdutos extends TelaApp {

	public TelaVitrineProdutos(AppiumDriver<MobileElement> driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open-search\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
	@iOSXCUITFindBy(id = "x")
	public MobileElement botaoPesquisa;
	
	@AndroidFindBy(accessibility = "edit-profile")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoPerfil;
	
	@AndroidFindBy(accessibility = "category-menu-Cervejas")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  caterogiaCervejas;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"menu-edit-address\"]/android.widget.TextView[2]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  labelCep;
}
