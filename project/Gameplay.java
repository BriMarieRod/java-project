package project;

import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

  public static final int X = 350;
  public static final int Y = 20;

  public Gameplay() {
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
  }

  public void paint(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(X, Y, 300, 500);

    //Block test = new Block(0, 0, Color.GREEN);
    //test.draw((Graphics2D)g);
    I test = new I(0, 0);
    test.draw((Graphics2D)g);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    //TODO
  }

  @Override
  public void keyTyped(KeyEvent e) {
    //TODO
  }

  @Override
  public void keyPressed(KeyEvent e) {
    //TODO
  }

  @Override
  public void keyReleased(KeyEvent e) {
    //TODO
  }

}
