package MyTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    loginPage(WebDriver driver){
        this.driver = driver;
    }
    By username = new By.ById("j_username");
    By password = new By.ByName("j_password");
    By submit = new By.ByName("Submit");
    public void login()
    {
        driver.findElement(username).sendKeys("AsadMumtaz");
        driver.findElement(password).sendKeys("10pearls1+");
        driver.findElement(submit).click();
    }
}
