package testes;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.ElementosWeb;
import pages.CadastrarUsuario;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	ElementosWeb ew = new ElementosWeb();
	CadastrarUsuario c = new CadastrarUsuario();
	
	
	
	@Dado("^que eu esteja no site \"([^\"]*)\" para cadastrar um novo usuario$")
	public void que_eu_esteja_no_site_para_cadastrar_um_novo_usuario(String site) throws Throwable {
	   
		metodos.abrirNavegador(site, "CHROME", "acessando navegador");
	    
	}

	@Quando("^informar os dados do usuario$")
	public void informar_os_dados_do_usuario() throws Throwable {
	   c.cadastrarUser("Yasmin Meireles");
	   c.cadastrarEmail("oliveiraysa2@gmail.com");
	   c.cadastrarpassword("14112001#");
	   metodos.screnShoot("print");
	   c.clicar(null);
	}

	@Entao("^o usuario cadastrado$")
	public void o_usuario_cadastrado() throws Throwable {
	    
	 metodos.screnShoot("print2");

	 metodos.fecharBrowser("fechando navegador");
	}

	
	}


