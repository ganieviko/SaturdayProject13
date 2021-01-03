import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", MyConstants.DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.snapdeal.com/" );
        driver.manage().window().maximize();
        driver.findElement(By.id("pushDenied")).click();

        WebElement input = driver.findElement(By.name("keyword"));
        input.sendKeys("teddy bear");
        driver.findElement(By.className("searchTextSpan")).click();

        String searchMessageContainer = driver.findElement(By.id("searchMessageContainer")).getText();
        System.out.println(searchMessageContainer);
        System.out.println("------------------------------------------------");
        String teddyBearCurrentUrl = driver.getCurrentUrl();
        System.out.println(teddyBearCurrentUrl);
        System.out.println("------------------------------------------------");
        driver.navigate().back();
        //driver.navigate().forward();

        driver.findElement(By.name("keyword")).click();
        String  checkIfDisplayedTeddy = driver.findElement(By.cssSelector("li.recentCont")).getText();
        //checkIfDisplayedTeddy.click();
        //String text = checkIfDisplayedTeddy.getText();
        System.out.println(checkIfDisplayedTeddy);

//        if (text.equals("Teddy Bear")){
//            System.out.println("Search bar has text 'teddy bear' ");
//        }else {
//            System.out.println("Search bar doesn't have 'teddy bear' text");
//        }
        System.out.println("------------------------------------------------");
    }
}
