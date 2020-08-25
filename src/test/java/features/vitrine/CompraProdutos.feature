# language: pt
# encoding: ISO-8859-1

Funcionalidade: Realizar compra de produtos no aplicativo do Ze
Para finalizar uma compra
Como usuário
Eu quero comprar alguns produtos

@2021    
Cenário: Verificar a desistencia da compra de produtos e cancelamento da sacola.
Dado que estou logado no aplicativo do Ze  
E que realizo a pesquisa do produto "Heineken"  
E seleciono o item "Heineken 330ml" da lista
Quando efetuo a compra de seis unidades do produto
E valido a sacola de produtos
Entao desisto dos produtos e limpo a sacola

@2022    
Cenário: Verificar a finalização da compra de produtos
Dado que estou logado no aplicativo do Ze  
E que realizo a pesquisa do produto "Becks"  
E seleciono o item "Becks 330ml" da lista
Quando efetuo a compra de 4 unidades do produto
E valido a sacola de produtos
Entao finalizo a compra

    
