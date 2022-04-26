package MyTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8085/");
        loginPage loginpg = new loginPage();
        loginpg.login(driver);

        String text = driver.findElement(By.xpath("//*[@id='breadcrumbs']/li[1]/a")).getText();
        if(text.contains("Dashboard"));
        System.out.println("Logged In Successfully");
        WebElement element = driver.findElement(By.xpath("//*[@id='projectstatus']/tbody"));
        element.getText();
        if(element.equals("Myproject3"));
        element.click();

//        Thread.sleep(3000);
//        driver.findElement(By.id("job_Myproject3")).click();
//        driver.findElement(By.xpath("//*[@id='breadcrumbs']/li[3]/a")).click();
//        driver.findElement(By.className("task-link-text")).click();
        Thread.sleep(10000);
    }
}
