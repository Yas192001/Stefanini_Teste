$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stefanini.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 3,
      "value": "#Author: oliveiraysa@2gmail.com"
    }
  ],
  "line": 6,
  "name": "Cadastrar Usuario",
  "description": "Eu como usuario desejo acessar o site para realizar cadastro",
  "id": "cadastrar-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 5,
      "name": "@executa"
    }
  ]
});
formatter.background({
  "line": 10,
  "name": "Acessar o site para cadastrar usuario",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 11,
  "name": "que eu esteja no site \"http://prova.stefanini-jgr.com.br/teste/qa/\" para cadastrar um novo usuario",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "http://prova.stefanini-jgr.com.br/teste/qa/",
      "offset": 23
    }
  ],
  "location": "Steps.que_eu_esteja_no_site_para_cadastrar_um_novo_usuario(String)"
});
formatter.result({
  "duration": 6650274500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Realizar cadastro de usuario",
  "description": "",
  "id": "cadastrar-usuario;realizar-cadastro-de-usuario",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 15,
  "name": "informar os dados do usuario",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "o usuario cadastrado",
  "keyword": "Entao "
});
formatter.match({
  "location": "Steps.informar_os_dados_do_usuario()"
});
formatter.result({
  "duration": 1245873800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.o_usuario_cadastrado()"
});
formatter.result({
  "duration": 1252223300,
  "status": "passed"
});
});