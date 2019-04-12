import javax.swing.JFrame;

public class snakeGame {

    public snakeGame() {

        JFrame frame = new JFrame();
        gamePanel gamepanel = new gamePanel();

        frame.add(gamepanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SNAKECODING");

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        new snakeGame();
    }
}