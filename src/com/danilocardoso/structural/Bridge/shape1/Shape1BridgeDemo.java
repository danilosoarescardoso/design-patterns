package com.danilocardoso.structural.Bridge.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        Square greeSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greeSquare.applyColor();
    }

}
