package project;

import java.awt.Graphics2D;
import java.awt.Color;

abstract class Tetromino {

  abstract int getXPos();
  abstract int getYPos();

  abstract void setXPos(int x);
  abstract void setYPos(int y);

  abstract void rotateLeft();
  abstract void rotateRight();

  abstract void draw(Graphics2D g);

}
