package com.example.lesson2.Homework;

import java.sql.SQLOutput;

public class Homework {

    /**
     * Предположим, вы разрабатываете какую-то игру в которой есть несколько типов объектов:
     * 1. Зание(здоровье)
     * 2. Герой(здоровье, мана)
     * 3. Нейтральный персонаж (здоровье)
     *
     * Также есть класс Render с методом showIndicatorOnDisplay, который срабатывает при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если обьект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья
     * 2. Если обьект обладает уровнем маны, то отображается индикатор с текущим уровнем маны
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     *
     * Нельзя завязываться на конкретные здания и т.п
     * Нужно ввести 2 интерфейса: наличие здоровья и наличие маны
     * В классе render проверять только на эти интерфейсы и выводить информацию
     * Необходимо продумать, какие методы должны быть в интерфейсе
     *
     *Что делать не нужно:
     * Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много
     *
     */

    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHp(50);
        render.showIndicator(building);

        Hero hero = new Hero(100, 100);
        render.showIndicator(hero);




    }

    static class Render{

        /**
         * 1. Если обьект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья
         * 2. Если обьект обладает уровнем маны, то отображается индикатор с текущим уровнем маны
         * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
         */

        public void showIndicator(Object object){
            String name = object.getClass().getSimpleName();

            if (object instanceof HasHp){
                HasHp hasHp = (HasHp) object;
                System.out.println(name);
                System.out.println(" Текущий уровень здоровья: " + hasHp.getCurrentHp() + ", " + " максимальный: " +hasHp.getMaxHp());
            }
            if (object instanceof HasMana) {
                HasMana hasMana = (HasMana) object;
                System.out.println("Текущий уровень маны: " + hasMana.getCurrentMana() + ", " + " максимальный: " +hasMana.getMaxMana());
            }
        }

    }

    static class Building implements HasHp{
        private int maxHp;
        private int currentHp;

        public Building(int maxHp) {
            this.maxHp = maxHp;
            this.currentHp = maxHp;
        }

        public void setCurrentHp(int currentHp) {
            this.currentHp = currentHp;
        }

        @Override
        public int getMaxHp() {
            return maxHp;
        }

        @Override
        public int getCurrentHp() {
            return currentHp;
        }
    }

    static class Hero implements HasHp, HasMana{
        private int maxHp;
        private int currentHp;

        private int maxMana;
        private int currentMana;

        public Hero(int maxHp, int maxMana) {
            this.maxHp = maxHp;
            this.currentHp = maxHp;

            this.maxMana = maxMana;
            this.currentMana = maxMana;
        }

        public void setCurrentHp(int currentHp) {
            this.currentHp = currentHp;
        }

        public void setCurrentMana(int currentMana) {
            this.currentMana = currentMana;
        }

        @Override
        public int getMaxHp() {
            return maxHp;
        }

        @Override
        public int getCurrentHp() {
            return currentHp;
        }

        @Override
        public int getMaxMana() {
            return maxMana;
        }

        @Override
        public int getCurrentMana() {
            return currentMana;
        }

        // FIXME: Дописать нужное
    }

    static class NPC{
        private int maxHp;
        private int currentHp;

        public NPC(int maxHp) {
            this.maxHp = maxHp;
            this.currentHp = maxHp;
        }

        public void setCurrentHp(int currentHp) {
            this.currentHp = currentHp;
        }

        // FIXME: Дописать нужное
    }

}
