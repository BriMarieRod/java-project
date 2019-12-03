package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class I extends Tetromino {

  private int xPos;
  private int yPos;
  public Color color = Color.CYAN;
  public Block[] block = new Block[4];

  public I(int x, int y) {
    xPos = x;
    yPos = y;
    for(int i = 0; i < 4; i++) {
      block[i] = new Block(xPos, yPos + i, color);
    }
  }

  public int getXPos() {
    return xPos;
  }
  public int getYPos() {
    return yPos;
  }

  public void setXPos(int x) {
    xPos = x;
  }
  public void setYPos(int y) {
    yPos = y;
  }

  public void rotate() {
    //TODO
  }

  public void draw(Graphics2D g) {
    for(Block b: block) {
      b.draw(g);
    }
  }

}
