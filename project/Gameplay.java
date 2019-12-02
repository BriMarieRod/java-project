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

  public int x = 50;
  public int y = 50;

  public Gameplay() {
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
  }

  public void paint(Graphics g) {
    g.setColor(Color.black);
    g.fillRect(x, y, 300, 500);

    Block test = new Block(0+x, 0+y, Color.green);
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
