import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bug {
    private int cx;
    private int cy;
    private int width;
    private int height;
    private Integer state;
    private Map<Integer, List<Integer>> coords;

    public Bug(int x, int y, int width, int height, Integer state) {
        this.cx = x;
        this.cy = y;
        this.width = width;
        this.height = height;
        this.state = state;
        coords = new HashMap<>();
        coords.put(0, List.of(0, 200)); //1
        coords.put(3, List.of(500, 0)); //4
        coords.put(1, List.of(0, 600)); //2
        coords.put(2, List.of(100, 900)); //3
    }

    public int getX() {
        return cx;
    }

    public void setX() {
        if (this.cx >= 1000) {
            state = state == 3 ? 0 : state + 1;
            this.cx = coords.get(state).get(0);
            this.cy = coords.get(state).get(1);
            System.out.println(state);
        }
        switch (this.state) {
            case (0) -> this.cx += 31;
            case (1) -> this.cx += 30;
            case (2) -> this.cx += 7;
            case (3) -> this.cx += 20;
        }
    }

    public int getY() {
        return cy;
    }

    public void setY() {
        if (this.cy <= 0) {
            state = state == 3 ? 0 : state + 1;
            this.cx = coords.get(state).get(0);
            this.cy = coords.get(state).get(1);
            System.out.println(state);
        }
        switch (this.state) {
            case (0) -> this.cy -= 8;
            case (2) -> this.cy -= 30;
            case (3) -> this.cy += 10;
        }
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

        g.setColor(new Color(189, 226, 242));
        g.fillOval(this.cx + this.width / 4, (int) (this.cy - 0.8 * this.height), (int) (0.7 * this.width), this.height);
        g.setColor(new Color(36, 33, 31));
        g.fillOval((int) (this.cx + 0.3 * this.width), (int) (this.cy - 0.5 * this.height), this.width, (int) (this.height * 0.8));
        g.setColor(new Color(255, 255, 255));
        g.fillOval((int) (this.cx + this.width), this.cy - this.height / 2, this.width / 4, this.height / 4);

    }
}
