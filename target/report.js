$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/api/ApiClimaTempo.feature");
formatter.feature({
  "name": "Variação do clima",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@TestAPI"
    }
  ]
});
formatter.scenario({
  "name": "Verificar a API de clima se o nome enviado no Parametro está de acordo com a resposta",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@TestAPI"
    },
    {
      "name": "@Test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "executo a API de clima da cidade \"Cotia\" na unidade \"metric\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "ApiClimaTempoSteps.executo_api_clima_cidade_unidade(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o status de retorno da api é 200",
  "keyword": "E "
});
formatter.match({
  "location": "ApiClimaTempoSteps.valido_se_o_status_é(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o nome da cidade está igual ao valor enviado",
  "keyword": "Entao "
});
formatter.match({
  "location": "ApiClimaTempoSteps.nome_da_cidade_esta_igual_valor_enviado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});