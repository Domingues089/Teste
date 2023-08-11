package Casos_de_teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiago.marques\\Desktop\\Dev\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://bugbank.netlify.app/");
        driver.manage().window().maximize();

    }
}
