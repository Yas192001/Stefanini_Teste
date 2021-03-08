package pages;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Metodos {
	
	public static WebDriver driver;
	/** 
	 * escolher navegador e escolher site
	 * @author Yasmin Meireles
	 * @param abrir navegador
	 * @throws IOException
	 * 
	 */	

	public void abrirNavegador(String appUrl, String navegador, String descricaoPasso) throws IOException {

		 try {
		if (navegador == "CHROME" || navegador == "FIREFOX") {
		if (navegador == "CHROME") {

		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		} else if (navegador == "FIREFOX") {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

		 }

		 } else {
		System.out.println("Opção inválida escolha CHROME ou FIREFOX");
		}

		 } catch (Exception e) {
		Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
		screnShoot(descricaoPasso);

		 }

		 }
	
	/**
	* preencher
	*
	* @author Yasmin Meireles 
	* @param preecher elemento
	* @throws IOException
	*
	*/
	public void preencher(By elemento, String texto, String descricaoPasso) throws IOException {
	try {

	 driver.findElement(elemento).sendKeys(texto);

	 } catch (Exception e) {
	Assert.fail(LocalDateTime.now() + " -- erro ao tentar " + descricaoPasso);
	screnShoot(descricaoPasso);

	 }
	}

	 /**
	* clicar
	*
	* @author Yasmin Meireles
	* @param clicar no elemento
	* @throws IOException
	*/
	
	
	public void clicar(By elemento, String descricaoPasso) throws IOException {
	try {
	driver.findElement(elemento).click();
	} catch (Exception e) {
	Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
	screnShoot(descricaoPasso);

	 }
	}

	 /**
	* submit
	*
	* @author Yasmin Meireles
	* @param submit no elemento
	* @throws IOException
	*/
	public void submit(By elemento, String descricaoPasso) throws IOException {
	try {
	driver.findElement(elemento).submit();
	} catch (Exception e) {
	Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
	screnShoot("erros/" + descricaoPasso);
	}
	}

	 /**
	* tirar foto
	*
	* @author Yasmin Meireles
	* @param screenshot
	*/
	public void screnShoot(String nome) throws IOException {

	 TakesScreenshot scrShot = ((TakesScreenshot) driver);
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile = new File("./src/evidencias/" + nome + ".png");
	FileUtils.copyFile(SrcFile, DestFile);
	}

	 /**
	* fechar browser
	*
	* @author Yasmin Meireles
	* @param fechar
	* @throws IOException
	*/

	 public void fecharBrowser(String descricaoPasso) throws IOException {
	try {
	driver.quit();
	} catch (Exception e) {
	Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
	screnShoot(descricaoPasso);

	 }
	}
}
