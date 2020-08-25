package steps.pedido;

import acoes.pedido.AcoesCompraProduto;
import acoes.pedido.AcoesConfirmacaoCompraProduto;
import acoes.pedido.AcoesFormaPagamento;
import acoes.pedido.AcoesSacola;
import aplicacao.Hooks;
import io.cucumber.java.pt.*;

public class PedidosSteps {
	AcoesCompraProduto compraProduto = new AcoesCompraProduto(Hooks.driver);
	AcoesConfirmacaoCompraProduto confirmacaoCompraProduto = new AcoesConfirmacaoCompraProduto(Hooks.driver);
	AcoesSacola sacola = new AcoesSacola(Hooks.driver);
	AcoesFormaPagamento formaPagamento = new AcoesFormaPagamento(Hooks.driver);

	@Quando("efetuo a compra de seis unidades do produto")
	public void compra_seis_unidades_produto() throws Exception {
		compraProduto.efetuarCompraProdutoSeisUnidades();
		confirmacaoCompraProduto.validarConfirmacaoCompraProdutos();
	}
	
	@Quando("efetuo a compra de {int} unidades do produto")
	public void compra_unidades_produto(int unidades) throws Exception {
		compraProduto.efetuarCompraProduto(unidades);
		confirmacaoCompraProduto.validarConfirmacaoCompraProdutos();
	}

	@E("valido a sacola de produtos")
	public void valido_sacola_produtos() throws Exception {
		sacola.validarPedidoSacola();
	}

	@Entao("desisto dos produtos e limpo a sacola")
	public void desisto_dos_produtos_limpo_sacola() throws Exception {
		formaPagamento.desistirCompra();
		sacola.limparSacola();
	}
	
	@Entao("finalizo a compra")
	public void finalizo_a_compra() throws Exception {
		formaPagamento.finalizarCompra();

	}
}
