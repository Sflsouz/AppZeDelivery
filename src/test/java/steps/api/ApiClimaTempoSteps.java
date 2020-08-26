package steps.api;

import acoes.api.AcoesAPI;
import io.cucumber.java.pt.*;

public class ApiClimaTempoSteps {

	AcoesAPI api = new AcoesAPI();
	
	@Dado("executo a API de clima da cidade {string} na unidade {string}")
	public void executo_api_clima_cidade_unidade(String cidade, String unidade){
		api.executarAPIclima(cidade, unidade);
	}
	
	@Dado("executo a API de clima da cidade {string} na unidade {string} com APIKEY invalido")
	public void executo_api_clima_cidade_unidade_APIKEY_invalido(String cidade, String unidade){
		api.executarAPIclimaAPIKEYInvalido(cidade, unidade);
	}
	
	@Dado("executo a API de clima da cidade {string} na unidade {string} com rota invalida")
	public void executo_api_clima_cidade_unidade_rota_invalida(String cidade, String unidade){
		api.executarAPIclimaRotaInvalida(cidade, unidade);
	}
	
	@Dado("executo a API de clima da cidade {string} na unidade {string} com metodo invalido")
	public void executo_api_clima_cidade_unidade_metodo_invalido(String cidade, String unidade){
		api.executarAPIclimaMetodoInvalido(cidade, unidade);
	}
	
	@Dado("executo a API de clima da cidade {string} na unidade {string} com parametro invalido")
	public void executo_api_clima_cidade_unidade_parametro_invalido(String cidade, String unidade){
		api.executarAPIclimaParametroInvalido(cidade, unidade);
	}
	
	@E("o status de retorno da api é {int}")
	public void valido_se_o_status_é(int status) {
       api.validarStatus(status);
	}
	
	@Entao("o campo {string} está com o valor {string}")
	public void campo_esta_com_valor(String campo, String valor) {
	   api.verificarInfoCampo(campo, valor);
	}
	
	@Entao("a temperatura está {string} a temperatura atual")
	public void temeratura_esta_temperatura_atual(String param) {
	   if(param.contains("abaixo")) {
		   api.validarTemperaturaMin();
	   }else {
		   api.validarTemperaturaMax();
	   }
	}
	
	@Entao("a mensagem retornada é {string}")
	public void verifico_se_a_mensagem_é(String message) {
	   api.verificarMsgRetornada(message);
	}
	
	@Entao("o nome da cidade está igual ao valor enviado")
	public void nome_da_cidade_esta_igual_valor_enviado() {
	   api.validarNomeCidade();
	}
}
