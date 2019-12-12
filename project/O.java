package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class O extends Tetromino {

  int xPos;
  int yPos;
  private boolean horizontal;
  public Color color = Color.YELLOW;
  public Block[] block = new Block[4];

  public O() {
	  xPos = 5;
	    yPos = 0;
	    horizontal = true;
	    for(int i = 0; i < 2; i++) {
	      block[i] = new Block(xPos + i, yPos, color);
	      block[i+1] = new Block(xPos , yPos+i, color);
	      block[i+2] = new Block(xPos + i, yPos + i, color);
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
			  for(int i = 0; i < 2; i++) {
			      block[i] = new Block(xPos + i, yPos, color);
			      block[i+1] = new Block(xPos , yPos+i, color);
			      block[i+2] = new Block(xPos + i, yPos + i, color);
	      
	    }
	    for(Block b: block) {
	      b.draw(g);
	    }
		  }
	  }

	}

