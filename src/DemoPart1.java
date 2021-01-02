import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Integer.parseInt;

public class DemoPart1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        String enterA = "100";
        WebElement firstElement = driver.findElement(By.id("sum1"));
        firstElement.sendKeys(enterA);
//        String firstElementText = driver.findElement(By.id("sum1")).getText();
        System.out.println("input a as a String " + enterA);
//        System.out.println("This is an value of A from WebElement " + firstElement.getText());
//        System.out.println("-------------------------------");
        String enterB = "250";
        WebElement secondElement = driver.findElement(By.id("sum2"));
        secondElement.sendKeys(enterB);
        System.out.println("input b as a String is " + enterB);
        System.out.println("-----------------------------------------------");

        int convertA = parseInt(enterA);
        System.out.println("input a converted to an integer " + convertA);
        int convertB = parseInt(enterB);
        System.out.println("input b converted to an integer " + convertB);
        //int convertSummary = parseInt(display);

        System.out.println("-----------------------------------------------");
        driver.findElement(By.cssSelector("#gettotal>button")).click();
        String display = driver.findElement(By.id("displayvalue")).getText();
        System.out.println("Value 'a + b' from WebElement as a String " + display);
        int convertedDisplay = parseInt(display);
        System.out.println("This is converted String to int " + convertedDisplay);
        int sumOfAAndB = convertA+convertB;
        System.out.println("sumOfAAndB is " + sumOfAAndB);

        System.out.println("-----------------------------------------------");
        if (convertedDisplay == sumOfAAndB){
            System.out.println("Success");
        }else {
            System.out.println("Failure");
        }
    }
}
