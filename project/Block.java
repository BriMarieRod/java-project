package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Block {

  public int xPos;
  public int yPos;
  public Color color;

  public Block(int x, int y, Color c) {
    xPos = x;
    yPos = y;
    color = c;
  }

  public void draw(Graphics2D g) {
    g.setColor(this.color);
    g.fillRect(xPos, yPos, 20, 20);
    //TODO Draw border around blocks
  }

}
