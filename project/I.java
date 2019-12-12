package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class I extends Tetromino {

  public int xPos;
  public int yPos;
  public boolean horizontal;
  public Color color = Color.CYAN;
  public Block[] block = new Block[4];

  public I() {
    xPos = 5;
    yPos = 0;
    horizontal = true;
    for(int i = 0; i < 4; i++) {
      block[i] = new Block(xPos + i, yPos, color);
    }
  }

  @Override
  public void moveDown() {
    if((horizontal && yPos < 24) || yPos < 21) {
      yPos += 1;
    }
  }

  @Override
  public void moveLeft() {
    if(xPos > 0) {
      xPos -= 1;
    }
  }

  @Override
  public void moveRight() {
    if(horizontal && xPos < 10) {
      xPos += 1;
    } else if(!horizontal && xPos < 13) {
      xPos += 1;
    }
  }

  public void rotate() {
    horizontal = !horizontal;
    if(xPos > 9) {
      xPos = 10;
    }
  }

  @Override
  public void rotateLeft() {
    rotate();
  }

  @Override
  public void rotateRight() {
    rotate();
  }

  @Override
  public void draw(Graphics2D g) {
    if(horizontal) {
      for(int i = 0; i < 4; i++) {
        block[i].xPos = this.xPos + i;
        block[i].yPos = this.yPos;
      }
    } else {
      for(int i = 0; i < 4; i++) {
        block[i].xPos = this.xPos;
        if(this.yPos > 20) {
          block[i].yPos = this.yPos + i - (this.yPos - 21);
        } else {
          block[i].yPos = this.yPos + i;
        }
      }
    }
    for(Block b: block) {
      b.draw(g);
    }
  }

}
