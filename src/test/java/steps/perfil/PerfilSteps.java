package steps.perfil;

import acoes.perfil.AcoesDadosPerfil;
import acoes.vitrine.AcoesVitrineProdutos;
import aplicacao.Hooks;
import io.cucumber.java.pt.Dado;

public class PerfilSteps {
	
	AcoesVitrineProdutos vitrineProdutos = new AcoesVitrineProdutos(Hooks.driver);
	AcoesDadosPerfil dadosPerfil = new AcoesDadosPerfil(Hooks.driver);
	
	@Dado("que estou logado no aplicativo do Ze")
	public void que_estou_logado_aplicavo_Ze() {
		vitrineProdutos.validarPopUp();
		vitrineProdutos.clicarBotaoPerfil();
		dadosPerfil.validarMeuPerfil();
	}

}
