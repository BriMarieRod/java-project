package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class I extends Tetromino {

  private int xPos;
  private int yPos;
  public Color color = Color.CYAN;
  public Block[] block = new Block[4];

  public I() {
    xPos = 5;
    yPos = 0;
    for(int i = 0; i < 4; i++) {
      block[i] = new Block(xPos + i, yPos, color);
    }
  }

  public void moveLeft() {
    if(xPos > 0) {
      xPos -= 1;
    }
  }

  public void moveRight() {
    if(true && xPos < 10) { //TODO ONLY IF BLOCK IS HORIZONTAL
      xPos += 1;
    }
  }

  public void rotateLeft() {
    //TODO
  }

  public void rotateRight() {
    //TODO
  }

  public void draw(Graphics2D g) {
    if(true) { //TODO only draw the blocks this way if I is horizontal
      for(int i = 0; i < 4; i++) {
        block[i].xPos = this.xPos + i;
      }
    }
    for(Block b: block) {
      b.draw(g);
    }
  }

}
