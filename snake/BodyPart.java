public class BodyPart {
    private int xCoor, yCoor, height;

    public BodyPart(int xCoor, int yCoor, int titleSize) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        widht = titleSize;
        height = titleSize;
    }

    public void tick() {

    }

    public void draw(Grapghics g) {
    g.setColor(Color.Yellow);
    g.fillRect(xCoor * width, yCoor * height, width, height);
    }

    public in getxCoor() {
        return xCoor;
    }
    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public in getyCoor() {
        return yCoor;
    }
    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }
}