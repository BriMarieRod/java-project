package project;

import javax.swing.JPanel;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

  public static final int X = (Main.PADDING * 2) + Score.WIDTH;
  public static final int Y = Main.PADDING;
  public static final int W = 14;
  public static final int H = 25;
  public static final int WIDTH = W * Block.SIZE;
  public static final int HEIGHT = H * Block.SIZE;
  public static int TIMER = 1;

  
  
  

  //I test = new I();
  I test = new I();

  Score score = new Score();
  Controls controls = new Controls();

  public Gameplay() {
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
  }
  

  public void paint(Graphics g) {
	  g.setColor(Color.BLUE);
	  g.fillRect(this.X - 5, this.Y - 5, this.WIDTH + 10, this.HEIGHT + 10);
	  g.setColor(Color.BLACK);
	  g.fillRect(this.X, this.Y, this.WIDTH, this.HEIGHT);

    //Block test = new Block(0, 0, Color.GREEN);
    //test.draw((Graphics2D)g);
    test.draw((Graphics2D)g);
    controls.draw((Graphics2D)g);
    score.draw((Graphics2D)g);
  }
  
  public void repaint(Graphics g) {
	  //I test = new I()
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
  
  public void well()
  {
	  int[][] well = new int[14][25];
	  int x = test.xPos;
	  int y = test.yPos;
	  if(well[x][y] != 1)
		  well[x][y] = 1;
	  else
		  well[x][y+1] = 1;
	  
  }
  
 
	

  
  
}
