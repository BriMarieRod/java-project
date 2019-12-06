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
  public static final int WIDTH = 14;
  public static final int HEIGHT = 25;

  I test = new I();

  public Gameplay() {
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
  }

  public void paint(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(X, Y, WIDTH * Block.SIZE, HEIGHT * Block.SIZE);

    //Block test = new Block(0, 0, Color.GREEN);
    //test.draw((Graphics2D)g);
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
    switch(e.getKeyCode()) {
      case KeyEvent.VK_DOWN:
        test.moveDown();
        break;
      case KeyEvent.VK_LEFT:
        test.moveLeft();
        break;
      case KeyEvent.VK_RIGHT:
        test.moveRight();
        break;
      case KeyEvent.VK_Z:
        test.rotateLeft();
        break;
      case KeyEvent.VK_C:
        test.rotateRight();
        break;
    }
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {
    //TODO
  }

}
