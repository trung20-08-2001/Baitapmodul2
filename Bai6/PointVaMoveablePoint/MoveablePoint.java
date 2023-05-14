package Bai6.PointVaMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed=0f;
    private float ySpeed=0f;
   public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
       this.xSpeed=xSpeed;
       this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
       float[] XY=new float[2];
       XY[0]=this.xSpeed;
       XY[1]=this.ySpeed;
       return XY;
    }
    public  void move(){
       float currentX=super.getX();
       float currentY=super.getY();
       currentX+=this.xSpeed;
       currentY+=this.ySpeed;
       super.setX(currentX);
       super.setY(currentY);
    }
    public String toString(){
      return super.toString()+", xSpeed:"+this.xSpeed+", ySpeed:"+this.ySpeed;
    }
}
