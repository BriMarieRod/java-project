package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class J extends Tetromino {

  int xPos;
  int yPos;
  public Color color = Color.BLUE;
  public Block[] block = new Block[4];
  private boolean horizontal;

  public J() {
	  xPos = 5;
	    yPos = 0;
	    horizontal = true;
	    for(int i = 0; i < 3; i++) {
	      block[0] = new Block(xPos, yPos, color);
	      block[i+1] = new Block(xPos + i, yPos + 1, color);
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
		  {
			    for(int i = 0; i < 3; i++) {
				      block[0] = new Block(xPos, yPos, color);
				      block[i+1] = new Block(xPos + i, yPos + 1, color);
	      
	    }
	    for(Block b: block) {
	      b.draw(g);
	    }
		  }
	  }


}
