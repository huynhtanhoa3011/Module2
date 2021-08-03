package KeThua;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] f = new float[3];
        f[0] = getX();
        f[1] = getY();
        f[2] = getZ();
        return f;
    }
    @Override
    public String toString () {
        return "("+ getX() +","+ getY() +","+ z +")";
    }
}
