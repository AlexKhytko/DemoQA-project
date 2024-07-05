import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;


public class TestTextBox {
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

        WebElement textBox = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[1]"));
        textBox.click();

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0, 500)");

        WebElement fullName = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input"));
        fullName.click();
        fullName.sendKeys("Egor Letov");

        WebElement emailUser = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input"));
        emailUser.click();
        emailUser.sendKeys("egorletov@gmail.com");

        WebElement currentAddress = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/textarea"));
        currentAddress.click();
        currentAddress.sendKeys("London is the capital of Great Britain");

        WebElement permanentAddress = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[4]/div[2]/textarea"));
        permanentAddress.click();
        permanentAddress.sendKeys(" 78, Kensington Park Road, London WII 2PL");

        WebElement pressSubmit = browser.findElement(By.id("submit"));
        pressSubmit.click();
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
