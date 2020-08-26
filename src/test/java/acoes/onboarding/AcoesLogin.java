package acoes.onboarding;

import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.onboarding.TelaLogin;

public class AcoesLogin extends TelaLogin {

	public AcoesLogin(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void efetuarLogin() {
		Utils.aguardarElementoVisivel(botaoEntrarConta);
		botaoEntrarConta.click();
		Utils.aguardarElementoVisivel(campoEmail);
		campoEmail.sendKeys("");
		campoSenha.sendKeys("");
		botaoEntrar.click();
		Utils.log("Login efetuado!");
	}

}
