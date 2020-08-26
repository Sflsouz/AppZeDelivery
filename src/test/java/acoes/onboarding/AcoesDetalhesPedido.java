package acoes.onboarding;

import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.onboarding.TelaDetalhesPedido;

public class AcoesDetalhesPedido extends TelaDetalhesPedido {

	public AcoesDetalhesPedido(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clicoNoBotaoVerProdutos() {
		Utils.aguardarElementoVisivel(botaoVerProdutos);
		botaoVerProdutos.click();
	}
}
