package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class byLinkText {
    
    public static void main(String[] args) {

        String url = "https://automationtesting.co.uk/";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jptom\\OneDrive\\Desktop\\Selenium-Java\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //Selector by linkText
        driver.findElement(By.linkText("BUTTONS")).click();

        
    }


}
