package acoes.pedido;

import apoio.Contexto;
import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.pedido.TelaConfirmacaoCompraProduto;

public class AcoesConfirmacaoCompraProduto extends TelaConfirmacaoCompraProduto {

	public AcoesConfirmacaoCompraProduto(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private String acao = "Confirmacao Compra Produto";

	public void validarConfirmacaoCompraProdutos() throws Exception {
		Utils.aguardarElementoVisivel(labelQtdProdutos);
		validarQtdProduto();
		validarTotalProduto();
		botaoVerSacola.click();
	}

	public void validarQtdProduto() throws Exception {
		float qtd = Utils.converterStringFloat(labelQtdProdutos.getText());
		if (Contexto.qtdProduto == qtd) {
			Utils.log(acao +": Quandidade de Produtos validados.");
		} else {
			throw new Exception(acao + " : Esperado: " + Contexto.qtdProduto + " : Recebido: "+ qtd);
		}
	}

	public void validarTotalProduto() throws Exception {
		Contexto.totalPedido = Utils.converterStringFloat(labelTotalProdutos.getText());
		float total = Contexto.qtdProduto * Contexto.precoProduto;
		if (Contexto.totalPedido == total) {
			Utils.log(acao +": Total dos Produtos validado.");
		} else {
			throw new Exception(acao + " : Esperado: " + total + " : Recebido: "+ Contexto.totalPedido);
		}
	}
}
