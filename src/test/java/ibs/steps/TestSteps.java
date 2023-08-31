package ibs.steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class TestSteps {


    private SelenideElement addBtn = $x("//button[text()='Добавить']");
    private SelenideElement itemInput = $("#name");
    private SelenideElement typeField = $("#type");
    private SelenideElement chooseVegetable = $("[value='VEGETABLE']");
    private SelenideElement chooseFruit = $("[value='FRUIT']");
    private SelenideElement exoticCheckbox = $("#exotic");
    private SelenideElement saveBtn = $("#save");
    private SelenideElement potato = $x("//td[.='Картофель']");
    private SelenideElement pineapple = $x("//td[.='Ананас']");
    private SelenideElement id = $x("//th[.='5']");
    private SelenideElement vegetableType = $$x("//tr/td[.= 'Овощ']").get(2);
    private SelenideElement fruitType = $$x("//tr/td[.= 'Фрукт']").get(2);
    private SelenideElement vegetableNotExotic = $$x("//tr/td[.= 'false']").get(2);
    private SelenideElement fruitExotic = $$x("//tr/td[.= 'true']").get(1);


    @Дано("открыта страница по адресу {string}")
    public void открыта_страница_по_адресу(String url) {

        open(url);


    }

    @Тогда("произошел клик по кнопке добавить")
    public void произошел_клик_по_кнопке_добавить() {
        addBtn.click();

    }

    @И("поле ввода овоща или фрукта заполнено {string}")
    public void поле_ввода_овоща_или_фрукта_заполнено(String item) {
        itemInput.sendKeys(item);    // "Картофель", "Ананас"

    }

    @И("произошел клик по полю выбора типа товара овоща или фрукта")
    public void произошел_клик_по_полю_выбора_типа_товара_овоща_или_фрукта() {
        typeField.click();

    }

    @И("выбор типа овощ")
    public void выбор_типа_овощ() {
        chooseVegetable.click();

    }

    @И("выбор типа фрукт")
    public void выбор_типа_фрукт() {
        chooseFruit.click();

    }

    @И("подтверждаем что товар экзотичный")
    public void подтверждаем_что_товар_экзотичный() {
        exoticCheckbox.click();

    }

    @И("кликаем по кнопке cохранить")
    public void кликаем_по_кнопке_cохранить() {
        saveBtn.click();
    }

    @Тогда("элемент овощ {string} присутствует")
    public void элемент_овощ_присутствует(String potatoName) {
        Assertions.assertEquals(potatoName, potato.getText());

    }

    @И("добавился фрукт {string} или нет")
    public void проверяем_добавился_фрукт_или_нет(String pineappleName) {
        Assertions.assertEquals(pineappleName, pineapple.getText());
    }

    @И("проверим добавился ли товар {string} по id или нет")
    public void findId(String idNumber) {
        Assertions.assertEquals(idNumber, id.getText());
    }

    @И("проверим добавился ли овощ по типу {string}")
    public void findVegetableByType(String type) {
        Assertions.assertEquals(type, vegetableType.getText());
    }
    @И("проверим добавился ли фрукт по типу {string}")
    public void findFruitByType(String type) {
        Assertions.assertEquals(type, fruitType.getText());
    }

    @И("проверим добавился экзотичный овощ или нет {string}")
    public void vegetableExoticFalse(String falseOrTrue) {
        Assertions.assertEquals(falseOrTrue, vegetableNotExotic.getText());
    }

    @И("проверим добавился экзотичный фрукт или нет {string}")
    public void fruitExoticTrue(String falseOrTrue) {
        Assertions.assertEquals(falseOrTrue, fruitExotic.getText());
    }


}
