public class Main {

    public Main () {
    JFrame frame = new JFrame();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Snake");
    frame.setLocationRelativeTo(null);

    frame.pack();
    frame.setVisible(true);
    }
    public staic void main(String[] args) {

        new Main();
    }
}