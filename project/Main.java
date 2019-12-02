package project;

import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {

    JFrame frame = new JFrame();
    Gameplay game = new Gameplay();

    frame.setBounds(70, 70, 700, 600);
    frame.setTitle("Tetris");
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(game);

  }

}