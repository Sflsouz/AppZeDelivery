# Automa��o AppZeDelivery - Desenvolvida por sflsouz
# Automa��o Mobile Android Realizada na Linguagem JAVA/Eclipse com Cucumber

#Prepara��o Ambiente

*Instala��o
Para Executar a automa��o ser� necess�rio a instala��o das seguintes ferramentas:
- Eclipse
- Android Studio + SDK + Simulador Android 9.0
- Appium 1.15
- Node/js
- Java/Jdk8

*Variaveis de Ambiente
- Criar a Variavel - ANDROID_SDK_ROOT - C:\Users\nameUser\AppData\Local\Android\Sdk
- Criar a Variavel - JAVA_HOME - C:\Program Files\Java\jdk1.8.0_231
- Adicionar na variavel Path os caminhos
   -C:\Program Files\Java\jdk1.8.0_231\bin
   -C:\Users\nameUser\AppData\Local\Android\Sdk\platform-tools
   -C:\Program Files\nodejs\
   
 *Configura��es Projeto
 - O projeto possui um arquivo properties, onde � necess�rio passar algums informa��es para execu��o do projeto
  properties.plataforma = Android
  properties.apiKey = chaveAPIClima
  properties.email = email@email.com
  properties.senha = password  
  
  - plataforma - Pode receber parametro "Android" para exeucu��o dos Testes Mobile,ou "API" para execu��o dos testes de servi�o
  - apiKey - Deve ser passado a Key da API de clima para execu��o
  - email - Deve ser passado o email, caso queira logar no app
  - senha - Deve ser passado o senha, caso queira logar no app
  
  As capabilites s�o configuradas no arquivo Android.json no projeto.
  
 *Entendimento do Projeto
  Necess�rio que o aplicativo do Z� j� esteja instalado no aparelho Simulador, ou Device fisico.
  O projeto tamb�m possui uma pasta evid�ncias onde s�o armazenados os prints do cenarios que falharam.
  Um arquivo de log � gerado no caminho C:\Users\Public - log4j-application.log
  
  Foram criados 3 Cen�rios de Tentativa de compra para Android na Feature CompraProdutos.feature
  Como o Ambiente � de produ��o, nenhum dos cen�rios efetivam a compra.
 
 @TestAPP001  
 Cen�rio: Verificar a desistencia da compra de produtos e limpeza da sacola com usu�rio logado.
 
 @TestAPP002
 Cen�rio: Verificar ao logar a desistencia da compra de produtos e limpeza da sacola.

 @TestAPP003   
 Cen�rio: Verificar a finaliza��o da compra de produtos
 
 Obs.: para Executar o Cen�rio TestAPP002, que faz o login antes de efetuar a compra, � necess�rio alterar a capabilites "noRest"  para False
 para o aplicativo abrir sem cache.
 
 Para os Cenarios de API de clima, foram criados 9 Cen�rios na feature ApiClimaTempo.
 
 Obrigado! Bons testes!