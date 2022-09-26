package ru.vsu.cs.avdeeva_p_a;

import javax.swing.*;
import java.awt.*;

public class MainWindow  extends JFrame {
    private DrawPanel dp;

    public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800,600);
        dp = new DrawPanel(getWidth(), getHeight(), 100);
        this.add(dp);
    }

}
