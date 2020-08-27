package acoes.vitrine;

import apoio.Contexto;
import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.vitrine.TelaVitrineProdutos;

public class AcoesVitrineProdutos extends TelaVitrineProdutos{

	private String acao = "Vitrine Produtos";
	
	public AcoesVitrineProdutos(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void clicarBotaoPesquisaProduto() {
		Utils.aguardarElementoVisivel(botaoPesquisa);
		botaoPesquisa.click();
		Utils.log(acao +": Clique no botão de Pesquisa");
	}
	
	public void validarCep() {
		Utils.aguardarElementoVisivel(labelCep);
		Contexto.Cep=labelCep.getText();
	}
	
	public void clicarBotaoPerfil() {
		Utils.aguardarElementoVisivel(caterogiaCervejas);
		botaoPerfil.click();
		Utils.log(acao +": Clique no botão Perfil");
	}
	
	public void validarPopUp() {
		try {
			Utils.aguardarElementoVisivel(botaoPopUp,5);
			botaoPopUp.click();
		} catch (Exception e) {
			Utils.log(acao +": Sem PopUp Desconto");
		}
		
	}

}
