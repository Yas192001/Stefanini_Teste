#language: pt

#Author: oliveiraysa@2gmail.com

@executa
Funcionalidade: Cadastrar Usuario
  Eu como usuario desejo acessar o site para realizar cadastro
  
  
  Contexto: Acessar o site para cadastrar usuario
  Dado que eu esteja no site "http://prova.stefanini-jgr.com.br/teste/qa/" para cadastrar um novo usuario
  
  
  Cenario: Realizar cadastro de usuario
   Quando informar os dados do usuario
   Entao o usuario cadastrado