package acoes.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import API.ApiBase;
import aplicacao.Setup;
import apoio.Contexto;
import apoio.Utils;
import io.restassured.response.Response;

public class AcoesAPI extends ApiBase {
	Response response;
	
	public void executarAPIclima(String cidade, String unidade) {
		Utils.log("Iniciando Testes API");
		Contexto.nomeCidadeAPI = cidade;
		setUrl("https://api.openweathermap.org/data/2.5/weather");
		addQueryParam("appid", Setup.getAPPID());
		addQueryParam("q", cidade);
		addQueryParam("lang", "pt_br");
		addQueryParam("units", unidade);
		response = enviarRequisicao("GET");
		Utils.log("Retorno api - " + responseAPI(response));
	}
	
	public void executarAPIclimaAPIKEYInvalido(String cidade, String unidade) {
		Utils.log("Iniciando Testes API");
		setUrl("https://api.openweathermap.org/data/2.5/weather");
		addQueryParam("appid", "12345");
		addQueryParam("q", cidade);
		addQueryParam("lang", "pt_br");
		addQueryParam("units", unidade);
		response = enviarRequisicao("GET");
		Utils.log("Retorno api - " + responseAPI(response));
	}
	
	public void executarAPIclimaRotaInvalida(String cidade, String unidade) {
		Utils.log("Iniciando Testes API");
		setUrl("https://api.openweathermap.org/data/2.5/weathe");
		addQueryParam("appid", Setup.getAPPID());
		addQueryParam("q", cidade);
		addQueryParam("lang", "pt_br");
		addQueryParam("units", unidade);
		response = enviarRequisicao("GET");
		Utils.log("Retorno api - " + responseAPI(response));
	}
	
	public void executarAPIclimaMetodoInvalido(String cidade, String unidade) {
		Utils.log("Iniciando Testes API");
		setUrl("https://api.openweathermap.org/data/2.5/weather");
		addQueryParam("appid", Setup.getAPPID());
		addQueryParam("q", cidade);
		addQueryParam("lang", "pt_br");
		addQueryParam("units", unidade);
		response = enviarRequisicao("PUT");
		Utils.log("Retorno api - " + responseAPI(response));
	}
	
	public void executarAPIclimaParametroInvalido(String cidade, String unidade) {
		Utils.log("Iniciando Testes API");
		setUrl("https://api.openweathermap.org/data/2.5/weather");
		addQueryParam("appid", Setup.getAPPID());
		addQueryParam("te", cidade);
		addQueryParam("lang", "pt_br");
		addQueryParam("units", unidade);
		response = enviarRequisicao("GET");
		Utils.log("Retorno api - " + responseAPI(response));
	}
	
	public void validarStatus(int status) {
		int statusRetorno = getStatusResponse(response);
		assertEquals("O status inválido",status,statusRetorno);
		Utils.log("O Status Code retornado é " + status);
	}
	
	public void verificarInfoCampo(String campo, String valor) {
		String valorJson = getValorJson(response, campo);
		assertEquals("["+valor+"]",valorJson);
	}
	
	public void verificarMsgRetornada(String message) {
		String valorJson = getValorJson(response, "message");
		assertEquals(message,valorJson);
	}
	
	public void validarNomeCidade() {
		String nomeCidade = getValorJson(response, "name");
		assertEquals(Contexto.nomeCidadeAPI,nomeCidade);
	}
	
	public void validarTemperaturaMin() {
		float temperaturaAtual = Utils.converterStringFloat(getValorJson(response, "main.temp"));
		float temperaturaMin =  Utils.converterStringFloat(getValorJson(response, "main.temp_min"));
		assertTrue("Temperatura minima maior que Atual ",temperaturaMin <= temperaturaAtual);	
	}
	
	public void validarTemperaturaMax() {
		float temperaturaAtual = Utils.converterStringFloat(getValorJson(response, "main.temp"));
		float temperaturaMin =  Utils.converterStringFloat(getValorJson(response, "main.temp_max"));
		assertTrue("Temperatura maxima menor que Atual ",temperaturaMin >= temperaturaAtual);
	}
	
}
