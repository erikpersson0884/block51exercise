package shapes;

public class ShapeFactory {
    public static Triangle createTriangle(int x, int y, int sizeX, int sizeY, double rotation) {
        return new Triangle(x, y, sizeX, sizeY, rotation);
    }
    
    public static Triangle createTriangle(int x, int y, int sizeX, int sizeY) {
        return new Triangle(x, y, sizeX, sizeY);
    }
    
    public static Triangle createTriangle(int x, int y, double rotation) {
        return new Triangle(x, y, rotation);
    }
    
    public static Triangle createTriangle(int x, int y) {
        return new Triangle(x, y);
    }

    public static Rectangle createRectangle(int x, int y, int sizeX, int sizeY, double rotation){
        return new Rectangle(x, y, sizeX, sizeY, rotation);
    }
    public static Rectangle createRectangle(int x, int y, int sizeX, int sizeY){
        return new Rectangle(x, y, sizeX, sizeY);
    }
        public static Rectangle createRectangle(int x, int y, double rotation){
        return new Rectangle(x, y, rotation);
    }
    public static Rectangle createRectangle(int x, int y) {
        return new Rectangle(x, y);
    }


    public static Rectangle createSquare(int x, int y, int size, double rotation){
        return new Rectangle(x, y, size, size, rotation);
    }
    
    public static Rectangle createSquare(int x, int y, int size){
        return new Rectangle(x, y, size, size);
    }

    public static Rectangle createSquare(int x, int y, double rotation){
        return new Rectangle(x, y, rotation);
    }
    public static Rectangle createSquare(int x, int y) {
        return new Rectangle(x, y);
    }
}
