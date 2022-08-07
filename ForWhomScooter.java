package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWhomScooter {

    private WebDriver driver;

    // Поле для ввода "Имя"
    private By nameField = By.xpath("//div/input[@placeholder='* Имя']");
    // Поле для ввода "Фамилия"
    private By surnameField = By.xpath("//div/input[@placeholder='* Фамилия']");
    // Поле для ввода "Адрес: куда привезти заказ"
    private By addressField = By.xpath("//div/input[@placeholder='* Адрес: куда привезти заказ']");
    // Выпадающее меню "Станция метро"
    private By metroButton = By.xpath("//input[@placeholder='* Станция метро']");
    // Выбор станции метро
    private By metroStation = By.xpath("//div/ul/li[5]");

    // Поле для ввода "Телефон: на него позвонит курьер"
    private By telephoneField = By.xpath("//div/input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    private By thenButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    //конструктор класса
    public ForWhomScooter(WebDriver driver) {
        this.driver = driver;}

    // метод ожидания загрузки страницы "Для кого самокат"
    public void waitForLoadForWhomPage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Content__bmtHS")));
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void clickMetroButton() {
        driver.findElement(metroButton).click();}

        public void clickMetroStation () {
            driver.findElement(metroStation).click();
        }

        public void setTelephone (String telephone){
            driver.findElement(telephoneField).sendKeys(telephone);
        }


        public void clickThenButton () {
            driver.findElement(thenButton).click();
        }
        public void forWhom (String name, String surname, String address, String telephone){
            setName(name);
            setSurname(surname);
            setAddress(address);
            setTelephone(telephone);
            clickThenButton();
        }
    }




