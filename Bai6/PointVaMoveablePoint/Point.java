package Bai6.PointVaMoveablePoint;

public class Point {
    private float x = 0f;
    private float y = 0f;

    public Point() {
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] XY=new float[2];
        XY[0]=this.x;
        XY[1]=this.y;
        return XY;
    }
    public String toString(){
        return "x:"+this.x+", y:"+this.y;
    }
}
