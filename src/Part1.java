import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "http://demoqa.com/text-box" );
        driver.manage().window().maximize();
       // driver.findElement(By.id("")).click();

        String testCaseName = "Automation";
        String testCaseEmail = "Testing@gmail.com";
        String testCaseCurrentAddress = "Testing Current Address";
        String testCasePermanentAddress = "Testing Permanent Address";


        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(testCaseName);

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(testCaseEmail);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(testCaseCurrentAddress);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(testCasePermanentAddress);

        driver.findElement(By.id("submit")).click();

        String nameDisplayed = driver.findElement(By.id("name")).getText();
        System.out.println(nameDisplayed);

        String emailDisplayed = driver.findElement(By.id("email")).getText();
        System.out.println(emailDisplayed);

        String currentAddressDisplayed = driver.findElement(By.cssSelector("#output p:nth-child(3)")).getText();
        System.out.println(currentAddressDisplayed);

        String permanentAddressDisplayed = driver.findElement(By.cssSelector("#output p:nth-child(4)")).getText();
        System.out.println(permanentAddressDisplayed);


    }
}
