package selenium.InteractingWithElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        //inicializar browser
        WebDriver driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://automationtesting.co.uk/buttons.html");

        //maximizar browser
        driver.manage().window().maximize();

         
        System.out.println(
            driver.findElement(By.cssSelector("#btn_four")).isEnabled()
        );
        

        

    }

}
