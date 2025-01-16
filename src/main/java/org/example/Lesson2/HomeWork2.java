package org.example.Lesson2;

public class HomeWork2 {
    /**
     * Предположим, вы разрабатываете какую-то игру в которой есть несколько объектов:
     * 1. Здание(имеет текущий уровень здоровья)
     * 2. Герой (имеет текущий уровень здоровья и текущий уровень маны)
     * 3. Крип (имеет текущий уровень здоровья)
     *
     * Также есть класс Render с методом showIndicatorOnDisplay, который срабатывает при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если объект обладает уровнем здоровья, то индикатор текущий уровень здоровья
     * 2. Если объект обладает уровнем маны, то индикатор маны
     *
     * В качестве урощения, пусть вывод на диспдей = запись информации в консоль
     *
     * Подсказка: Нужно 2 интерфейса на здоровье и маны
     * В классе Render проверять только на эти иртерфейсы и выводить информацию
     * Необходимо продумать, какие методы должны быть в интерфейсе.
     *
     * Что делать не нужно:
     * Нельзя завязываться на конкретном классе. Предполагается, что таких классов очень много и они постоянно добавляютя
     *
     */

    public static void main(String[] args) {

        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHp(50);

        render.showIndicatorOnDisplay(building);// В консоли должно быть так: Текущий уровень здоровья: 50

    }


    static class Render{
        public  void showIndicatorOnDisplay(Object object){
            // Реализовать пункты 1 и 2.

        }
    }


    static class Building{
        private int maxHp; // максимальное hp
        private int currentHp; // текущее количество здоровья

        public Building(int maxHp) {
            this.maxHp = maxHp;
            this.currentHp = maxHp;
        }

        public void setCurrentHp(int currentHp) {
            this.currentHp = currentHp;
        }
    }

    static class Hero{
        private int maxHp; // максимальное hp
        private int currentHp; // текущее количество здоровья

        private int maxMana; // максимальное hp
        private int currentMana; // текущее количество здоровья

        public Hero(int maxHp, int maxMana) {
            this.maxHp = maxHp;
            this.maxMana = maxMana;

            this.currentHp = maxHp;
            this.currentMana = maxMana;
        }

        public void setCurrentHp(int currentHp) {
            this.currentHp = currentHp;
        }

        public void setCurrentMana(int currentMana) {
            this.currentMana = currentMana;
        }
    }

    static class Crip{
        private int maxHp; // максимальное hp
        private int currentHp; // текущее количество здоровья

        public Crip(int maxHp) {
            this.maxHp = maxHp;
            this.currentHp = maxHp;
        }

        public void setCurrentHp(int currentHp) {
            this.currentHp = currentHp;
        }
    }

}
