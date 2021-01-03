import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.snapdeal.com/" );
        driver.manage().window().maximize();
        // driver.findElement(By.id("")).click();
    }
}
