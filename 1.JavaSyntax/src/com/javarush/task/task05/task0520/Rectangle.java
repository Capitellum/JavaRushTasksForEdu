package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle (int top){
        this.top = top;
        this.left = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle (int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle (Rectangle anotherRectangle){
        this.top = anotherRectangle.top;
        this.left = anotherRectangle.left;
        this.height = anotherRectangle.height;
        this.width = anotherRectangle.width;
    }

    public static void main(String[] args) {

    }
}
