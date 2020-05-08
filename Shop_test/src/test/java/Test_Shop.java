import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import java.util.Properties;

public class Test_Shop {
    private static WebDriver driver;

    String RU, UA,Search;
    private final By RU = By.xpath("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[1]/ul[2]/li[1]/a");
    private final By UA = By.xpath("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[1]/ul[2]/li[2]/span");
    private final By Search = By.xpath("/html/body/app-root/div/div[1]/app-rz-header/header/div/div[2]/div[2]/form/button");

    @AfterMethod
    public static void cleanUp(){
        driver.quit();
    }
    @DataProvider(name = "data1")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"RU","Найти"},
                {"UA","Знайти"},
        };
    }
    @Test(dataProvider = "data1")
    public void testSum(String a, String b) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://rozetka.com.ua/");
        RU = driver.findElement(RU).getText();
        UA = driver.findElement(UA).getText();
        if (a.equals(RU)) {
            driver.findElement(RU).click();
            Search = driver.findElement(Search).getText();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            assert (b.equals(Search));
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
        if (a.equals(UA)) {
            Search = driver.findElement(Search).getText();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            assert (b.equals(Search));
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        }
    }
}



