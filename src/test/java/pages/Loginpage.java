package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	
	
@FindBy(id="user-name")
WebElement user;

@FindBy(id="password")
WebElement password;

@FindBy(id="login-button")
WebElement loginbtn;


public void email(String email) {
	
	user.sendKeys(email);
	
}


public void pass(String pass) {
	
	password.sendKeys(pass);
	
}



public void clicklogin(String emabtnil) {
	
	loginbtn.click();
	
}



}

