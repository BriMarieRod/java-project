package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;

public class Score {

  public static final int X = Main.PADDING;
  public static final int Y = Main.PADDING;
  public static final int WIDTH = 250;
  public static final int HEIGHT = 200;

  public void draw(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(this.X, this.Y, this.WIDTH, this.HEIGHT);
    g.setColor(Color.WHITE);
    g.setFont(new Font("SansSerif", Font.BOLD, 30));
    g.drawString("Score", this.X + 80, this.Y + 50);
    g.drawString(Integer.toString(Gameplay.points), this.X + 115, this.Y + 120);
  }

}
