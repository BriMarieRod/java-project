package project;

import java.awt.Color;
import java.awt.Graphics2D;

public class Block {

  public final int GAME_X = 350;
  public final int GAME_Y = 20;

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
    g.setColor(color);
    g.fillRect((xPos * SIZE) + GAME_X, (yPos * SIZE) + GAME_Y, SIZE, SIZE);
    g.setColor(color.darker());
    g.drawRect((xPos * SIZE) + GAME_X, (yPos * SIZE) + GAME_Y, SIZE, SIZE);
  }

}
