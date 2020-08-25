package steps.vitrine;

import acoes.vitrine.AcoesPesquisaProdutos;
import acoes.vitrine.AcoesVitrineProdutos;
import aplicacao.Hooks;
import io.cucumber.java.pt.*;


public class VitrineSteps {
	
	AcoesVitrineProdutos vitrineProdutos = new AcoesVitrineProdutos(Hooks.driver);
	AcoesPesquisaProdutos pesquisaProdutos = new AcoesPesquisaProdutos(Hooks.driver);
	
	@E("que realizo a pesquisa do produto {string}")
	public void que_realizo_a_pesquisa_do_produto(String texto) throws Exception {
		vitrineProdutos.validarCep();
		vitrineProdutos.clicarBotaoPesquisaProduto();
		pesquisaProdutos.preencherPesquisaProduto(texto);
	}
	
	@E("seleciono o item {string} da lista")
	public void seleciono_o_item_lista(String texto) {
		pesquisaProdutos.selecionarProdutoPesquisa(texto);
	}

}
