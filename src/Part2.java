import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://demo.applitools.com/" );
        driver.manage().window().maximize();

        String testUserName = "ttechno@gmail.com";
        driver.findElement(By.id("username")).sendKeys(testUserName);

        String testPassword = "techno123.";
        driver.findElement(By.id("password")).sendKeys(testPassword);

        driver.findElement(By.id("log-in")).click();

        String headerTextTime = driver.findElement(By.id("time")).getText();
        System.out.println("Header text is " + headerTextTime);
        System.out.println("---------------------------------");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl is " + currentUrl);


    }
}
