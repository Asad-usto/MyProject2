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
        loginPage loginpg = new loginPage(driver);
        loginpg.login();

        String text = driver.findElement(By.xpath("//*[@id='breadcrumbs']/li[1]/a")).getText();
        if(text.contains("Dashboard"));
        System.out.println("Logged In Successfully");
        //Thread.sleep(3000);
        String dashboard = driver.findElement(By.xpath("//*[@id=\'projectstatus\']")).getText();
        if(dashboard.contains("Myproject1")){
            System.out.println("Found Job Successfully");
            driver.findElement(By.xpath("//*[@id=\'job_Myproject1\']/td[3]/a")).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='tasks']/div[5]/span/a/span[2]")).click();
// driver.findElement(By.xpath("//*[@id=\'job_Myproject1\']/td[3]/a")).click();

//        Thread.sleep(3000);
//        driver.findElement(By.id("job_Myproject3")).click();
//        driver.findElement(By.xpath("//*[@id='breadcrumbs']/li[3]/a")).click();
//        driver.findElement(By.className("task-link-text")).click();
    }
}
