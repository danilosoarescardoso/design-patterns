package com.danilocardoso.structural.Bridge.shape2;

import com.danilocardoso.structural.Bridge.shape2.Circle;

public class Shape2BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);
        Color red = new Red();
        Shape circle = new Circle(red);

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();

    }
}
