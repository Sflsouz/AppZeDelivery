package telas.onboarding;

import aplicacao.TelaApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TelaLogin extends TelaApp{

	public TelaLogin(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(accessibility = "already-have-an-account")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoEntrarConta;
	
	@AndroidFindBy(accessibility = "email")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  campoEmail;
	
	@AndroidFindBy(accessibility = "password")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  campoSenha;
	
	@AndroidFindBy(accessibility = "enter")
	@iOSXCUITFindBy(id = "x")
	public MobileElement  botaoEntrar;
}
