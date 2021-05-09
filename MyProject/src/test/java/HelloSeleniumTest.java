import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    public HelloSeleniumTest(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void smarterTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://py-pacman-javascript.vercel.app/");
        driver.quit();
    }




}
