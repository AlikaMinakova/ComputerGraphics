import java.awt.*;

public class Cloudy {
    private int X;
    private int cx;
    private int y;
    private int width;
    private int height;

    public Cloudy(int x, int y, int width, int height) {
        this.X = x;
        this.cx = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX() {
        if (this.cx >= 1000){
            this.cx = -800;
        }
        this.cx += 1;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        g.setColor(new Color(228, 238, 242));

        g.fillOval(this.cx, this.y, this.width, this.height);
        g.fillOval((int)(this.cx - 0.2 * this.width), (int) (this.y + 0.5 * this.height),
                (int)(0.6 * this.width), (int)(0.6 * this.height));
        g.fillOval((int)(this.cx + 0.6 * this.width), (int) (this.y + 0.3 * this.height),
                (int)(0.8 * this.width), (int)(0.8 * this.height));

        g.fillOval((int)(this.cx + 3 * this.width), (int) (this.y - 0.5 * this.height),
                (int)(this.width), (int)(this.height));
        g.fillOval((int)(this.cx + 2.6 * this.width), (int) (this.y),
                (int)(this.width * 0.8 ), (int)(this.height * 0.8));
    }
}
