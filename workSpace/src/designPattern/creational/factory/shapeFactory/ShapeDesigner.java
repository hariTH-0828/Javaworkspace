package workSpace.src.designPattern.creational.factory.shapeFactory;

public class ShapeDesigner {

    public Draw getDesign(Design design) {
        if(design.equals(Design.CIRCLE)){
            return new Circle();
        }

        if(design.equals(Design.TRIANGLE)) {
            return new Triangle();
        }

        if(design.equals(Design.RECTANGLE)) {
            return new Rectangle();
        }

        return null;
    }
}
