import javax.swing.JFrame;

public class Snake {

    public Snake () {
    JFrame frame = new JFrame();
    GamePanel gamepanel = new GamePanel();

        frame.add(gamepanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snake");


        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public static void snake(String[] args) {

        new Snake();
    }
}