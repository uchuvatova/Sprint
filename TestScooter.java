import PageObject.AboutRentScooter;
import PageObject.ForWhomScooter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.junit.After;
import org.junit.Test;

public class TestScooter {
    private WebDriver driver;

    @Test
    public void test1() {
        // создаем драйвер для браузера
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        // переходим на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        // создаем объект класса главной страницы приложения
        HomePageScooter objHomePage = new HomePageScooter(driver);
        // дождись загрузки главной страницы
        objHomePage.waitForLoadHomePage();
        driver.manage().window().maximize();
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.className("Button_Button__ra12g")).click();

        // создаем объект класса страницы "Для кого самокат"
        ForWhomScooter objForWhomPage = new ForWhomScooter(driver);
        // дождись загрузки страницы "Для кого самокат"
        objForWhomPage.waitForLoadForWhomPage();

        objForWhomPage.clickMetroButton();
        driver.findElement(By.xpath("//div/ul/li[5]")).click();
        objForWhomPage.forWhom("Ирина",
                "Учуватова", "Романтиков 1", "89020000000");


        // создаем объект класса страницы "Про аренду"
        AboutRentScooter objAboutRentPage = new AboutRentScooter(driver);
        // дождись загрузки страницы "Про аренду"
        objAboutRentPage.waitForLoadAboutRentScooter();
        objAboutRentPage.clickDateField();
        driver.findElement(By.xpath("//div[@aria-label='Choose среда, 10-е августа 2022 г.']")).click();
        objAboutRentPage.clickPeriodField();
        driver.findElement(By.xpath("//div[text()='сутки']")).click();
        objAboutRentPage.aboutRentBlack();
        driver.findElement(By.xpath(".//div[contains(text(),'Заказ оформлен')]"));

    }
    @Test
    public void test2() {
        // создаем драйвер для браузера
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        // переходим на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        // создаем объект класса главной страницы приложения
        HomePageScooter objHomePage = new HomePageScooter(driver);
        // дождись загрузки главной страницы
        objHomePage.waitForLoadHomePage();
        driver.manage().window().maximize();
        driver.findElement(By.id("rcc-confirm-button")).click();
        driver.findElement(By.className("Button_Button__ra12g")).click();

        // создаем объект класса страницы "Для кого самокат"
        ForWhomScooter objForWhomPage = new ForWhomScooter(driver);
        // дождись загрузки страницы "Для кого самокат"
        objForWhomPage.waitForLoadForWhomPage();

        objForWhomPage.clickMetroButton();
        driver.findElement(By.xpath("//div/ul/li[9]")).click();
        objForWhomPage.forWhom("Мария",
                "Ли", "Нижний Новгород", "00000000000");


        // создаем объект класса страницы "Про аренду"
        AboutRentScooter objAboutRentPage = new AboutRentScooter(driver);
        // дождись загрузки страницы "Про аренду"
        objAboutRentPage.waitForLoadAboutRentScooter();
        objAboutRentPage.clickDateField();
        driver.findElement(By.xpath("//div[@aria-label='Choose суббота, 6-е августа 2022 г.']")).click();
        objAboutRentPage.clickPeriodField();
        driver.findElement(By.xpath("//div[text()='двое суток']")).click();
        objAboutRentPage.aboutRentGrey();
        driver.findElement(By.xpath(".//div[contains(text(),'Заказ оформлен')]"));

    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
