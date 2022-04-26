package MyTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    public void login(WebDriver driver)
    {
        driver.findElement(By.id("j_username")).sendKeys("AsadMumtaz");
        driver.findElement(By.name("j_password")).sendKeys("10pearls1+");
        driver.findElement(By.name("Submit")).click();
    }
}
