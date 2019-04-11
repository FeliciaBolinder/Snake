import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class GamePanel extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 500, HEIGHT = 500;

    private Thread thread;

    private boolean running;

    private BodyPart b;
    private ArrayList <BodyPart> snake;

    private int xCoor = 10, yCoor = 10, size = 5;

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));



        start();


    }

    public void start() {
    running = true;
    thread = new Thread(this);
    thread.start();
    }

    public void stop() {
    running = false;
     try {
         thread.join();

     } catch (InterruptedException e) {
         e.printStackTrace();
    }

    }

    public void tick() {

    }

    public void paint(Graphics g) {

        //Fill screen with backgroundcolor
        g.clearRect(0, 0, Width, HEIGHT);

        g.setColor(Color.BLACK);
        g.fillRect(0,0, WIDTH, HEIGHT);

        //"invisible" grid
        for (int i = 0; i < WIDTH / 10; i++) {
            g.drawLine(i * 10, 0, i * 10, HEIGHT);
        }

        for (int i = 0; i < HEIGHT / 10 ; i++) {
            g.drawLine(0, i * 10, HEIGHT, i * 10);
        }

        @Overide
        public void run () {
            while (running) {
                tick();
                repaint();

            }
        }

    }
}