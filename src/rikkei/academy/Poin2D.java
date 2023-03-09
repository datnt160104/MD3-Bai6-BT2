package rikkei.academy;

public class Poin2D {
    private float x=0.0f;
    private float y=0.0f;

    public Poin2D() {
    }

    public Poin2D(float x, float y) {
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
    public  void  setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arr={x,y};
        return  arr;
    }

    @Override
    public String toString() {
        return "Poin2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
