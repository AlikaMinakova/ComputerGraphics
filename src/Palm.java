import java.awt.*;

public class Palm {
    private int x;
    private int y;
    private int width;
    private int height;

    public Palm(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        g.setColor(new Color(97, 49, 16));
        g.fillPolygon(new int[]{(int)(this.x), (int)(this.x + 0.15 * this.width), (int)(this.x + 0.07 * this.width), (int)(this.x)},
                new int[] {900, 900, this.y, 900}, 4);
        g.setColor(new Color(17, 97, 16));
        g.fillPolygon(new int[]{(int)(this.x + 0.07 * this.width), (int)(this.x - 0.1 * this.width),
                        (int)(this.x - 0.25 * this.width), (int)(this.x + 0.07 * this.width)},
                new int[] {this.y, (int)(this.y - 0.06 * this.height), this.y, this.y}, 4);
        g.fillPolygon(new int[]{(int)(this.x + 0.07 * this.width), (int)(this.x + 0.15 * this.width + 0.07 * this.width),
                        (int)(this.x + 0.35 * this.width + 0.07 * this.width), (int)(this.x + 0.07 * this.width)},
                new int[] {this.y, (int)(this.y - 0.06 * this.height), this.y, this.y}, 4);

        g.fillPolygon(new int[]{(int)(this.x + 0.07 * this.width), (int)(this.x),
                        (int)(this.x - 0.2 * this.width), (int)(this.x + 0.07 * this.width)},
                new int[] {this.y, (int)(this.y - 0.12 * this.height), (int)(this.y - 0.15 * this.height), this.y}, 4);
        g.fillPolygon(new int[]{(int)(this.x + 0.07 * this.width), (int)(this.x + 0.17 * this.width),
                        (int)(this.x + 0.35 * this.width), (int)(this.x + 0.07 * this.width)},
                new int[] {this.y, (int)(this.y - 0.12 * this.height), (int)(this.y - 0.15 * this.height), this.y}, 4);

        g.fillPolygon(new int[]{(int)(this.x + 0.07 * this.width), (int)(this.x + 0.05 * this.width),
                        (int)(this.x + 0.15 * this.width), (int)(this.x + 0.07 * this.width)},
                new int[] {this.y, (int)(this.y - 0.15 * this.height), (int)(this.y - 0.22 * this.height), this.y}, 4);

    }
}
