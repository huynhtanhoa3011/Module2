package KeThua;

public class Point {
    private float x = 0;
    private float y = 0;

    public Point () {
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
    public void setXY(float x, float  y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY () {
        float[]f = new float[2];
        f[0] = x;
        f[1] = y;
        return f;
    }
    public String toString() {
        return "("+ x +","+ y +")";
    }
}
