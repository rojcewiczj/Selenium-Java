import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HelloSeleniumTest {
    WebDriver driver;
    WebElement startButton;
    WebElement upButton;
    WebElement downButton;
    WebElement leftButton;
    WebElement rightButton;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://py-pacman-javascript.vercel.app/");
        startButton = driver.findElement(By.className("button"));
        upButton = driver.findElement(By.className("upArrow"));
        downButton = driver.findElement(By.className("downArrow"));
        leftButton = driver.findElement(By.className("leftArrow"));
        rightButton = driver.findElement(By.className("rightArrow"));
    }

    public void Wait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void Click(WebElement Button){
        Wait();
        Button.click();
    }
    public void MultiClick(int amount, WebElement Button){
        for(int i = amount; i > 0; i--){
            Click(Button);
        }
    }


    @Test
    public void testingGameFunction(){
        startButton.click();
        Click(leftButton);
        MultiClick(7, downButton);
        startButton.click();
        MultiClick(8, rightButton);
        MultiClick(2, downButton);
        MultiClick(2,rightButton);
        MultiClick(2,downButton);
        MultiClick(7, rightButton);
        Click(upButton);






    }




}
