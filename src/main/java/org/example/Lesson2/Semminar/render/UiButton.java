package org.example.Lesson2.Semminar.render;

import java.awt.*;

public class UiButton implements Hoverable{
    private int x;
    private int y;


    public UiButton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void click(){
        // Срабатывает при нажатии на кнопку
    }

    @Override
    public void makeHover() {

    }

    @Override
    public void unmakeHover() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
