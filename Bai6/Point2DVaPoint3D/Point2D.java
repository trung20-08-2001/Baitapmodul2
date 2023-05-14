package Bai6.Point2DVaPoint3D;

public class Point2D {
    private float x = 0f;
    private float y = 0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] XY = new float[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }

    @Override
    public String toString() {
        return "x:" + this.x + ", y:" + this.y;
    }
}
