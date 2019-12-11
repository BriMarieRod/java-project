package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TextArea;

public class Controls {

  public static final int X = Main.PADDING;
  public static final int Y = (Main.PADDING * 2) + Score.HEIGHT;
  public static final int WIDTH = Score.WIDTH;
  public static final int HEIGHT = (Gameplay.HEIGHT) - (Score.HEIGHT + Main.PADDING);

  public void draw(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(this.X, this.Y, this.WIDTH, this.HEIGHT);
    g.setColor(Color.WHITE);
    int lineHeight = g.getFont().getSize() + 5;
    String[] controls = {
      "Controls",
      "Move Left: Left Arrow",
      "Move Right: Right Arrow",
      "Move Down: Down Arrow",
      "Rotate Left: Z",
      "Rotate Right: C"
    };
    for(int i = 0; i < controls.length; i++) {
      g.drawString(controls[i], this.X + 5, this.Y + (i+1)*lineHeight);
    }
  }

}
