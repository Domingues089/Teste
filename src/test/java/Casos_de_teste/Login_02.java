package Casos_de_teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiago.marques\\Desktop\\Dev\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bugbank.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("teste02@gmail.com");
        driver.findElement(By.name("password")).sendKeys("teste02");
        WebElement botao_acessar = driver.findElement(By.cssSelector("button[type='submit']"));
        botao_acessar.click();

    }
}
