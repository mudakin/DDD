package ddd;

import javax.swing.JFrame;

public class Main extends JFrame {
    
    private static final int WIDTH = 800; // Width of the JFrame
    private static final int HEIGHT = 600; // Height of the JFrame

    public Main() {
        setTitle("Pong");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        add(new PongPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
