# language: ru
@all
Функция: Добавление товара(овоща или фрукта)

  Предыстория:
    * открыта страница по адресу "http://localhost:8080/food"

  @correct1
  Сценарий: добавление неэкзотического овоща - Картофеля

    * произошел клик по кнопке добавить
    * поле ввода овоща или фрукта заполнено "Картофель"
    * произошел клик по полю выбора типа товара овоща или фрукта
    * выбор типа овощ
    * кликаем по кнопке cохранить
    


  @correct2
  Сценарий: добавление экзотического фрукта - Ананаса
    * произошел клик по кнопке добавить
    * поле ввода овоща или фрукта заполнено "Ананас"
    * произошел клик по полю выбора типа товара овоща или фрукта
    * выбор типа фрукт
    * подтверждаем что товар экзотичный
    * кликаем по кнопке cохранить
    





