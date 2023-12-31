# language: ru
@all

Функция: Добавление товара(овоща или фрукта)


  @correct1
  Сценарий: добавление неэкзотического овоща - Картофеля
    * открыта страница по адресу "http://localhost:8080/food"
    * произошел клик по кнопке добавить
    * поле ввода овоща или фрукта заполнено "Картофель"
    * произошел клик по полю выбора типа товара овоща или фрукта
    * выбор типа овощ
    * кликаем по кнопке cохранить
    * добавился товар "Картофель" с типом "Овощ" экзотичный или нет "true"



    
  @correct2
  Сценарий: добавление экзотического фрукта - Ананаса
    * открыта страница по адресу "http://localhost:8080/food"
    * произошел клик по кнопке добавить
    * поле ввода овоща или фрукта заполнено "Ананас"
    * произошел клик по полю выбора типа товара овоща или фрукта
    * выбор типа фрукт
    * подтверждаем что товар экзотичный
    * кликаем по кнопке cохранить
    * добавился товар "Ананас" с типом "Фрукт" экзотичный или нет "false"

    






