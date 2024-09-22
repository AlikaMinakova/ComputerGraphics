import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class MainWindow extends JFrame{
    private final DrawPanel panel;

    public MainWindow() throws HeadlessException {
        panel = new DrawPanel(this.getWidth(), this.getHeight(), 100);
        this.add(panel);
    }
}
