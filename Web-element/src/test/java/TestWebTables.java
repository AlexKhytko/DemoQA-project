import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestWebTables {
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

        WebElement webTablesEnter = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[4]"));
        webTablesEnter.click();

        WebElement textAdd = browser.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/div[1]/button"));
        textAdd.click();

        WebElement firstName = browser.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[1]/div[2]/input"));
        firstName.click();
        firstName.sendKeys("Egor");

        WebElement lastName = browser.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[2]/div[2]/input"));
        lastName.click();
        lastName.sendKeys("Letov");

        WebElement emailUser = browser.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[3]/div[2]/input"));
        emailUser.click();
        emailUser.sendKeys("egorletov@gmail.com");

        WebElement ageUser = browser.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[4]/div[2]/input"));
        ageUser.click();
        ageUser.sendKeys("35");

        WebElement salaryUser = browser.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[5]/div[2]/input"));
        salaryUser.click();
        salaryUser.sendKeys("32500");

        WebElement departmentUser = browser.findElement(By.id("department"));
        departmentUser.click();
        departmentUser.sendKeys("Rockmusic");


        WebElement pressSubmit = browser.findElement(By.id("submit"));
        pressSubmit.click();

        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0, 300)");
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
