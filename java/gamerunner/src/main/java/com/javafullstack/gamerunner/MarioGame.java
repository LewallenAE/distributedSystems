package com.javafullstack.gamerunner;

public class MarioGame implements GamingConsole{

    public void up() {
        System.out.println("Mario Jumps");
    }

    public void down() {
        System.out.println("Mario Ducks!");
    }

    public void left() {
        System.out.println("Mario moves left");
    }

    public void right() {
        System.out.println("Mario moves right");
    }
}
