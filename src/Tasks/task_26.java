package Tasks;

//Задание: Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов.
// Часть из них включить в розетку.

abstract class Appliances { // создаём родительский класс
    public String name;
    abstract void plugIn(); // создаём в нем метод, включающий в розетку
}

abstract class LargeHomeAppliances extends Appliances {} // Абстрактный класс - Крупная бытовая техника

class IceBox extends LargeHomeAppliances{ //Обычный Класс - Холодильник
  public IceBox(String name) {
      this.name = name;
  }
    @Override // переопеределяем метод, включающий в розетку
    public void plugIn() {
        System.out.println(name + " plugged in");
    }
}

public class task_26 {
    public static void main(String[] args) {
        Appliances iceBox = new IceBox ("IceBox");
        iceBox.plugIn();
    }
}
