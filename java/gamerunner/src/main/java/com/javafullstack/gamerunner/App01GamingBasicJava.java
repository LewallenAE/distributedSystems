package com.javafullstack.gamerunner;

public class App01GamingBasicJava {


    public static void main(String[] args) {

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacManGame(); //1: Object creation
        var gameRunner = new GameRunner(game); //2: Object Creation and wiring of dependencies
        // Game is a dependency


        gameRunner.run();




    } // end main
}
