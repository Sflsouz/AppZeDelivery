# Automação AppZeDelivery
#Automação Mobile Android Realizada na Linguagem JAVA/Eclipse com Cucumber - - Desenvolvida por sflsouz

# Preparação Ambiente

*Instalação
Para Executar a automação será necessário a instalação das seguintes ferramentas:
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
   
 # Configurações Projeto
 - O projeto possui um arquivo properties, onde é necessário passar algums informações para execução do projeto
  properties.plataforma = Android
  properties.apiKey = chaveAPIClima
  properties.email = email@email.com
  properties.senha = password  
  
  - plataforma - Pode receber parametro "Android" para exeucução dos Testes Mobile,ou "API" para execução dos testes de serviço
  - apiKey - Deve ser passado a Key da API de clima para execução
  - email - Deve ser passado o email, caso queira logar no app
  - senha - Deve ser passado o senha, caso queira logar no app
  
  As capabilites são configuradas no arquivo Android.json no projeto.
  
 # Entendimento do Projeto
 
  Necessário que o aplicativo do Zé já esteja instalado no aparelho Simulador, ou Device fisico.
  O projeto também possui uma pasta evidências onde são armazenados os prints do cenarios que falharam.
  Um arquivo de log é gerado no caminho C:\Users\Public - log4j-application.log
  
  Foram criados 3 Cenários de Tentativa de compra para Android na Feature CompraProdutos.feature
  Como o Ambiente é de produção, nenhum dos cenários efetivam a compra.
 
 @TestAPP001  
 Cenário: Verificar a desistencia da compra de produtos e limpeza da sacola com usuário logado.
 
 @TestAPP002
 Cenário: Verificar ao logar a desistencia da compra de produtos e limpeza da sacola.

 @TestAPP003   
 Cenário: Verificar a finalização da compra de produtos
 
 Obs.: para Executar o Cenário TestAPP002, que faz o login antes de efetuar a compra, é necessário alterar a capabilites "noReset"  para false
 para o aplicativo abrir sem cache.
 
 Para os Cenarios de API de clima, foram criados 9 Cenários na feature ApiClimaTempo.
 
 Obrigado! Bons testes!
