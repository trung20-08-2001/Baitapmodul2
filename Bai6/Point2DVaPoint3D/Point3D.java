package Bai6.Point2DVaPoint3D;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0]=getX();
        XYZ[1]=getY();
        XYZ[2]=this.z;
        return XYZ;
    }

    @Override
    public String toString() {
        return super.toString()+" z:"+this.z;
    }
}
