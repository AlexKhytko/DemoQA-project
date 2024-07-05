import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import static java.sql.DriverManager.getDriver;


public class TestCheckBox {
    // @Test
    //@Description("DemoQA - 002 Web-element module with Selenium and Allure")
    public static void main(String[] args) throws InterruptedException {
        String browserName = System.getenv("browser");
        System.out.println(browserName);

        RemoteWebDriver browser = getDriver(args[0]);
        browser.get("https://demoqa.com");

        browser.manage().window().maximize();
        System.out.println(browser.getTitle());

        WebElement elementsEnter = browser.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div"));
        elementsEnter.click();

        WebElement checkBox = browser.findElement(By.xpath("html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[2]"));
        checkBox.click();

        WebElement plusButton = browser.findElement(By.cssSelector("button.rct-option.rct-option-expand-all"));
        plusButton.click();

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0, 400)");

        WebElement buttonNotes = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]"));
        buttonNotes.click();

        WebElement buttonAngular = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[3]"));
        buttonAngular.click();

        WebElement buttonPublic = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[3]"));
        buttonPublic.click();

    }
          static RemoteWebDriver getDriver (String driverName){
            switch (driverName) {
                case "chrome":
                    return new ChromeDriver();
                default:
                    throw new IllegalArgumentException("I don't have such driver");
            }
        }
    }
