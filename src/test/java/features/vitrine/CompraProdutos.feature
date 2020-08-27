# language: pt
# encoding: ISO-8859-1

Funcionalidade: Realizar compra de produtos no aplicativo do Ze
Para finalizar uma compra
Como usu�rio
Eu quero comprar alguns produtos

@TestAPP001  
Cen�rio: Verificar a desistencia da compra de produtos e limpeza da sacola com usu�rio logado.
Dado que estou logado no aplicativo do Ze  
E que realizo a pesquisa do produto "Heineken"  
E seleciono o item "Heineken 330ml" da lista
Quando efetuo a compra de seis unidades do produto
E valido a sacola de produtos
Entao desisto dos produtos e limpo a sacola

@TestAPP002
Cen�rio: Verificar ao logar a desistencia da compra de produtos e limpeza da sacola.
Dado que efetuo login no aplicativo do Ze
E que estou logado no aplicativo do Ze 
E que realizo a pesquisa do produto "Becks"  
E seleciono o item "Becks 330ml" da lista
Quando efetuo a compra de 4 unidades do produto
E valido a sacola de produtos
Entao desisto dos produtos e limpo a sacola 

@TestAPP003   
Cen�rio: Verificar a finaliza��o da compra de produtos
Dado que estou logado no aplicativo do Ze  
E que realizo a pesquisa do produto "Becks"  
E seleciono o item "Becks 330ml" da lista
Quando efetuo a compra de 4 unidades do produto
E valido a sacola de produtos
Entao finalizo a compra


    
