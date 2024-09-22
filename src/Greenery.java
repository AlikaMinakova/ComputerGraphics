import java.awt.*;

public class Greenery {
    private int x;
    private int y;
    private int width;
    private int height;

    public Greenery(final int x, final int y, final int width, final int height) {
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

    public void polygonDraw(Graphics2D g, Color color, double[] coefX, double[] coefY, int nPoints) {
        g.setColor(color);
        int[] coordX = new int[nPoints + 1];
        int[] coordY = new int[nPoints + 1];
        for (int i = 0; i < nPoints; i++) {
            coordX[i] = (int) (this.x + coefX[i] * this.width);
            coordY[i] = (int) (this.y + coefY[i] * this.height);
        }
        g.fillPolygon(coordX, coordY, nPoints);
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //up line
        g.setColor(new Color(117, 173, 81));
        g.fillRect((int) (this.x + 0.5 * this.width), (int) (this.y + 0.656 * this.height), this.width, (int) (this.height * 0.01));
        //down line
        g.setColor(new Color(117, 173, 81));
        g.fillRect(this.x, (int) (this.y + 0.83 * this.height), (int) (0.6 * this.width), (int) (this.height * 0.01));

        //stem
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.08, 0.072, 0.1, 0.11, 0.08}, new double[]{0.83, 0.83, 0.92, 0.92, 0.83}, 5);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.47, 0.48, 0.61, 0.59, 0.47}, new double[]{0.83, 0.83, 0.92, 0.92, 0.83}, 5);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.9, 0.908, 0.908, 0.9, 0.9}, new double[]{0.656, 0.656, 0.6, 0.6, 0.656}, 5);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.9, 0.908, 0.85, 0.84, 0.9}, new double[]{0.656, 0.656, 0.6, 0.6, 0.656}, 5);

        //sheets
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.1, 0.16, 0.17, 0.1}, new double[]{0.9, 1, 1.25, 0.92}, 4);
        polygonDraw(g, new Color(23, 74, 40), new double[]{0.105, 0.08, 0.15, 0.105}, new double[]{0.9, 1.1, 1.25, 0.92}, 4);

        polygonDraw(g, new Color(23, 74, 40), new double[]{0.595, 0.6, 0.72, 0.595}, new double[]{0.91, 1.12, 1.25, 0.91}, 4);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.59, 0.7, 0.75, 0.59}, new double[]{0.908, 0.98, 1.25, 0.908}, 4);

        polygonDraw(g, new Color(23, 74, 40), new double[]{0.592, 0.7, 0.78, 0.592}, new double[]{0.835, 0.75, 0.835, 0.835}, 4);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.592, 0.7, 0.78, 0.592}, new double[]{0.83, 0.95, 0.87, 0.83}, 4);

        polygonDraw(g, new Color(23, 74, 40), new double[]{0.51, 0.42, 0.33, 0.51}, new double[]{0.658, 0.57, 0.6, 0.658}, 4);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.51, 0.42, 0.33, 0.51}, new double[]{0.658, 0.72, 0.65, 0.658}, 4);

        polygonDraw(g, new Color(23, 74, 40), new double[]{0.9, 0.95, 0.92, 0.9}, new double[]{0.62, 0.45, 0.3, 0.62}, 4);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.905, 0.85, 0.89, 0.905}, new double[]{0.627, 0.45, 0.3, 0.627}, 4);

        polygonDraw(g, new Color(23, 74, 40), new double[]{0.85, 0.8, 0.7, 0.85}, new double[]{0.6, 0.65, 0.55, 0.6}, 4);
        polygonDraw(g, new Color(117, 173, 81), new double[]{0.85, 0.8, 0.7, 0.85}, new double[]{0.6, 0.5, 0.5, 0.6}, 4);

    }
}

