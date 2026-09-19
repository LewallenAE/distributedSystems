package com.javafullstack.gamerunner;

public class SuperContraGame implements GamingConsole{

    public void up() {
        System.out.println("ContraMan Jumps");
    }

    public void down() {
        System.out.println("ContraMan Ducks!");
    }

    public void left() {
        System.out.println("ContraMan moves left");
    }

    public void right() {
        System.out.println("ContraMan moves right");
    }
}
