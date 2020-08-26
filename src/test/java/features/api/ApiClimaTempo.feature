# language: pt
# encoding: ISO-8859-1

@TestAPI
Funcionalidade: Varia��o do clima

@TestAPI001
Cen�rio: Verificar a API de clima se o main est� de acordo com a descricao do clima
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api � 200
Entao o campo "weather.main" est� com o valor "Clear"
E o campo "weather.description" est� com o valor "c�u limpo"

@TestAPI00212
Cen�rio: Verificar a API de clima temperatura minima est� abaixo ou igual a temperatura atual
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api � 200
Entao a temperatura est� "abaixo ou igual" a temperatura atual

@TestAPI003122
Cen�rio: Verificar a API de clima temperatura maxima est� acima ou igual a temperatura atual
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api � 200
Entao a temperatura est� "acima ou igual" a temperatura atual

@Test
Cen�rio: Verificar a API de clima se o nome enviado no Parametro est� de acordo com a resposta
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api � 200
Entao o nome da cidade est� igual ao valor enviado

#Testes Negativos
@TestAPI003
Cen�rio: Verificar a API de clima com APIKEY invalido
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com APIKEY invalido
E o status de retorno da api � 401
Entao a mensagem retornada � "Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."

@TestAPI004
Cen�rio: Verificar a API de clima a busca de uma cidade invalida
Dado executo a API de clima da cidade "BRTYT,br" na unidade "metric"
E o status de retorno da api � 404
Entao a mensagem retornada � "city not found"

@TestAPI005
Cen�rio: Verificar a API de clima com a rota invalida
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com rota invalida
E o status de retorno da api � 404
Entao a mensagem retornada � "Internal error"

@TestAPI006
Cen�rio: Verificar a API de clima com metodo invalido
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com metodo invalido
E o status de retorno da api � 405
Entao a mensagem retornada � "Internal error"

@TestAPI007
Cen�rio: Verificar a API de clima com parametro invalido
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com parametro invalido
E o status de retorno da api � 400
Entao a mensagem retornada � "Nothing to geocode"