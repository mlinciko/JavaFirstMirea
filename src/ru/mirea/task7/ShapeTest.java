package ru.mirea.task7;

public class ShapeTest {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        circle1.setColor("blue");
        circle1.setFilled(true);
        circle1.setRadius(13.4);
        System.out.println("CIRCLE: "+circle1);
        MovableCircle moveCircle = new MovableCircle(2,1,1,1, 5);
        moveCircle.moveUp();
        System.out.println(moveCircle);
        Rectangle rect1 = new Rectangle(12.1, 4.8, "red", true );
        System.out.println("RECTANGLE: "+rect1);
        Square square1 = new Square(12);
        square1.setColor("green");
        square1.setFilled(false);
        System.out.println("SQUARE: "+square1);
    }
}
interface Movable{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        this.x = 0;
        this.y = 0;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public String toString(){
        return "x: "+this.x +", y: "+this.y+", xSpeed: " +this.xSpeed+", ySpeed: "+this.ySpeed;
    }
    public void moveUp(){
        this.y = y + ySpeed;
    }
    public void moveDown(){
        this.y = y - ySpeed;
    }
    public void moveLeft(){
        this.x = x - xSpeed;
    }
    public void moveRight(){
        this.x = x + xSpeed;
    }
}
class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center = new MovablePoint();
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }
    public String toString(){
        return "New position: "+center.x+", "+center.y;
    }
    public void moveUp(){
        center.y = center.y + center.ySpeed;
    }
    public void moveDown(){
        center.y = center.y - center.ySpeed;
    }
    public void moveLeft(){
        center.x = center.x - center.xSpeed;
    }
    public void moveRight(){
        center.x = center.x + center.xSpeed;
    }
}
class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    public String toString(){
        return "New position: "+topLeft.x +", "+topLeft.y +"; "+bottomRight.x+", "+bottomRight.y;
    }
    public void moveUp(){
        topLeft.y += ySpeed;
        bottomRight.y += ySpeed;
    }
    public void moveDown(){
        topLeft.y -= ySpeed;
        bottomRight.y -= ySpeed;
    }
    public void moveLeft(){
        topLeft.x -= xSpeed;
        bottomRight.y -= ySpeed;
    }
    public void moveRight(){
        topLeft.x += xSpeed;
        bottomRight.y += ySpeed;
    }
}
