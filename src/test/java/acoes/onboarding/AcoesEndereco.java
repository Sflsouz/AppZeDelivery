package acoes.onboarding;

import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.onboarding.TelaEndereco;

public class AcoesEndereco extends TelaEndereco {

	public AcoesEndereco(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void preencherEndereco() {
		Utils.aguardarElementoVisivel(campoPesquisaEndereco);
		campoPesquisaEndereco.sendKeys("Rua Renato Paes de Barros, 1017");
		Utils.aguardarElementoVisivel(primeiroEnderecoLista);
		primeiroEnderecoLista.click();
		Utils.aguardarElementoVisivel(iconeTrabalho);
		campoComplemento.sendKeys("3 Andar");
		iconeTrabalho.click();
		botaoContinuar.click();
		Utils.log("Endereco Preenchido!");

	}
}
