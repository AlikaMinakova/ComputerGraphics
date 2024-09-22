import java.awt.*;

public class Background {
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean morningPeriod = true;

    public Background(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public boolean getMorningPeriod() {
        return morningPeriod;
    }

    public void setMorningPeriod() {
        this.morningPeriod = !morningPeriod;
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
        GradientPaint gradient;

        if (morningPeriod) {
            gradient = new GradientPaint(this.x, this.y, new Color(92, 217, 255),
                    this.x, this.height, new Color(252, 182, 76));
        } else {
            gradient = new GradientPaint(this.x, this.y, new Color(94, 55, 250),
                    this.x, this.height, new Color(252, 182, 76));
        }
        //клюв
        g.setPaint(gradient);
        g.fillRect(this.x, this.y, this.width, this.height);

        g.setPaint(new Color(100, 127, 145));
        g.fillRect((int) (this.x), (int) (this.y + 0.9 * this.height),
                this.width, this.height);

        g.setPaint(new Color(36, 33, 31));
        g.fillRect((int) (this.x), (int) (this.y + 0.95 * this.height),
                this.width, this.height);
    }
}
