package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRentScooter {
    private WebDriver driver;

    // Поле для ввода "Когда привезти самокат"
    private By orderDate = By.xpath("//div/input[@placeholder='* Когда привезти самокат']");
    private By orderDay = By.xpath("//div[@aria-label='Choose среда, 10-е августа 2022 г.']");
    // Выпадающий список "Срок аренды"
    private By periodButton = By.className("Dropdown-root");
    // Количество суток
    private By amountDaysButton = By.xpath("//div[text()='сутки']");
    // Чек-бокс "Черный жемчуг"
    private By colorBlack = By.id("black");
    // Чек-бокс "Серая безысходность"
    private By colorGrey = By.id("grey");
    // Кнопка "Заказать" под полями для заполнения
    private By orderButtonDown = By.xpath("//div/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Заказать']");
    // Кнопка "Да" на окне "Хотите оформить заказ?"
    private By yesButton = By.xpath("//div/button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and text() = 'Да']");
    // Сообщение "Заказ оформлен"
    private By orderMessage = By.className("Order_ModalHeader__3FDaJ");

    //конструктор класса
    public AboutRentScooter(WebDriver driver){
        this.driver = driver;
    }
    // метод ожидания загрузки страницы "Про аренду"
    public void waitForLoadAboutRentScooter(){
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Content__bmtHS")));
    }
    public void clickDateField() {
        driver.findElement(orderDate).click();
    }
    public void clickCalendar() {
        driver.findElement(orderDay).click();
    }
    public void clickPeriodField() {
        driver.findElement(periodButton).click();
    }
    public void clickAmountDays() {
        driver.findElement(amountDaysButton).click();
    }

    public void clickBlackChekbox() {
        driver.findElement(colorBlack).click();}

    public void clickGreyChekbox() {
        driver.findElement(colorGrey).click();
       }
    public void clickOrderButton() {
        driver.findElement(orderButtonDown).click();
    }
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }
    public void aboutRentBlack(){
        clickBlackChekbox();
        clickOrderButton();
        clickYesButton();
    }
    public void aboutRentGrey(){
        clickGreyChekbox();
        clickOrderButton();
        clickYesButton();
    }
}
