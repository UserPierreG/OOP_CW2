package oop.cw2_2223.painton.shapes.simple;

import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import oop.cw2_2223.painton.shapes.AbstractColoredPaintableShape;

public class FilledRectangle extends AbstractColoredPaintableShape {

    public FilledRectangle(final JComponent imagePane) {
        super("Filled Rectangle", imagePane);
    }

    @Override
    public void paint(final Graphics2D g) {
        g.setColor(getColorWithTransparency());
        final Dimension size = getSize();
        g.fillRect(0, 0, size.width, size.height);
    }

}
