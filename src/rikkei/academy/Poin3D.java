package rikkei.academy;

public class Poin3D extends Poin2D{
    private float z=0.0f;


    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Poin3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        setX(x);
        setZ(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr1={getX(),getY(),z};
        return arr1;
    }

    @Override
    public String toString() {
        return "Poin3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + z +
                '}';
    }
}
