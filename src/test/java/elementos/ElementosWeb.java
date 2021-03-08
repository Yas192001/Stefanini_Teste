package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By name = By.id("name");
	private By email = By.id("email");
	private By password = By.id("password");
	private By register = By.xpath("/html/body/div/div/div/div[2]/form/button");
	
	

	public By getName() {
		return name;
	}



	public By getEmail() {
		return email;
	}



	public By getPassword() {
		return password;
	}



	public By getRegister() {
		return register;
	}


}
