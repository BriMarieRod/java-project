package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Controls {

  public static final int X = Main.PADDING;
  public static final int Y = (Main.PADDING * 2) + Score.HEIGHT;
  public static final int WIDTH = Score.WIDTH;
  public static final int HEIGHT = (Gameplay.HEIGHT) - (Score.HEIGHT + Main.PADDING);

  public void draw(Graphics g) {
    g.setColor(Color.BLUE);
    //g.fillRect(this.X, this.Y, this.WIDTH, this.HEIGHT);
    g.fillRect(this.X, this.Y, this.WIDTH, this.HEIGHT);
  }

}
