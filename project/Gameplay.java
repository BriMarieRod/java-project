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
  private Color[][] well;
  
  

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
  
  private void init() {
		well = new Color[12][24];
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 23; j++) {
				if (i == 0 || i == 11 || j == 22) {
					well[i][j] = Color.GRAY;
				} else {
					well[i][j] = Color.BLACK;
				}
			}
		}
		
	}
  
  private boolean collidesAt(int x, int y) {
		for (int i = 0; i < 99999; i++) {
			if (well[x + x][y + y] != Color.BLACK) {
				return true;
			}
		}
		return false;
	}
  
  public void dropDown() {
		if (!collidesAt(test.xPos, test.yPos + 1)) {
			test.yPos += 1;
		} else {
			
		}	
		repaint();
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
