package Casos_de_teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cadastro {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiago.marques\\Desktop\\Dev\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bugbank.netlify.app/");
        driver.manage().window().maximize();

        //Fase1 - Cadastro_1

        WebElement botao_cadastrar = driver.findElement(By.xpath("//button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));
        botao_cadastrar.click();

        Thread.sleep(3000);
        WebElement botao_acessar = driver.findElement(By.cssSelector("button[type='submit']"));

        /*WebElement campoEmail = driver.findElement(By.xpath("//div[@class=\"style__ContainerFieldInput-sc-s3e9ea-0 kOeYBn input__child\"]/input"));
        campoEmail.click();
        campoEmail.sendKeys("seu-email@example.com");*/

        WebElement emailInput = driver.findElement(By.cssSelector("input[type='email']"));
        driver.findElement(By.name("email")).sendKeys("teste01@gmail.com");
        driver.findElement(By.name("name")).sendKeys("Nome01");

        WebElement senha = driver.findElement(By.cssSelector("input[type='password']"));

        // Realizar ações no campo de entrada, se necessário
        senha.sendKeys("Senha01");

        // driver.findElement(By.name("password")).sendKeys("Senha001");
        driver.findElement(By.name("passwordConfirmation")).sendKeys("Senha01");
        driver.findElement(By.id("toggleAddBalance")).click();
        driver.findElement(By.name("Cadastrar")).click();
        driver.findElement(By.name("Fechar")).click();

        //Fase1 - login_1
        /*driver.findElement(By.name("email")).sendKeys("teste01@gmail.com");
        driver.findElement(By.name("password")).sendKeys("teste01");
        WebElement botao_acessar = driver.findElement(By.cssSelector("button[type='submit']"));

        //localiza a conta
        WebElement elemento = driver.findElement(By.id("textAccountNumber"));
        String numero_conta1 = elemento.getText();



        // ------  limpar a tela e clicar em cadastrar

        //Fase1 - Cadastro_2
        driver.findElement(By.id("Registrar")).click();
        driver.findElement(By.name("email")).sendKeys("teste02@gmail.com");
        driver.findElement(By.name("name")).sendKeys("Nome02");
        driver.findElement(By.name("password")).sendKeys("Senha02");
        driver.findElement(By.name("passwordConfirmation")).sendKeys("Senha02");
        driver.findElement(By.id("toggleAddBalance")).click();
        driver.findElement(By.name("Cadastrar")).click();
        driver.findElement(By.name("Fechar")).click();*/
    }
}
