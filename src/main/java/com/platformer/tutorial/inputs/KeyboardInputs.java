package com.platformer.tutorial.inputs;

import com.platformer.tutorial.game.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("W");
                break;
            case KeyEvent.VK_A:
                System.out.println("A");
                break;

            case KeyEvent.VK_S:
                System.out.println("S");
                break;

            case KeyEvent.VK_D:
                System.out.println("D");
                break;
        }
    }
}
