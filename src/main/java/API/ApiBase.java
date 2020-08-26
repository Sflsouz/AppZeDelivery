package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiBase {

	private RequestSpecification request;
	
	public void addHeaderParam(String key, String value) {
		request.header(key,value);
	}
	
	public void addQueryParam(String key, String value) {
		request.queryParam(key,value);
	}
	
	public void setUrl(String url) {
		RestAssured.baseURI = url;
		request = RestAssured.given();
		request.relaxedHTTPSValidation();	
		
	}
	
	public Response enviarRequisicao(String metodo) {
		switch (metodo) {
		case "POST":
	       return request.post();
		case "GET":
		       return request.get();
		case "PUT":
		       return request.put();
		default:
			return request.get();
		}
	}
	 
	public String getValorJson(Response response ,String key) {
		return response.jsonPath().getString(key);
	}
	
	public int getStatusResponse(Response response) {
		int status = response.getStatusCode();
		return status;
	}
	
	public String responseAPI(Response response) {
		return response.asString();
	}
	
}
