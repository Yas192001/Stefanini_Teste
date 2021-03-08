package pages;

import java.io.IOException;

import elementos.ElementosWeb;

public class CadastrarUsuario {
	
	Metodos metodos = new Metodos();
	ElementosWeb ew = new ElementosWeb();
	
	
	public void cadastrarUser(String nome) throws IOException{
		
	metodos.preencher(ew.getName(), nome, "preenchendo campo nome");
	}
	
    public void cadastrarEmail(String email) throws IOException {
	 
    metodos.preencher(ew.getEmail(), email, "preenchendo campo email");
		
	} 


	public void cadastrarpassword(String passwword) throws IOException {
		metodos.preencher(ew.getPassword(), passwword, "preenchendo campo password");
		
	}
	
	public void clicar(Object string) throws IOException {
	metodos.clicar(ew.getRegister(), "clicando no botao registrar");
}
}
