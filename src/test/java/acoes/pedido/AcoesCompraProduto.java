package acoes.pedido;

import static org.junit.Assert.assertEquals;

import apoio.Contexto;
import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.pedido.TelaCompraProduto;

public class AcoesCompraProduto extends TelaCompraProduto {

	private String acao = "Compra Produto";
	
	public AcoesCompraProduto(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void efetuarCompraProdutoSeisUnidades() throws Exception {
		Utils.aguardarElementoVisivel(labelNomeProduto);
		validarNomeProduto();
		Contexto.precoProduto = Utils.converterStringFloat(labelPrecoProduto.getText());
		Contexto.qtdProduto = 6;
		botaoSeisUnidades.click();
		validarTotalProduto();
		botaoAdicionar.click();
		Utils.log(acao +": Produtos adicionados com sucesso.");
		
	}
	
	public void efetuarCompraProduto(int unidades) throws Exception {
		Utils.aguardarElementoVisivel(labelNomeProduto);
		validarNomeProduto();
		Contexto.precoProduto = Utils.converterStringFloat(labelPrecoProduto.getText());
		Contexto.qtdProduto = unidades;
		incrementarUnidade(unidades);
		validarTotalProduto();
		botaoAdicionar.click();
		Utils.log(acao +": Produtos adicionados com sucesso.");
		
	}
	
	public void incrementarUnidade(int unidades) {
		for(int i = 2; i<=unidades;i++) {
			botaoIncrementarUnidade.click();
		}
	}
	public void validarNomeProduto() {
		String nomeProd = labelNomeProduto.getText();
		assertEquals("Nome do produto está diferente da lista",Contexto.nomeProduto, nomeProd);
		Utils.log(acao +": Nome de Produto validado.");
	}
	
	public void validarTotalProduto() throws Exception {
		Contexto.totalPedido = Utils.converterStringFloat(labelTotalCompraProduto.getText());
		float total = Contexto.qtdProduto*Contexto.precoProduto;
		if(Contexto.totalPedido == total) {
			Utils.log(acao +": Total dos Produtos validado.");
		}else {
		throw new Exception(acao +": Total dos produtos está incorreto!");
		}
	}
}
