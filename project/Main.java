package project;

import javax.swing.JFrame;

public class Main {

  public static final int PADDING = 50;

  public static final int WIDTH = Score.WIDTH + Gameplay.WIDTH + (PADDING * 3) + 5;
  public static final int HEIGHT = Gameplay.HEIGHT + (PADDING * 2) + 25;

  public static void main(String[] args) {

    JFrame frame = new JFrame();
    Gameplay game = new Gameplay();

    frame.setSize(Main.WIDTH, Main.HEIGHT);
    frame.setLocationRelativeTo(null);
    frame.setTitle("Tetris");
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(game);

  }

}
