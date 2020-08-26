# language: pt
# encoding: ISO-8859-1

@TestAPI
Funcionalidade: Variação do clima

@TestAPI001
Cenário: Verificar a API de clima se o main está de acordo com a descricao do clima
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api é 200
Entao o campo "weather.main" está com o valor "Clear"
E o campo "weather.description" está com o valor "céu limpo"

@TestAPI00212
Cenário: Verificar a API de clima temperatura minima está abaixo ou igual a temperatura atual
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api é 200
Entao a temperatura está "abaixo ou igual" a temperatura atual

@TestAPI003122
Cenário: Verificar a API de clima temperatura maxima está acima ou igual a temperatura atual
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api é 200
Entao a temperatura está "acima ou igual" a temperatura atual

@Test
Cenário: Verificar a API de clima se o nome enviado no Parametro está de acordo com a resposta
Dado executo a API de clima da cidade "Cotia" na unidade "metric"
E o status de retorno da api é 200
Entao o nome da cidade está igual ao valor enviado

#Testes Negativos
@TestAPI003
Cenário: Verificar a API de clima com APIKEY invalido
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com APIKEY invalido
E o status de retorno da api é 401
Entao a mensagem retornada é "Invalid API key. Please see http://openweathermap.org/faq#error401 for more info."

@TestAPI004
Cenário: Verificar a API de clima a busca de uma cidade invalida
Dado executo a API de clima da cidade "BRTYT,br" na unidade "metric"
E o status de retorno da api é 404
Entao a mensagem retornada é "city not found"

@TestAPI005
Cenário: Verificar a API de clima com a rota invalida
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com rota invalida
E o status de retorno da api é 404
Entao a mensagem retornada é "Internal error"

@TestAPI006
Cenário: Verificar a API de clima com metodo invalido
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com metodo invalido
E o status de retorno da api é 405
Entao a mensagem retornada é "Internal error"

@TestAPI007
Cenário: Verificar a API de clima com parametro invalido
Dado executo a API de clima da cidade "Cotia" na unidade "metric" com parametro invalido
E o status de retorno da api é 400
Entao a mensagem retornada é "Nothing to geocode"