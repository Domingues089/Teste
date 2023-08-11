package Casos_de_teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Passos {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiago.marques\\Desktop\\Dev\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://bugbank.netlify.app/");
        driver.manage().window().maximize();

        //Fase1 - Cadastro_1

        WebElement botao_cadastrar = driver.findElement(By.xpath("//button[@class='style__ContainerButton-sc-1wsixal-0 ihdmxA button__child']"));
        botao_cadastrar.click();

        //Thread.sleep(5000);
        WebElement campoEmail = driver.findElement(By.xpath("//div[@class=\"style__ContainerFieldInput-sc-s3e9ea-0 kOeYBn input__child\"]/input"));

        campoEmail.click();
        campoEmail.sendKeys("seu-email@example.com");
        driver.findElement(By.name("email")).sendKeys("teste01@gmail.com");
        driver.findElement(By.name("name")).sendKeys("Nome01");
        driver.findElement(By.name("password")).sendKeys("Senha01");
        driver.findElement(By.name("passwordConfirmation")).sendKeys("Senha01");
        driver.findElement(By.id("toggleAddBalance")).click();
        driver.findElement(By.name("Cadastrar")).click();
        driver.findElement(By.name("Fechar")).click();
        driver.findElement(By.id("toggleAddBalance")).click();
        //Fase1 - login_1
        driver.findElement(By.name("email")).sendKeys("teste01@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Senha01");
        driver.findElement(By.name("Acessar")).click();

        //localiza a conta
        /*WebElement elemento = driver.findElement(By.id("textAccountNumber"));
        String numero_conta = elemento.getText();

        // ------  limpar a tela e clicar em cadastrar

        //Fase1 - Cadastro_2
        driver.findElement(By.id("Registrar")).click();
        driver.findElement(By.name("email")).sendKeys("teste02@gmail.com");
        driver.findElement(By.name("name")).sendKeys("Nome02");
        driver.findElement(By.name("password")).sendKeys("Senha02");
        driver.findElement(By.name("passwordConfirmation")).sendKeys("Senha02");
        driver.findElement(By.id("toggleAddBalance")).click();
        driver.findElement(By.name("Cadastrar")).click();
        driver.findElement(By.name("Fechar")).click();

        // Fase2 - Login 1
        /* Fase2 - trasferencia 1
        --preencher a conta
        --preencher dígito
        --valor da transferencia
        --descrição
        -- limpar a tela e voltar para a home



        /* Fase2 - trasferencia 2
        --preencher a conta
        --preencher dígito
        --valor da transferencia
        --descrição
         */

        // Localizar um elemento e interagir com ele
        WebElement elemento2 = driver.findElement(By.id("meuElemento"));
        elemento2.click();

        // Fechar o navegador
        //driver.quit();*/
    }
}


