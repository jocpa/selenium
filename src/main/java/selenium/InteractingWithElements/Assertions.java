package selenium.InteractingWithElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assertions {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        String url = "https://automationtesting.co.uk/index.html";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


        

    }
    
}
