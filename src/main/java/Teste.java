import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Teste {
    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.selenium.dev/downloads/");
            WebElement elemento = driver.findElement(By.xpath(""));
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
