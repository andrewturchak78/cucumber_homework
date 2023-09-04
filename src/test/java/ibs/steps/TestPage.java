package ibs.steps;


import com.codeborne.selenide.SelenideElement;

import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class TestPage {
    private final SelenideElement addBtn = $x("//button[text()='Добавить']");
    private final SelenideElement itemInput = $("#name");
    private final SelenideElement typeField = $("#type");
    private final SelenideElement chooseVegetable = $("[value='VEGETABLE']");
    private final SelenideElement chooseFruit = $("[value='FRUIT']");
    private final SelenideElement exoticCheckbox = $("#exotic");
    private final SelenideElement saveBtn = $("#save");
    private final SelenideElement potato = $x("//td[.='Картофель']");
    private final SelenideElement pineapple = $x("//td[.='Ананас']");
    private final SelenideElement id = $x("//th[.='5']");
    private final SelenideElement vegetableType = $$x("//tr/td[.= 'Овощ']").get(2);
    private final SelenideElement fruitType = $$x("//tr/td[.= 'Фрукт']").get(2);
    private final SelenideElement vegetableNotExotic = $$x("//tr/td[.= 'false']").get(2);
    private final SelenideElement fruitExotic = $$x("//tr/td[.= 'true']").get(1);



    public void openPage(String url) {

        open(url);


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
