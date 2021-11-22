package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        WebDriver driver = new ChromeDriver();
        driver.get("https://novat.nsk.ru");
        // Do: Перейти на страницу Театр выбрав соответсвующий пункт в боковом меню Assrt:Открылась информация о театре
        driver.findElement(By.xpath("//a[contains(@href, '/theatre/')]")).click();
        // Do: Перейти в личный кабинет, нажав Личный кабинет в боковом меню Assert: Открывается окно авторизации
        driver.findElement(By.xpath("//a[contains(text(),'Личный кабинет')]")).click();
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
        //Do: Авторизоваться на сайте под login/passord: masha2410@mail.ru/zarplata Assert: Успешная регистрация
        driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div[1]/input")).click();
       driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div[1]/input")).sendKeys("masha2410@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"auth-form\"]/div[2]/input")).sendKeys("zarplata");
        driver.findElement(By.xpath("//*[@id=\"forgot-form\"]/div/input[2]")).click();


driver.quit();

    }
}
