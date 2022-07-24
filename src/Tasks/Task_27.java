package Tasks;

// Задание: Создать иерархию классов, описывающую банковские карточки. Иерархия должна иметь
// хотя бы 3 уровня.

abstract class BankCard { // Класс - банковская карта
    String material;
    abstract void giveMoney(); // метод - выдать деньги
}
abstract class CardPlastic extends BankCard { // Класс - пластиковая карта
    abstract void insertCard(); // метод - вставить карту
}
abstract class CardVirtual extends BankCard { // Класс - виртуальная карта
    abstract void logIn(); // метод - войдите в личный кабинет
}

class GiveMoneyPlast extends CardPlastic {

    public GiveMoneyPlast(String material) {
        this.material = material;
    }

    @Override
    void insertCard() {
        System.out.println("You inserted a card"); // Вставьте карту
    }

    @Override
    void giveMoney() {
        System.out.println("Take the money"); // Заберите деньги
    }
}

public class Task_27 {

    public static void main(String[] args) {

        GiveMoneyPlast card = new GiveMoneyPlast("Plastic");
        card.insertCard();
        card.giveMoney();
    }
}
