package ru.vsu.cs.avdeeva_p_a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DrawPanel extends JPanel implements ActionListener {
    public static final Random random = new Random();
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private final Timer timer;
    private int ticksFromStart = 0;
    private final Sun sun;
    private final CurlyTree curlyTree;
    private final CurlyTree secondCurlyTree;
    private final FurTree furTree;
    private final FurTree secondFurTree;
    private final CurlyTree thirdCurlyTree;
    private final Cloud cloud;
    private final Cloud secondCloud;
    private final WarningSigns warningSigns;
    private final Mushroom[] mushrooms;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        sun = new Sun(600, 70, 20, 20, 40, Color.yellow);
        curlyTree = new CurlyTree(640, 355, 70, 36, 150, Color.decode("#90B77D"));
        secondCurlyTree = new CurlyTree(400, 300, 70, 36, 150, Color.decode("#90B77D"));
        furTree = new FurTree(200, 300, 36, 150, Color.decode("#3D8361"));
        secondFurTree = new FurTree(500, 380, 36, 150, Color.decode("#3D8361"));
        thirdCurlyTree = new CurlyTree(60, 370, 70, 36, 150, Color.decode("#90B77D"));
        cloud = new Cloud(300, 100, 70, Color.white);
        secondCloud = new Cloud(600, 10, 70, Color.white);
        warningSigns = new WarningSigns(153, 465, 10, 90, Color.decode("#CA955C"));
        mushrooms = new Mushroom[random.nextInt(20) + 10];

        for (int i = 0; i < mushrooms.length; i++) {
            int randomX = random.nextInt(800);
            int randomY = random.nextInt(430) + 350;

            mushrooms[i] = new Mushroom(randomX, randomY, 35, 10, 15, Color.decode("#EB1D36"));
        }

    }


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        //sky
        gr.setColor(new Color(171, 217, 255));
        gr.fillRect(0, 0, getWidth(), getHeight());

        //grass
        gr.setColor(new Color(198, 235, 197));
        gr.fillRect(0, getHeight() - 200, getWidth(), getHeight());

        sun.draw(gr);

        //mushrooms

        for (Mushroom mushroom : mushrooms) {
            mushroom.draw(gr);
        }

        curlyTree.draw(gr);
        secondCurlyTree.draw(gr);
        furTree.draw(gr);
        secondFurTree.draw(gr);
        thirdCurlyTree.draw(gr);
        warningSigns.draw(gr);

        cloud.setX(ticksFromStart);
        cloud.draw(gr);

        secondCloud.setX(ticksFromStart + 300);
        secondCloud.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ticksFromStart += 2;
        }
    }
}
