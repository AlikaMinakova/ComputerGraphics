import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.PrimitiveIterator;
import java.util.stream.Stream;
import java.util.List;

public class DrawPanel extends JPanel implements ActionListener, MouseListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;

    private Background background;
    private BirdFirst birdFirst;
    private BirdSecond birdSecond;
    private Greenery greenery;
    private Palm palm1;
    private Palm palm2;
    private Palm palm3;
    private Bug bug1;
    private Bug bug2;
    private Bug bug3;
    private Bug bug4;
    private Cloudy cloudy1;


    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        super.addMouseListener(this);
        timer = new Timer(timerDelay, this);
        timer.start();

        this.background = new Background(0, 0, 1000, 900);
        this.birdFirst = new BirdFirst(160, 200, 380, 430);
        this.birdSecond = new BirdSecond(530, 200, 330, 380);
        this.greenery = new Greenery(0, 100, 1000, 500);
        this.palm1 = new Palm(100, 450, 500, 450);
        this.palm2 = new Palm(350, 650, 600, 450);
        this.palm3 = new Palm(860, 200, 600, 450);
        this.bug1 = new Bug(0, 200, 10, 10, 0);
        this.bug2 = new Bug(0, 500, 10, 10, 3);
        this.bug3 = new Bug(0, 200, 10, 10, 2);
        this.bug4 = new Bug(0, 500, 10, 10, 1);
        this.cloudy1 = new Cloudy(150, 60, 200, 80);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        background.draw(gr);
        cloudy1.draw(gr);
        palm1.draw(gr);
        palm2.draw(gr);
        palm3.draw(gr);
        bug1.draw(gr);
        bug2.draw(gr);
        if (!background.getMorningPeriod()){
            bug3.draw(gr);
            bug4.draw(gr);
        }
        birdSecond.draw(gr);
        greenery.draw(gr);
        birdFirst.draw(gr);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            if (ticksFromStart % 23 == 0) {
                birdSecond.setTurn();
            } else if (ticksFromStart % 37 == 0) {
                birdFirst.setTurn();
            }
            bug1.setX();
            bug1.setY();
            bug2.setX();
            bug2.setY();
            if (!background.getMorningPeriod()){
                bug3.setX();
                bug3.setY();
                bug4.setX();
                bug4.setY();
            }
            cloudy1.setX();
            ++ticksFromStart;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        background.setMorningPeriod();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}