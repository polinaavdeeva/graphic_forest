package ru.vsu.cs.avdeeva_p_a;

import java.awt.*;

public class Sun {
    private int x, y, n, l, r;
    private Color c;

    public Sun(int x, int y, int n, int l, int r, Color c) {
        this.x = x;
        this.y = y;
        this.n = n;
        this.l = l;
        this.r = r;
        this.c = c;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setL(int l) {
        this.l = l;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw (Graphics2D g) {
        DrawUtils.drawSun(g,x,y,r,l,n,c);
    }
}

