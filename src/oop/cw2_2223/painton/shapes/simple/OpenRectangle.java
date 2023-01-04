package oop.cw2_2223.painton.shapes.simple;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

import oop.cw2_2223.painton.shapes.AbstractLineBasedPaintableShape;

public class OpenRectangle extends AbstractLineBasedPaintableShape {

    public OpenRectangle(final JComponent imagePane) {
        super("Open Rectangle", imagePane);
    }

    @Override
    public void paint(final Graphics2D g) {
        g.setColor(getColorWithTransparency());
        final Dimension size = getSize();
        float thickness = 1;
        final String tv = (String) getPropertyValue(lineThicknessKey);
        if (tv != null) {
            try {
                thickness = Float.parseFloat(tv);
            } catch(final NumberFormatException x) {
            }
        }
        final BasicStroke stroke = new BasicStroke(thickness);
        g.setStroke(stroke);
        g.draw(new Rectangle(0, 0, size.width, size.height));
    }

}
