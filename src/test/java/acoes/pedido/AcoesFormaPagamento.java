package acoes.pedido;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import aplicacao.Hooks;
import apoio.Contexto;
import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import telas.pedido.TelaFormaPagamento;

public class AcoesFormaPagamento extends TelaFormaPagamento {

	private String acao = "Forma de Pagamento";
	
	public AcoesFormaPagamento(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void desistirCompra() {
		Utils.aguardarElementoVisivel(opcaoCartaoCredito);
		opcaoCartaoCredito.click();
		botaoFinalizarCompra.click();
		PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver), this);
		Utils.aguardarElementoVisivel(botaoFechar);
		botaoFechar.click();
		Utils.aguardarElementoVisivel(botaoVoltar);
		botaoVoltar.click();
		Utils.log(acao+ " : Desistindo da Compra!");
	}
	
	public void finalizarCompra() throws Exception {
		Utils.aguardarElementoVisivel(opcaoCartaoCredito);
		opcaoCartaoCredito.click();
		Contexto.opcaoPagamento = opcaoCartaoCredito.getText();
		botaoFinalizarCompra.click();
		Utils.log(acao+ " : Opção de pagamento escolhida");
		ConfirmarCompra();
		
	}
	
	public void ConfirmarCompra() throws Exception {
		PageFactory.initElements(new AppiumFieldDecorator(Hooks.driver), this);
		Utils.aguardarElementoVisivel(labelSubtotal);
		validarCep();
		validarOpcaoPagamento();
		validarSubtotal();
		validarTotal();
	    botaoConfirmarFinalizarCompra.click();

	}
	
	public void validarOpcaoPagamento() throws Exception {
		String opcao = opcaoCartaoCredito.getText();
		assertEquals("Opcao está diferente da escolhida!", Contexto.opcaoPagamento,opcao);
		Utils.log(acao + ": Opcao de pagamento Validado");
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
