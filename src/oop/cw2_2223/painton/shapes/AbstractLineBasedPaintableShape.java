package oop.cw2_2223.painton.shapes;

import oop.cw2_2223.painton.shapes.configui.PropertyKey;
import oop.cw2_2223.painton.shapes.configui.PropertyKey.PropertyType;

import javax.swing.*;

public abstract class AbstractLineBasedPaintableShape extends AbstractColoredPaintableShape {

  public static PropertyKey lineThicknessKey = new PropertyKey("Line thickness",PropertyType.STRING);

  public AbstractLineBasedPaintableShape(final String name, JComponent imagePane) {
    super(name, imagePane);
    setPropertyValue(lineThicknessKey, "10");
  }

}
