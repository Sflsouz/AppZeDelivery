package acoes.vitrine;

import static org.junit.Assert.assertTrue;

import apoio.Contexto;
import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.vitrine.TelaPesquisaProdutos;

public class AcoesPesquisaProdutos extends TelaPesquisaProdutos {

	private String acao = "Pesquisa Produtos";
	
	public AcoesPesquisaProdutos(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void preencherPesquisaProduto(String texto) throws Exception {
		Utils.aguardarElementoVisivel(campoPesquisa);
		campoPesquisa.sendKeys(texto);
		Utils.log(acao +": Campo de pesquisa preenchido");
		try {
			Utils.aguardarElementoVisivel(primeiroItemLista);
		} catch (Exception e) {
			throw new Exception("Produto " +texto+ " não encontrado!");
		}
	}
	
	public void selecionarProdutoPesquisa(String texto) {
		boolean itemEncontrado = false;
		Utils.aguardarElementoVisivel(primeiroItemLista);
		Utils.fecharTeclado();
		for (MobileElement itens : listaProdutosPesquisa)
		{
			if(itens.getText().equals(texto)) {
				itens.click();
				Utils.log(acao +": Item " +texto+ " selecionado!");
				Contexto.nomeProduto = texto;
				itemEncontrado = true;
			}
		}
		assertTrue("Produto " +texto+ " não encontrado!",itemEncontrado);
	}
}
