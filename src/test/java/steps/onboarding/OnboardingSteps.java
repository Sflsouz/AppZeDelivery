package steps.onboarding;

import acoes.onboarding.AcoesDetalhesPedido;
import acoes.onboarding.AcoesEndereco;
import acoes.onboarding.AcoesIntroducao;
import acoes.onboarding.AcoesLogin;
import aplicacao.Hooks;
import io.cucumber.java.pt.*;

public class OnboardingSteps {

	AcoesIntroducao intro = new AcoesIntroducao(Hooks.driver);
	AcoesLogin login = new AcoesLogin(Hooks.driver);
	AcoesEndereco end = new AcoesEndereco(Hooks.driver);
	AcoesDetalhesPedido detalhes = new AcoesDetalhesPedido(Hooks.driver);
	
	@Dado("que efetuo login no aplicativo do Ze")
	public void executo_api_clima_cidade_unidade() throws InterruptedException{
		intro.clicarBotaoIntroducao();
		login.efetuarLogin();
		end.preencherEndereco();
		detalhes.clicoNoBotaoVerProdutos();
	}
}