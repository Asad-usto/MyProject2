package MyTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8085/");
        driver.findElement(By.id("j_username")).sendKeys("AsadMumtaz");
        driver.findElement(By.name("j_password")).sendKeys("10pearls1+");
        driver.findElement(By.name("Submit")).click();
        String text = driver.findElement(By.xpath("//*[@id='breadcrumbs']/li[1]/a")).getText();
        if(text.contains("Dashboard"));
        System.out.println("Logged In Successfully");
        if(driver.findElement(By.xpath("//*[@id='projectstatus']/tbody")).equals("Myproject3"));
        driver.findElement(By.id("job_Myproject3")).click();
    }
}
