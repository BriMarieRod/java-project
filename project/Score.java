package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Score {

  public static final int X = Main.PADDING;
  public static final int Y = Main.PADDING;
  public static final int WIDTH = 250;
  public static final int HEIGHT = 200;

  public void draw(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(this.X, this.Y, this.WIDTH, this.HEIGHT);
    g.setColor(Color.BLACK);
    g.fillRect(this.X + 5, this.Y + 5, WIDTH - 10, HEIGHT - 10);
  }

}
