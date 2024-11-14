package main;

import java.awt.*;

public class Board {

    final int MAX_COL = 8; // max number of columns
    final int MAX_ROW = 8; // max number of rows

    public static final int SQUARE_SIZE = 75; // size of each square on the board
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE/2; // half the size of a square

    public void draw(Graphics2D g2){
        int c = 0; // variable to alternate square colors

        for (int row = 0; row < MAX_ROW; row++) { // loop through each row
            for (int col = 0; col < MAX_COL; col++) { // loop through each column

                if (c == 0) { // if c is 0 use this color
                    g2.setColor(new Color(254, 251, 234));
                    c = 1; // switch to the other color
                } else { // if c is 1 use this color
                    g2.setColor(new Color(107, 63, 160));
                    c = 0; // switch back to the first color
                }

                // fill the rectangle to draw the square on the board
                g2.fillRect(col*SQUARE_SIZE, row*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }

            // after finishing a row switch the starting color for the next row
            if (c == 0) c = 1; else { c = 0; }

        }
    }
}
