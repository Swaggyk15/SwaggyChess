package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter {

    public int x, y; // to store mouse coordinates
    public boolean pressed; // to check if the mouse is pressed


    @Override
    public void mousePressed(MouseEvent e) {
        pressed = true; // set pressed to true when mouse is pressed
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        pressed = false; // set pressed to false when mouse is released
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX(); // update x coordinate while dragging
        y = e.getY(); // update y coordinate while dragging
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX(); // update x coordinate when mouse is moved
        y = e.getY(); // update y coordinate when mouse is moved
    }
}
