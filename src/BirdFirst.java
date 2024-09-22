import java.awt.*;

public class BirdFirst {
    private int x;
    private int y;
    private int width;
    private int height;
    private Turn turn = Turn.RIGHT;

    public BirdFirst(final int x, final int y, final int width, final int height) {
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

        //крыло
        g.setColor(new Color(7, 9, 61));
        g.fillArc((int) (this.x + 0.076 * this.width), (int) (this.y + 0.093 * this.height),
                (int) (0.7 * this.width), (int) (0.7 * this.height), 250, 70);
        // хвост
        g.setColor(new Color(7, 9, 61));
        g.fillArc((int) (this.x + 0.65 * this.width), (int) (this.y + 0.64 * this.height),
                (int) (0.25 * this.width), (int) (0.2 * this.height), 133, 180);
        //грудь
        GradientPaint gradient = new GradientPaint(this.x * 2,
                this.y * 2, new Color(202, 102, 227),
                (int) (this.x * 2 - 0.2 * this.width), (int) (this.y * 2 + 0.3 * this.height),
                new Color(50, 144, 199));
        g.setPaint(gradient);
        g.fillArc((int) (this.x + 0.126 * this.width), (int) (this.y + 0.086 * this.height),
                (int) (0.6 * this.width), (int) (0.72 * this.height), 180, 68);

        if (turn == Turn.LEFT) {
            GradientPaint gradient3 = new GradientPaint((int)(this.x * 1.7),
                    (int)(this.y * 1.6), new Color(88, 191, 73),
                    (int) (this.x *  1.5 - 0.2 * this.width), (int) (this.y * 1.6 + 0.3 * this.height),
                    new Color(50, 144, 199));
            //клюв
            g.setPaint(gradient3);
            g.fillArc((int) (this.x - 0.23 * this.width), (int) (this.y + 0.24 * this.height),
                    (int) (0.65 * this.width), (int) (0.41 * this.height), 0, 180);
            g.setColor(new Color(235, 91, 47));
            //head
            g.setColor(new Color(7, 9, 61));
            g.fillArc((int) (this.x - 0.16 * this.width), (int) (this.y + 0.24 * this.height),
                    (int) (0.587 * this.width), (int) (0.41 * this.height), 0, 90);
            //eye
            g.setPaint(gradient3);
            g.fillRoundRect((int) (this.x - 0.05 * this.width), (int) (this.y + 0.3 * height),
                    (int) (0.26 * this.width), (int) (0.08 * this.height), 30, 30);
            //зрачок
            g.setColor(new Color(7, 9, 61));
            g.fillOval((int) (this.x + 0.14 * this.width), (int) (this.y + 0.315 * height),
                    (int) (0.06 * this.width), (int) (0.05 * this.height));
        } else {
            //клюв
            GradientPaint gradient2 = new GradientPaint((int)(this.x * 1.7),
                    (int)(this.y * 1.6), new Color(88, 191, 73),
                    (int) (this.x *  1.5 + 0.2 * this.width), (int) (this.y * 1.6 + 0.3 * this.height),
                    new Color(50, 144, 199));

            g.setPaint(gradient2);
            g.fillArc((int) (this.x + 0.13 * this.width), (int) (this.y + 0.24 * this.height),
                    (int) (0.65 * this.width), (int) (0.41 * this.height), 0, 180);
            g.setColor(new Color(235, 91, 47));
            //head
            g.setColor(new Color(7, 9, 61));
            g.fillArc((int) (this.x + 0.125 * this.width), (int) (this.y + 0.24 * this.height),
                    (int) (0.587 * this.width), (int) (0.41 * this.height), 90, 90);
            //eye
            g.setPaint(gradient2);
            g.fillRoundRect((int) (this.x + 0.34 * this.width), (int) (this.y + 0.3 * height),
                    (int) (0.15 * this.width), (int) (0.08 * this.height), 30, 30);
            //зрачок
            g.setColor(new Color(7, 9, 61));
            g.fillOval((int) (this.x + 0.35 * this.width), (int) (this.y + 0.315 * height),
                    (int) (0.06 * this.width), (int) (0.05 * this.height));
        }
    }
}
