package polygons.polygon;

public class PolygonFactory {
    public static Triangle createTriangle(int x, int y) {
        return new Triangle(x, y);
    }

    public static Rectangle createRectangle(int x, int y) {
        return new Rectangle(x, y);
    }

    public static Square createSquare(int x, int y) {
        return new Square(x, y);
    }
}
