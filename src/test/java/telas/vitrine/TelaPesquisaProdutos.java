package telas.vitrine;

import java.util.ArrayList;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaPesquisaProdutos  extends TelaApp {

	public TelaPesquisaProdutos(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	@AndroidFindBy(accessibility = "search-input")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  campoPesquisa;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"product-card-title\"])")
	@iOSXCUITFindBy(id = "x")
	public ArrayList<MobileElement>  listaProdutosPesquisa;
	
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"default-product-card\"])[1]")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  primeiroItemLista;
}
