package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

// Caminho das features

		features = "src/test/resources/features/",

		// Pacote das Class de Testes
		
		glue = "testes",

		// Nome da tag no arquivo gherkins para executar os casos de testes
		// correspondentes

		tags = "@executa",

		// Formatar visualização do código no console | report html

		plugin = { "pretty", "html:target/report.html" },

		// Valida se existem features sem steps implementados

		dryRun = false

)

public class Executar {

}
