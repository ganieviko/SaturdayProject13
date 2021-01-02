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
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys(testCaseName);
        System.out.println("Full Name is " + testCaseName);
       // driver.quit();

        String testCaseEmail = "Testing@gmail.com";
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys(testCaseEmail);
        System.out.println("Email is " + testCaseEmail);

        String testCaseCurrentAddress = "Testing Current Address";
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(testCaseCurrentAddress);
        System.out.println("Current address is " + testCaseCurrentAddress);

        String testCasePermanentAddress = "Testing Permanent Address";
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(testCasePermanentAddress);
        System.out.println("Permanent addres is " + testCaseCurrentAddress);
       // System.out.println("get text is " + permanentAddress.getText());
       // String displayed = driver.findElement(By.id("currentAddress")).getText();
       // System.out.println("get text is " + displayed);
        // TODO find out how to get text from website and print it
        driver.findElement(By.id("submit")).click();

        String nameDisplayed = driver.findElement(By.id("name")).getText();
        System.out.println("name is " + nameDisplayed);

        String emailDisplayed = driver.findElement(By.id("email")).getText();
        System.out.println("email is " + emailDisplayed);

        String currentAddressDisplayed = driver.findElement(By.cssSelector("#output p:nth-child(3)")).getText();
        System.out.println("current address is " + currentAddressDisplayed);

        String permanentAddressDisplayed = driver.findElement(By.cssSelector("#output p:nth-child(4)")).getText();
        System.out.println("permanent address is " + permanentAddressDisplayed);


    }
}
