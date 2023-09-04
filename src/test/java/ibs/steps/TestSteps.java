package ibs.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.Assertions;
import page.TestPage;


import javax.sql.DataSource;
import java.sql.*;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class TestSteps {

    TestPage page = new TestPage();


    @Дано("открыта страница по адресу {string}")
    public void открыта_страница_по_адресу(String url) {

        page.openPage(url);



    }

    @Тогда("произошел клик по кнопке добавить")
    public void произошел_клик_по_кнопке_добавить() {
        page.clickOnAddBtn();

    }

    @И("поле ввода овоща или фрукта заполнено {string}")
    public void поле_ввода_овоща_или_фрукта_заполнено(String item) {
        page.fillInputField(item);   // "Картофель", "Ананас"

    }

    @И("произошел клик по полю выбора типа товара овоща или фрукта")
    public void произошел_клик_по_полю_выбора_типа_товара_овоща_или_фрукта() {
        page.clickOnChoosingType();


    }

    @И("выбор типа овощ")
    public void выбор_типа_овощ() {
        page.chooseVegetable();


    }

    @И("выбор типа фрукт")
    public void выбор_типа_фрукт() {
        page.chooseFruit();


    }

    @И("подтверждаем что товар экзотичный")
    public void подтверждаем_что_товар_экзотичный() {
        page.clickOnCheckbox();


    }

    @Когда("кликаем по кнопке cохранить")
    public TestSteps кликаем_по_кнопке_cохранить() {
        page.clickOnSaveBtn();
        return page();
    }

    @Тогда("добавился товар {string} с типом {string} экзотичный или нет {string}")
    public TestSteps добавился_товар_или_нет(String itemName, String type, String falseOrTrue) {
        page.elementVegetableExists(itemName);
        page.elementFruitExists(itemName);
        page.findId("5");
        page.findVegetableByType(type);
        page.findFruitByType(type);
        page.vegetableExoticFalse(falseOrTrue);
        page.fruitExoticTrue(falseOrTrue);
        return page();
    }


}
