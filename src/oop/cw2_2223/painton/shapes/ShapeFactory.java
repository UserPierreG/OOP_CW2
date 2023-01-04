package oop.cw2_2223.painton.shapes;

import oop.cw2_2223.painton.ImagePane;
import oop.cw2_2223.painton.shapes.compound.BoundedOval;
import oop.cw2_2223.painton.shapes.compound.BoundedRectangle;
import oop.cw2_2223.painton.shapes.compound.TextOval;
import oop.cw2_2223.painton.shapes.compound.TextRectangle;
import oop.cw2_2223.painton.shapes.simple.*;

import java.util.ArrayList;
import java.util.List;



public class ShapeFactory {

    private static List<String> menu = new ArrayList<>();

    public static PaintableShape shapeFactory(String shapeName, ImagePane canvas) {
        switch (shapeName) {
            case "Open Oval":
                return new OpenOval(canvas);
            case "Filled Oval":
                return new FilledOval(canvas);
            case "Bounded Oval":
                return new BoundedOval(canvas);
            case "Text":
                return new TextShape(canvas);
            case "Text Oval":
                return new TextOval(canvas);
            case "Image":
                return new ImageShape(canvas);
            case "Filled Rectangle":
                return new FilledRectangle(canvas);
            case "Open Rectangle":
                return new OpenRectangle(canvas);
            case "Bounded Rectangle":
                return new BoundedRectangle(canvas);
            case "Text Rectangle":
                return new TextRectangle(canvas);
            default:
                throw new IllegalArgumentException("Error shape: " + shapeName);
        }
    }
    public static List<String> getMenu(){
        menu.add("Open Oval");
        menu.add("Filled Oval");
        menu.add("Bounded Oval");
        menu.add("Text");
        menu.add("Text Oval");
        menu.add("Image");
        menu.add("Filled Rectangle");
        menu.add("Open Rectangle");
        menu.add("Bounded Rectangle");
        menu.add("Text Rectangle");
        return menu;
    }


}