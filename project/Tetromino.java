package project;

import java.awt.Graphics2D;
import java.awt.Color;

abstract class Tetromino {

  abstract void moveLeft();
  abstract void moveRight();

  abstract void rotateLeft();
  abstract void rotateRight();

  abstract void draw(Graphics2D g);

}
