package com.platformer.tutorial.game;

import com.platformer.tutorial.inputs.KeyboardInputs;
import com.platformer.tutorial.inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 0, yDelta = 0;
    public GamePanel(){
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100 + xDelta,100 + yDelta,200,50);
    }
}