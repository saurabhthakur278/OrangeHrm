package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;


public class Step 
{



	WebDriver driver;
  Loginpage l=new Loginpage(driver);
	
@Given("user launch Chrome browser")
public void user_launch_chrome_browser() {
	 WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		
}
    


@When("User open URL {string}")
public void user_open_url(String Url) {
		driver.get(Url);
    
}
	
	
	
@When("User enter email as {string}")
public void user_enter_email_as(String string) {
  ;
}
@When("password as {string}")
public void password_as(String string) {
   
}
@When("click on login")
public void click_on_login() {
  
}
@Then("User able to login medable site app")
public void user_able_to_login_medable_site_app() {
   
}


	
}
