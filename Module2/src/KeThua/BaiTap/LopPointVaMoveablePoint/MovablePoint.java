package KeThua.BaiTap.LopPointVaMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed=0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
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
    public float[] getXYSpeed(float xSpeed, float ySpeed) {
        float[] arraySpeed={xSpeed,ySpeed};
        return arraySpeed;
    }

    public void setXYSpeed(float xSpeed,float ySpeed) {
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+
                " xSpeed= " + xSpeed +
                " ySpeed= " + ySpeed ;
    }
    public String  move(){
        super.setX(getX()+this.xSpeed);
        super.setY(getY()+this.ySpeed);
        return  "x= " + getX() +
                " y= " + getY();
    }
}
