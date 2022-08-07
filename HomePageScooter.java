import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageScooter {
    private WebDriver driver;
    // Логотип "Самокат"
    private By logoScooter = By.className("Header_LogoScooter__3lsAR");
    // Логотип "Яндекс"
    private By logoYandex = By.className("Header_LogoYandex__3TSOI");
    // Кнопка "Принять куки"
    private By cookieButton = By.id("rcc-confirm-button");
    // Кнопка «Заказать» вверху страницы
    private By orderButtonUp = By.className("Button_Button__ra12g");
    // Кнопка «Заказать» внизу страницы
    private By orderButtonDown = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Заголовок "Вопросы о важном"
    private By headerQuestions = By.className("Home_SubHeader__zwi_E");
    // Кнопка "Сколько это стоит? И как оплатить?"
    private By firstQuestion = By.xpath("//div[text()='Сколько это стоит? И как оплатить?']");
    // Ответ на "Сколько это стоит? И как оплатить?"
    private By firstAnswer = By.id("accordion__panel-0");

    // Кнопка "Хочу сразу несколько самокатов! Так можно?"
    private By secondQuestion = By.xpath("//div[text()='Хочу сразу несколько самокатов! Так можно?']");
    // Ответ на "Хочу сразу несколько самокатов! Так можно?"
    private By secondAnswer = By.id("accordion__panel-1");

    // Кнопка "Как рассчитывается время аренды?"
    private By thirdQuestion = By.xpath("//div[text()='Как рассчитывается время аренды?']");
    // Ответ на "Как рассчитывается время аренды?"
    private By thirdAnswer = By.id("accordion__panel-2");

    // Кнопка "Можно ли заказать самокат прямо на сегодня?"
    private By fourthQuestion = By.xpath("//div[text()='Можно ли заказать самокат прямо на сегодня?']");
    // Ответ на "Можно ли заказать самокат прямо на сегодня?"
    private By fourthAnswer = By.id("accordion__panel-3");

    // Кнопка "Можно ли продлить заказ или вернуть самокат раньше?"
    private By fifthQuestion = By.xpath("//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']");
    // Ответ на "Можно ли продлить заказ или вернуть самокат раньше?"
    private By fifthAnswer = By.id("accordion__panel-4");

    // Кнопка "Вы привозите зарядку вместе с самокатом?"
    private By sixthQuestion = By.xpath("//div[text()='Вы привозите зарядку вместе с самокатом?']");
    // Ответ на "Вы привозите зарядку вместе с самокатом?"
    private By sixthAnswer = By.id("accordion__panel-5");

    // Кнопка "Можно ли отменить заказ?"
    private By seventhQuestion = By.xpath("//div[text()='Можно ли отменить заказ?']");
    // Ответ на "Можно ли отменить заказ?"
    private By seventhAnswer = By.id("accordion__panel-6");

    // Кнопка "Я жизу за МКАДом, привезёте?"
    private By eighthQuestion = By.xpath("//div[text()='Я жизу за МКАДом, привезёте?']");
    // Ответ на "Я жизу за МКАДом, привезёте?"
    private By eighthAnswer = By.id("accordion__panel-7");


    //конструктор класса
    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }

    // метод ожидания загрузки главной страницы
    public void waitForLoadHomePage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Home_Header__iJKdX")));
    }
    // методы для получения значений полей "Ответы на вопросы"
    public String getAnswerText1(){
    return driver.findElement(firstAnswer).getText();}

    public String getAnswerText2(){
        return driver.findElement(secondAnswer).getText();}

    public String getAnswerText3(){
        return driver.findElement(thirdAnswer).getText();}

    public String getAnswerText4(){
        return driver.findElement(fourthAnswer).getText();}

    public String getAnswerText5(){
        return driver.findElement(fifthAnswer).getText();}

    public String getAnswerText6(){
        return driver.findElement(sixthAnswer).getText();}

    public String getAnswerText7(){
        return driver.findElement(seventhAnswer).getText();}

    public String getAnswerText8(){
        return driver.findElement(eighthAnswer).getText();}



    public void clickFirstQuestion () {
        driver.findElement(firstQuestion).click();
    }
    public void clickSecondQuestion () {
        driver.findElement(secondQuestion).click();
    }
    public void clickThirdQuestion () {
        driver.findElement(thirdQuestion).click();
    }
    public void clickFourthQuestion () {
        driver.findElement(fourthQuestion).click();
    }
    public void clickFifthQuestion () {
        driver.findElement(fifthQuestion).click();
    }
    public void clickSixthQuestion () {
        driver.findElement(sixthQuestion).click();
    }
    public void clickSevenQuestion () {
        driver.findElement(seventhQuestion).click();
    }
    public void clickEigthQuestion () {
        driver.findElement(eighthQuestion).click();
    }
}
