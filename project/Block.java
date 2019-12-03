package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Block {

  public int xPos;
  public int yPos;
  public Color color;
  public final int SIZE = 20;

  public Block(int x, int y, Color c) {
    xPos = x;
    yPos = y;
    color = c;
  }

  public void draw(Graphics2D g) {
    //System.out.println("Drawing Block");
    g.setColor(this.color);
    g.fillRect(xPos * SIZE, yPos * SIZE, SIZE, SIZE);
    //TODO Draw border around blocks
  }

}
