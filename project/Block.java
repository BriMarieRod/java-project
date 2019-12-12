package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Block {

  public int xPos;
  public int yPos;
  public Color color;
  public static final int SIZE = 20;

  public Block(int x, int y, Color c) {
    xPos = x;
    yPos = y;
    color = c;
  }

  public void setX(int x) {
    xPos = x;
  }

  public void setY(int y) {
    yPos = y;
  }

  public void draw(Graphics2D g) {
    //System.out.println("Drawing Block");
    g.setColor(color);
    g.fillRect((xPos * SIZE) + Gameplay.X, (yPos * SIZE) + Gameplay.Y, SIZE, SIZE);
    g.setColor(color.darker());
    g.drawRect((xPos * SIZE) + Gameplay.X, (yPos * SIZE) + Gameplay.Y, SIZE, SIZE);
  }

}
