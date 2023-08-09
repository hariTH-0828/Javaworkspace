package workSpace.src.designPattern.creational.factory.shapeFactory;


public class ShapeFactory {

    public static void main(String[] args) {
        ShapeDesigner shapeDesigner = new ShapeDesigner();
        Draw myDesign = shapeDesigner.getDesign(Design.CIRCLE);
        myDesign.draw();
    }
}
