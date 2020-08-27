package acoes.pedido;

import static org.junit.Assert.assertEquals;

import apoio.Contexto;
import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import telas.pedido.TelaSacola;

public class AcoesSacola extends TelaSacola {

	private String acao = "Sacola";

	public AcoesSacola(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void validarPedidoSacola() throws Exception {
		Utils.aguardarElementoVisivel(labelNomeProduto);
		validarNomeProduto();
		validarPrecoProduto();
		validarQtdProduto();
		validarCep();
		Utils.scroll(0.8, 0.2);
		validarSubtotal();
		validarTotal();
		botaoFormaPagamento.click();

	}

	public void limparSacola() throws InterruptedException {
		Utils.aguardarElementoVisivel(labelSubtotal);
		Utils.aguardarElementoVisivel(labelTotal);
		Utils.scroll(0.2,0.5);
		Utils.aguardarElementoVisivel(labelNomeProduto);
		botaoLimparSacola.click();
		botaoConfirmacaoLimparSacola.click();
		Utils.log(acao + ": Excluindo Produtos");
		Utils.aguardarSegundos(2);
		Utils.aguardarElementoVisivel(labelSacolaVazia);
		assertEquals("Putz, está vazia!", labelSacolaVazia.getText());
	}

	public void validarNomeProduto() {
		String texto = labelNomeProduto.getText();
		assertEquals("Nome do Produto diferente da compra", Contexto.nomeProduto, texto);
		Utils.log(acao + ": Nome do produto validado");
	}

	public void validarPrecoProduto() throws Exception {
		float preco = Utils.converterStringFloat(labelPrecoProduto.getText());
		if (Contexto.precoProduto == preco) {
			Utils.log(acao + ": Preco do produto validado");
		} else {
			throw new Exception(acao + " : Esperado: " + Contexto.precoProduto + " : Recebido: "+ preco);
		}
	}

	public void validarQtdProduto() throws Exception {
		float qtd = Utils.converterStringFloat(labelQtdProduto.getText());
		if (Contexto.qtdProduto == qtd) {
			Utils.log(acao + ": Quantidade de Produtos validado");
		} else {
			throw new Exception(acao + " : Esperado: " + Contexto.qtdProduto + " : Recebido: "+ qtd);
		}
	}
	public void validarCep() throws Exception {
		String cep = labelCep.getText().replace("\n", " ");
		assertEquals("Cep está diferente do cadastrado!", Contexto.Cep,cep);
		Utils.log(acao + ": Cep Validado");
	}

	public void validarSubtotal() throws Exception {
		float subtotal = Utils.converterStringFloat(labelSubtotal.getText());
		if (Contexto.totalPedido == subtotal) {
			Utils.log(acao + ": Subtotal validado");
		} else {
			throw new Exception(acao + " : Esperado: " + Contexto.totalPedido + " : Recebido: "+ subtotal);
		}
	}

	public void validarTotal() throws Exception {
		float frete = Utils.converterStringFloat(labelFrete.getText());
		float subtotal = Utils.converterStringFloat(labelSubtotal.getText());
		float total = Utils.converterStringFloat(labelTotal.getText());
		String soma = Utils.arredondarPraCima(subtotal +frete).replaceAll(",", ".");
		if (String.valueOf(total).equals(soma)) {
			Utils.log(acao + ": Total validado");
		} else {
			throw new Exception(acao + " : Esperado: " + soma + " : Recebido: "+ total);
		}
	}
}
