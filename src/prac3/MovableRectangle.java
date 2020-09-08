package prac3;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        if(this.equals(xSpeed, ySpeed)){
            topLeft = new MovablePoint(x1,y1,xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        }
        else{
            topLeft = new MovablePoint(x1,y1,xSpeed+ySpeed, ySpeed+xSpeed);
        }
    }

    private boolean equals(int xSpeed, int ySpeed){
        return xSpeed==ySpeed;
    }
    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.bottomRight.moveDown();
        this.topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
    this.topLeft.moveRight();
    this.bottomRight.moveRight();
    }
}
