import PageObject.AboutRentScooter;
import PageObject.ForWhomScooter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;



public class TestAnswer {
    private WebDriver driver;

    @Test
    public void shouldSameText() {
        // создаем драйвер для браузера Mozilla Firefox
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);

        // переходим на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru/");

        // создаем объект класса главной страницы приложения
        HomePageScooter objHomePage = new HomePageScooter(driver);
        // дождись загрузки главной страницы
        objHomePage.waitForLoadHomePage();
        //разворачиваем окно
        driver.manage().window().maximize();
        //принимаем куки
        driver.findElement(By.id("rcc-confirm-button")).click();
        //переход к разделу "Вопросы о важном"
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickFirstQuestion();
        String actual1 = objHomePage.getAnswerText1();
        String expected1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        assertEquals(expected1, actual1);

        objHomePage.clickSecondQuestion();
        String actual2 = objHomePage.getAnswerText2();
        String expected2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected2, actual2);

        objHomePage.clickThirdQuestion();
        String actual3 = objHomePage.getAnswerText3();
        String expected3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected3, actual3);

        objHomePage.clickFourthQuestion();
        String actual4 = objHomePage.getAnswerText4();
        String expected4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected4, actual4);

        objHomePage.clickFifthQuestion();
        String actual5 = objHomePage.getAnswerText5();
        String expected5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        assertEquals(expected5, actual5);

        objHomePage.clickSixthQuestion();
        String actual6 = objHomePage.getAnswerText6();
        String expected6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected6, actual6);

        objHomePage.clickSevenQuestion();
        String actual7 = objHomePage.getAnswerText7();
        String expected7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected7, actual7);

        objHomePage.clickEigthQuestion();
        String actual8 = objHomePage.getAnswerText8();
        String expected8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected8, actual8);
        }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}