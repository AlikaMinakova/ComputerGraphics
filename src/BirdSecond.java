import java.awt.*;

public class BirdSecond {
    private int x;
    private int y;
    private int width;
    private int height;
    private Turn turn = Turn.LEFT;

    public BirdSecond(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTurn() {
        turn = turn == Turn.LEFT ? Turn.RIGHT : Turn.LEFT;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        // хвост
        g.setColor(new Color(7, 9, 61));
        g.fillArc((int) (this.x + 0.125 * this.width), (int) (this.y + 0.5 * this.height),
                (int) (0.2 * this.width), (int) (0.3 * this.height), -90, 180);
        //грудь
        GradientPaint gradient = new GradientPaint((int)(this.x * 1.14),
                (int)(this.y * 1.45), new Color(254, 255, 176),
                (int) (this.x *  1.14 - 0.2 * this.width), (int) (this.y * 1.45 + 0.3 * this.height),
                new Color(255, 248, 38));
        g.setPaint(gradient);
        //g.setColor(new Color(250, 215, 87));
        g.fillArc((int) (this.x - 0.022 * this.width), (int) (this.y - 0.1 * this.height),
                (int) (0.5 * this.width), (int) (0.7 * this.height), -90, 90);
        //System.out.println(this.x + " " + this.y + " " + 0.5 * this.width+ " " +0.7 * this.height + " " );
        //крыло
        g.setColor(new Color(7, 9, 61));
        g.fillArc((int) (this.x + 0.076 * this.width), (int) (this.y + 0.25 * this.height),
                (int) (0.3 * this.width), (int) (0.4 * this.height), 90, 180);

        if (turn == Turn.LEFT) {
            //клюв
            GradientPaint gradient2 = new GradientPaint((int)(this.x * 1.24),
                    (int)(this.y * 1.1), new Color(234, 255, 0),
                    (int) (this.x *  1.26 - 0.2 * this.width), (int) (this.y + 0.3 * this.height),
                    new Color(245, 149, 39));
            g.setPaint(gradient2);
            g.fillArc((int) (this.x - 0.18 * this.width), (int) (this.y + 0.045 * this.height),
                    (int) (0.65 * this.width), (int) (0.41 * this.height), 0, 180);
            //head
            g.setColor(new Color(7, 9, 61));
            g.fillArc((int) (this.x - 0.03 * this.width), (int) (this.y + 0.05 * this.height),
                    (int) (0.5 * this.width), (int) (0.41 * this.height), 0, 90);
            //eye
            g.setPaint(gradient2);
            g.fillRoundRect((int) (this.x + 0.043 * this.width), (int) (this.y + 0.12 * height),
                    (int) (0.26 * this.width), (int) (0.08 * this.height), 30, 30);
            //зрачок
            g.setColor(new Color(7, 9, 61));
            g.fillOval((int) (this.x + 0.22 * this.width), (int) (this.y + 0.139 * height),
                    (int) (0.06 * this.width), (int) (0.05 * this.height));
        } else {
            GradientPaint gradient3 = new GradientPaint((int)(this.x * 1.53),
                    (int)(this.y * 1.1), new Color(234, 255, 0),
                    (int) (this.x *  1.23), (int) (this.y * 1.47),
                    new Color(245, 149, 39));
            g.setPaint(gradient3);
            //клюв
            g.fillArc((int) (this.x + 0.22 * this.width), (int) (this.y + 0.048 * this.height),
                    (int) (0.65 * this.width), (int) (0.41 * this.height), 0, 180);
            //head
            g.setColor(new Color(7, 9, 61));
            g.fillArc((int) (this.x + 0.22 * this.width), (int) (this.y + 0.05 * this.height),
                    (int) (0.5 * this.width), (int) (0.41 * this.height), 90, 90);
            //eye
            g.setPaint(gradient3);
            g.fillRoundRect((int) (this.x + 0.39 * this.width), (int) (this.y + 0.12 * height),
                    (int) (0.27 * this.width), (int) (0.08 * this.height), 30, 30);
            //зрачок
            g.setColor(new Color(7, 9, 61));
            g.fillOval((int) (this.x + 0.41 * this.width), (int) (this.y + 0.136 * height),
                    (int) (0.06 * this.width), (int) (0.05 * this.height));
        }

    }
}
