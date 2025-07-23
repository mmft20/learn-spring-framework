package com.example.learn_spring_framework.game;

public class PacManGame  implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Pacman UP");
    }

    public void down() {
        System.out.println("Pacman Down");
    }

    public void right() {
        System.out.println("Pacman Right");
    }

    public void left() {
        System.out.println("Pacman Left");
    }
}
