$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/vitrine/CompraProdutos.feature");
formatter.feature({
  "name": "Realizar compra de produtos no aplicativo do Ze",
  "description": "Para finalizar uma compra\nComo usuário\nEu quero comprar alguns produtos",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Verificar a desistencia da compra de produtos e cancelamento da sacola.",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@TestAPP001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que estou logado no aplicativo do Ze",
  "keyword": "Dado "
});
formatter.match({
  "location": "PerfilSteps.que_estou_logado_aplicavo_Ze()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que realizo a pesquisa do produto \"Heineken\"",
  "keyword": "E "
});
formatter.match({
  "location": "VitrineSteps.que_realizo_a_pesquisa_do_produto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o item \"Heineken 330ml\" da lista",
  "keyword": "E "
});
formatter.match({
  "location": "VitrineSteps.seleciono_o_item_lista(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "efetuo a compra de seis unidades do produto",
  "keyword": "Quando "
});
formatter.match({
  "location": "PedidosSteps.compra_seis_unidades_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido a sacola de produtos",
  "keyword": "E "
});
formatter.match({
  "location": "PedidosSteps.valido_sacola_produtos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "desisto dos produtos e limpo a sacola",
  "keyword": "Entao "
});
formatter.match({
  "location": "PedidosSteps.desisto_dos_produtos_limpo_sacola()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});