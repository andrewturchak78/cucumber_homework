package page;

import com.codeborne.selenide.SelenideElement;

import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class TestPage {
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



    public TestPage openPage(String url) {

        open(url);
        return page();


    }


    public TestPage clickOnAddBtn() {
        addBtn.click();
        return page();
    }


    public TestPage fillInputField(String item) {
        itemInput.sendKeys(item);    // "Картофель", "Ананас"
        return page();
    }


    public TestPage clickOnChoosingType() {
        typeField.click();
        return page();

    }


    public TestPage chooseVegetable() {
        chooseVegetable.click();
        return page();

    }


    public TestPage chooseFruit() {
        chooseFruit.click();
        return page();

    }


    public TestPage clickOnCheckbox() {
        exoticCheckbox.click();
        return page();

    }


    public TestPage clickOnSaveBtn() {
        saveBtn.click();
        return page();
    }


    public TestPage elementVegetableExists(String string) {
        Assertions.assertEquals(string, potato.getText());
        return page();
    }


    public TestPage elementFruitExists(String string) {
        Assertions.assertEquals(string, pineapple.getText());
        return page();
    }


    public TestPage findId(String idNumber) {
        Assertions.assertEquals(idNumber, id.getText());
        return page();
    }


    public TestPage findVegetableByType(String type) {
        Assertions.assertEquals(type, vegetableType.getText());
        return page();
    }

    public TestPage findFruitByType(String type) {
        Assertions.assertEquals(type, fruitType.getText());
        return page();
    }


    public TestPage vegetableExoticFalse(String falseOrTrue) {
        Assertions.assertEquals(falseOrTrue, vegetableNotExotic.getText());
        return page();
    }

    public TestPage fruitExoticTrue(String falseOrTrue) {
        Assertions.assertEquals(falseOrTrue, fruitExotic.getText());
        return page();
    }
}
